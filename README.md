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
- [화면구성](#화면구성)
- [ERD](#ERD)
- [보완할 점](#보완할-점)
- [느낀점](#느낀점)

## 프로젝트 소개
### 개요
인기 있는 이상형 월드컵 사이트를 참고하여 만든 웹 애플리케이션입니다.  
사용자들이 토너먼트 방식을 통해 선호도를 선택하며 게임을 즐길 수 있고, 
자신만의 월드컵을 만들어 다른 사용자와 공유할 수 있는 기능을 제공합니다.

### 주요 기능
- 이상형 월드컵 등록
사용자가 원하는 주제로 자신만의 월드컵을 생성할 수 있습니다. 간단한 이미지 추가로 게임을 손쉽게 등록할 수 있습니다.
- 댓글 소통
각 월드컵 게임에 댓글을 남길 수 있어 사용자 간 의견을 공유하고 소통할 수 있습니다. 좋아하는 선택지나 게임에 대한 생각을 바로 표현할 수 있습니다.
- 참여 및 최종 승자 결정
사용자는 등록된 게임에 참여해 선호도를 바탕으로 최종 승자를 선택하며, 결과를 즉시 확인할 수 있습니다.
- 통계 및 정렬
월드컵 게임 결과에 대한 통계를 제공하며, 다양한 기준으로 정렬할 수 있어 데이터를 효율적으로 확인할 수 있습니다.
- 다양한 주제
음식, 영화, 캐릭터 등 다양한 주제를 다루며 사용자에게 재미와 흥미를 선사합니다.

### 팀원 소개 및 담당 업무
- 이학석(팀장) : 프로젝트 셋팅 및 관리, 월드컵 만들기 구현, 테스트 및 오류 수정 [<img src="https://img.shields.io/badge/Git-이학석-red?logo=GITHUb">](https://github.com/HSLee1013)
- 이강호 : [<img src="https://img.shields.io/badge/Git-이강호-green?logo=GITHUb">](https://github.com/LeeKangHo1) 
- 임영록 :  [<img src="https://img.shields.io/badge/Git-임영록-blue?logo=GITHUb">](https://github.com/Young14482) 
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
### 백엔드
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"><img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">

### 프론트엔드
<img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white"><img src="https://img.shields.io/badge/Visual Studio Code-1E8CBE?style=for-the-badge&logo=Visual Studio Code&logoColor=white"><img src="https://img.shields.io/badge/mustache-FF880F?style=for-the-badge&logo=mustache&logoColor=white"><img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white"><img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css&logoColor=white">

### IDE
<img src="https://img.shields.io/badge/intellijidea-000000?style=for-the-badge&logo=intellijidea&logoColor=white">

### 협업도구
<img src="https://img.shields.io/badge/postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white"><img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"><img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"><img src="https://img.shields.io/badge/slack-4A154B?style=for-the-badge&logo=slack&logoColor=white"><img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">

### 데이터베이스
<img src="https://img.shields.io/badge/H2-FF4000?style=for-the-badge&logo=H2&logoColor=white">

### Dependencies
```
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-aop'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-jdbc'
    implementation 'org.springframework.boot:spring-boot-starter-mustache'
    implementation 'org.springframework.boot:spring-boot-starter-security'
    implementation 'org.springframework.boot:spring-boot-starter-validation'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    compileOnly 'org.projectlombok:lombok'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    runtimeOnly 'com.h2database:h2'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    testImplementation 'org.springframework.security:spring-security-test'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}
```
<br>

## 화면구성
![image](https://github.com/user-attachments/assets/d1ebc0c7-d41b-497c-87d6-fe82d7abea34)

<br>

## ERD
![image](https://github.com/user-attachments/assets/94fc18b4-3713-4bbf-9b9e-19c7830d2d53)

<br>

## 보완할 점
- 소셜 로그인
- 비로그인시 월드컵 게임/랭킹보기
- 게임 이어하기
- 신고하기
- 관리자 페이지

<br>

## 트러블 슈팅

<br>

## 느낀점
### 이학석

### 이강호

### 임영록

### 구예은
