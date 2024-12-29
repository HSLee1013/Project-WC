<h1 align="center">
  이상형 월드컵 프로젝트
</h1>
<p align="center">
  <img src="https://github.com/user-attachments/assets/042778ff-b7ff-48e0-9442-fdee3f957e68">
</p>

## 목차
- [프로젝트 소개](#프로젝트-소개)
- [시연 영상](#시연-영상)
- [구현 기능](#구현-기능)
- [기술스택](#기술스택)
- [사이트맵](#사이트맵)
- [ERD](#ERD)
- [보완할 점](#보완할-점)
- [트러블 슈팅](#트러블-슈팅)
- [느낀점](#느낀점)

## 프로젝트 소개
### 개요
인기 있는 이상형 월드컵 사이트를 참고하여 만든 웹 애플리케이션입니다. 
사용자들이 토너먼트 방식을 통해 선호도를 선택하며 게임을 즐길 수 있고,
자신만의 월드컵을 만들어 다른 사용자와 공유할 수 있는 기능을 제공합니다.

### 주요 기능
- 이상형 월드컵 등록<br>
사용자가 원하는 주제로 자신만의 월드컵을 생성할 수 있습니다. 간단한 이미지 추가로 게임을 손쉽게 등록할 수 있습니다.
- 댓글 소통<br>
각 월드컵 게임에 댓글을 남길 수 있어 사용자 간 의견을 공유하고 소통할 수 있습니다. 좋아하는 선택지나 게임에 대한 생각을 바로 표현할 수 있습니다.
- 참여 및 최종 승자 결정<br>
사용자는 등록된 게임에 참여해 선호도를 바탕으로 최종 승자를 선택하며, 결과를 즉시 확인할 수 있습니다.
- 통계 및 정렬<br>
월드컵 게임 결과에 대한 통계를 제공하며, 다양한 기준으로 정렬할 수 있어 데이터를 효율적으로 확인할 수 있습니다.
- 다양한 주제<br>
음식, 영화, 캐릭터 등 다양한 주제를 다루며 사용자에게 재미와 흥미를 선사합니다.

### 팀원 소개 및 담당 업무
- 이학석(팀장) : 프로젝트 셋팅 및 관리, 월드컵 만들기 구현, 테스트 및 오류 수정 [<img src="https://img.shields.io/badge/Git-이학석-red?logo=GITHUb">](https://github.com/HSLee1013)
- 이강호 : 메인 화면(월드컵 목록 보기, 정렬, 검색), 댓글 관련 기능 구현 [<img src="https://img.shields.io/badge/Git-이강호-green?logo=GITHUb">](https://github.com/LeeKangHo1) 
- 임영록 : 게임 시작전 설정 페이지 화면 및 기능 구현, 게임 플레이 화면 및 기능 구현 [<img src="https://img.shields.io/badge/Git-임영록-blue?logo=GITHUb">](https://github.com/Young14482) 
- 구예은 : 유저 기능 구현 [<img src="https://img.shields.io/badge/Git-구예은-orange?logo=GITHUb">](https://github.com/goho11)

### 프로젝트 기간
2024년 12월 2일 ~ 2024년 12월 18일
<br>

## 시연 영상
https://github.com/user-attachments/assets/bf41954b-0794-49dc-a8c0-cf4de64ad952

<br>

## 주요기능
### 유저 관련 기능
- 로그인, 로그아웃
- 로그인 시 상단 메뉴 변경
- 개인정보 수정
- 회원탈퇴

### 월드컵 아이템 API 기능
- 이미지 목록 로드 : 서버에서 이미지 목록 동적 로딩
- 정렬/검색 : 이름, 우승비율, 승률 정렬 및 검색
- 페이지네이션 : 목록을 페이지로 나눠서 표시

### 월드컵 목록 기능
- 인기순, 최신순 정렬
- 월드컵 제목 검색

### 월드컵 만들기 기능
- DropZone 이미지 업로드 : 드래그 앤 드롭으로 이미지 추가/변경
- 비동기 통신 : 월드컵 정보 및 이미지 수정

### 월드컵 게임 기능
- 두 이미지 중 선택된 이미지만 승리
- 클릭 시 승자와 패자 데이터를 숨겨진 폼에 설정
- 데이터를 서버에 제출하여 다음 라운드 진행

### 댓글 기능
- 댓글을 달 경우 우승자 이름도 기록
- 본인 댓글 삭제
<br>

## 기술 스택
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white"><img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"><img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white"><img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white"><img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css&logoColor=white"><img src="https://img.shields.io/badge/mustache-FF880F?style=for-the-badge&logo=mustache&logoColor=white"><img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white"><img src="https://img.shields.io/badge/postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white">

### IDE
<img src="https://img.shields.io/badge/intellijidea-000000?style=for-the-badge&logo=intellijidea&logoColor=white"><img src="https://img.shields.io/badge/Visual Studio Code-1E8CBE?style=for-the-badge&logo=Visual Studio Code&logoColor=white">

### 협업도구
<img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"><img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"><img src="https://img.shields.io/badge/slack-4A154B?style=for-the-badge&logo=slack&logoColor=white"><img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white"><img src="https://img.shields.io/badge/Discord-7289DA?style=for-the-badge&logo=discord&logoColor=white" alt="Discord"/>

### 데이터베이스
<img src="https://img.shields.io/badge/H2-FF4000?style=for-the-badge&logo=H2&logoColor=white"><img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL"/>
<br>

## 사이트맵
![image](https://github.com/user-attachments/assets/e6ee8a32-7a59-4877-96fb-6aad5b065888)

<br>

## ERD
![image](https://github.com/user-attachments/assets/1012962c-7555-4db1-b365-3203d151c3dc)

<br>

## 보완할 점
- 소셜 로그인
- 비로그인시 월드컵 게임/랭킹보기
- 게임 이어하기
- 신고하기
- 관리자 페이지

<br>

## 트러블 슈팅
### Mustache.js를 적용하려다 실패한 사례
* 문제 상황<br>
프로젝트에서 동적으로 데이터를 렌더링해야 하는 요구사항이 있었습니다. 서버에서 기본 데이터를 제공한 뒤, 클라이언트에서 추가적으로 템플릿을 렌더링하거나 업데이트하는 방식이 필요했습니다. 이 과정에서 클라이언트 사이드 렌더링 라이브러리인 Mustache.js를 사용해 템플릿을 처리하려 했습니다.

* 시도한 방법<br>
1. Mustache.js 라이브러리 추가<br>
cdnjs를 통해 Mustache.js 라이브러리를 HTML 파일에 추가했습니다.
```
<script src="https://cdnjs.cloudflare.com/ajax/libs/mustache.js/4.2.0/mustache.min.js"></script>
```
2. HTML 템플릿 작성<br>
클라이언트 사이드에서 동적으로 데이터를 렌더링하기 위해 Mustache 템플릿을 작성했습니다.
```
<script id="template" type="x-tmpl-mustache">
    <div>
        {{title}} - {{description}}
    </div>
</script>
```
3. JavaScript를 통한 렌더링 시도<br>
서버에서 제공된 데이터를 받아 Mustache.js로 렌더링하려고 했습니다.
```
const template = document.getElementById('template').innerHTML;
const data = { title: "Sample Title", description: "This is a sample description." };
const rendered = Mustache.render(template, data);
document.getElementById('output').innerHTML = rendered;
```
4. Mustache.js의 렌더링 결과 확인<br>
렌더링 결과를 HTML의 특정 영역에 삽입하고자 했습니다.
```
<div id="output"></div>
```
* 실패 원인<br>
Mustache.js는 클라이언트 사이드 렌더링에 초점이 맞춰진 라이브러리로, 서버에서 이미 렌더링된 데이터를 클라이언트에서 다시 수정하거나 업데이트하는 데에는 추가적인 작업이 필요했습니다. 이 프로젝트는 Spring Boot 기반의 SSR(Server-Side Rendering) 프로젝트였고, 서버에서 이미 Mustache 템플릿 엔진을 사용하여 HTML을 렌더링하고 있었습니다.

1. SSR과 CSR 간의 충돌<br>
서버에서 Mustache를 사용해 HTML을 렌더링한 뒤, 클라이언트에서 Mustache.js로 같은 데이터를 다시 렌더링하려다 보니 중복된 렌더링 과정이 발생했습니다.

2. 데이터 동기화 문제<br>
클라이언트 사이드에서 렌더링하려면 서버에서 JSON 데이터를 제공해야 했지만, 기존 서버 구조는 JSON 데이터를 반환하도록 설계되지 않았습니다. 이로 인해 클라이언트와 서버 간의 데이터 동기화가 어려웠습니다.

3. 불필요한 복잡성<br>
클라이언트와 서버 모두 Mustache를 사용하는 방식은 유지보수성과 개발 효율성에서 좋지 않은 선택으로 판단되었습니다.

### 최종 해결 방법
* 서버 사이드에서 HTML을 완전히 렌더링한 뒤 클라이언트로 전송하는 방식을 유지하기로 결정했습니다.
* 클라이언트에서 필요한 동적인 데이터 처리는 JavaScript DOM 조작으로 해결했습니다.
* 추가로 동적인 렌더링이 필요한 경우, Spring Boot의 Mustache 엔진을 활용해 JSON 데이터를 렌더링하거나, Ajax 요청과 함께 서버에서 새로운 HTML 블록을 반환받아 클라이언트에 삽입하는 방식을 채택했습니다.

### 교훈
1. SSR 프로젝트에서는 CSR 렌더링 라이브러리의 필요성을 신중히 검토<br>
서버에서 이미 템플릿 엔진을 사용 중이라면 클라이언트 사이드 렌더링 라이브러리를 추가하는 것은 프로젝트 구조를 복잡하게 만들 수 있습니다.

2. 프로젝트의 렌더링 방식 일관성 유지<br>
서버와 클라이언트 간의 렌더링 책임을 명확히 구분하여, 불필요한 중복 작업을 방지해야 합니다.

3. 필요에 맞는 도구를 선택<br>
Mustache.js는 SPA(Single Page Application)나 클라이언트 중심의 CSR 프로젝트에서 적합하며, SSR 중심의 Spring Boot 프로젝트에서는 서버 사이드 Mustache 템플릿 엔진을 활용하는 것이 더 적합하다는 결론에 도달했습니다.

<br>

## 느낀점
### 이학석
- 이번 프로젝트는 큰 그림을 그리고 체계적으로 설계하며 시작했지만, 일부 완성하지 못한 부분이 있어 아쉬움이 남는다.
- 비록 현재는 부족한 부분이 있지만, 혼자서라도 계획했던 모든 것을 구현하여 프로젝트를 완성할 것이다.
### 이강호
- response.body에서 데이터를 가져와야 하는데 response에서 가져 오는 바람에 2~3시간 날리는 등 어처구니 없는 실수에 시간을 많이 뺐긴 점이 아쉽습니다.
- 시큐리티 같은 프레임워크를 쓰려면 안의 로직이 어떻게 되는지 알아야 커스텀이 가능했기에 공부가 많이 되었습니다.
### 임영록
- 이전 프로젝트에서는 팀원들과 진행하며 불편한 부분에만 규칙을 정하는 방식이었다. 그러나 이번에는 메소드명, 변수명, 브랜치명 등 체계적인 컨벤션과 규칙을 정해 프로젝트를 진행했다. 초반에는 다소 불편했지만, 이를 통해 협업 능력을 키우는 유익한 경험을 얻을 수 있었다.
### 구예은
- 담당한 부분에 기능을 추가 구현하지 못해 아쉬웠지만, 기본 구현 이해도를 높일 수 있었다.

