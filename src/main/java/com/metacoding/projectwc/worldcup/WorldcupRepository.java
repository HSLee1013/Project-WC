package com.metacoding.projectwc.worldcup;

import com.metacoding.projectwc._core.error.ex.APIException404;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class WorldcupRepository  {
    private final EntityManager entityManager;


    public Worldcup save(Worldcup worldcup) {
        entityManager.persist(worldcup);
        return worldcup;
    }

    public Optional<Worldcup> findById(int id) {
        return Optional.ofNullable(entityManager.find(Worldcup.class, id));
    }

    public int findGamesCompletedById(int id) {
        Query query = entityManager.createQuery("select w.gamesCompleted from Worldcup w where w.id=:id");
        query.setParameter("id", id);
        try {
            return (Integer) query.getSingleResult();
        }catch (NoResultException e) {
            throw new APIException404("월드컵을 찾을 수 없습니다.");
        }
    }

    public List<Worldcup> findAllByTitle(String searchKeyword, String sortBy, Integer offset, Integer limit) {
        String jpql = "SELECT w FROM Worldcup w WHERE w.title LIKE :searchKeyword AND w.visibility = 1 AND w.isDeleted = false ORDER BY w." + sortBy + " DESC, w.id DESC";
        TypedQuery<Worldcup> query = entityManager.createQuery(jpql, Worldcup.class)
                .setParameter("searchKeyword", "%" + searchKeyword + "%");

        // 적용할 오프셋 및 리미트 설정
        query.setFirstResult(offset);
        query.setMaxResults(limit);

        return query.getResultList();
    }

    public List<Worldcup> findAllByTitleAndUser(String searchKeyword, String sortBy, Integer offset, Integer limit, Integer userId) {
        String jpql = "SELECT w FROM Worldcup w WHERE w.title LIKE :searchKeyword AND w.isDeleted = false AND w.user.id = :userId ORDER BY w." + sortBy + " DESC, w.id DESC";

        TypedQuery<Worldcup> query = entityManager.createQuery(jpql, Worldcup.class)
                .setParameter("searchKeyword", "%" + searchKeyword + "%")
                .setParameter("userId", userId);

        // 적용할 오프셋 및 리미트 설정
        query.setFirstResult(offset);
        query.setMaxResults(limit);

        return query.getResultList();
    }

    public Integer countAllWorldcup(String searchKeyword) {
        // 검색 조건에 맞는 전체 항목 수를 계산하는 JPQL 쿼리를 작성합니다.
        String jpql = "SELECT COUNT(w) FROM Worldcup w WHERE w.title LIKE :searchKeyword AND w.visibility = 1 AND w.isDeleted = false";
        return entityManager.createQuery(jpql, Long.class)
                .setParameter("searchKeyword", "%" + searchKeyword + "%")
                .getSingleResult()
                .intValue();
    }

    public Integer countAllWorldcupByUser(String searchKeyword, Integer userId) {
        // 검색 조건에 맞는 전체 항목 수를 계산하는 JPQL 쿼리를 작성합니다.
        String jpql = "SELECT COUNT(w) FROM Worldcup w WHERE w.title LIKE :searchKeyword AND w.visibility = 1 AND w.isDeleted = false AND w.user.id = :userId ";
        return entityManager.createQuery(jpql, Long.class)
                .setParameter("searchKeyword", "%" + searchKeyword + "%")
                .setParameter("userId", userId)
                .getSingleResult()
                .intValue();
    }


}
