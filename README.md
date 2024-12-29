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

