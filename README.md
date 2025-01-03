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
- [기술스택](#기술-스택)
- [사이트맵](#사이트맵)
- [ERD](#ERD)
- [보완할 점](#보완할-점)
- [프로젝트 진행](#프로젝트-진행)
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

## 구현 기능
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
![사이트맵](https://github.com/user-attachments/assets/e6ee8a32-7a59-4877-96fb-6aad5b065888)

<br>

## ERD
![ERD](https://github.com/user-attachments/assets/4d2e82e9-ba59-4949-902e-a9d1f3b038b4)

<br>

## 프로젝트 진행

### 일정 관리
![일정 관리](https://github.com/user-attachments/assets/4bf1e7fc-6d6a-44f7-93ea-7e6ecbb8334a)

### 팀 노션 관리
![팀 노션 문서 관리](https://github.com/user-attachments/assets/806f2e39-e107-4d31-a123-ff465c173ddf)

<br>

## 보완할 점
- 소셜 로그인
- 비로그인시 월드컵 게임/랭킹보기
- 게임 이어하기
- 신고하기
- 관리자 페이지
- 배포

<br>

## 트러블 슈팅

### 새로운 Dropzone 생성 시 인식 불가
#### 1. 문제 발생

![image](https://github.com/user-attachments/assets/6303f601-f46d-438c-b2c9-747b384cb520)
- dropzone을 하나 추가했으나 인식이 안되고 그냥 흰 박스만 생겼다.
- Dropzone.discover() 메서드를 사용하여 시도해봤으나 해결되지 않았다.

#### 2. 대안으로 해결
1. input 태그로 처리

![image](https://github.com/user-attachments/assets/bdb2fb08-c471-4e98-8920-f19b0d800ff6)
- \<input type=”file”\> 태그를 사용하는 방식으로 해결하는 방법을 생각했다.
- 이미지를 추가하는 것과 다른 방법을 통한 입력이라 마음이 들지 않는다.
2. 이미지 업로드와 수정을 나눔
  
![image](https://github.com/user-attachments/assets/75f49d62-e79b-47d8-8e58-599e3f3cf968)
- dropzone을 추가하지 않고 처음부터 로딩했을 때 사용하면 잘 작동되어 이미지 수정을 나눠서 페이지를 만든다.
- 이 방법은 다른 사이트들과 같은 방법으로 차별성을 주지 못해 마음에 들지 않는다.

#### 3. 해결
- 다시 한번 문서를 꼼꼼히 읽어 본 결과 Dropzone 클래스를 인스턴스화하여 명령형으로 Dropzone을 생성해야 했다.
- dropzone을 생성할 때 마다 클래스를 만들어줘야 인식이 가능하였다.
- 클래스의 이름을 다르게하여 각각의 dropzone마다 url을 다르게 줄 수 있다.
```JavaScript
let dropzone2 = new Dropzone(".my-dropzone-" + dropIndex, {
        url: "http://localhost:8080/test/" + dropIndex,
        method: "put",
    }
);
dropIndex++;
```
- 라이브러리의 작동원리를 정확하게 파악하지 못해서 발생한 문제로 문서를 꼼꼼히 읽어봐야 한다는 것을 느꼈다.

## 느낀점
- 팀장으로서 처음 프로젝트를 전체적으로 설정하고 구조를 설계하는 일이 부담스러웠지만, 책임감을 가지고 팀원들이 쉽게 이해할 수 있도록 노력했다. 덕분에 팀원들이 구조를 잘 따라와 주었고, 이를 통해 뿌듯함을 느꼈다.

- 팀 컨벤션을 만들어 작업하면서 리베이스하거나 팀원들의 코드를 리뷰할 때 이전 프로젝트보다 훨씬 이해하기 쉬웠다. 변수명이나 클래스명을 정하는 데에도 큰 도움이 되었다.

- 외부 라이브러리를 사용할 때 문서를 꼼꼼히 읽고 프로젝트에 적용하는 방법을 이번 기회를 통해 제대로 배울 수 있었다.
