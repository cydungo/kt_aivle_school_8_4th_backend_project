## 📌 KT AIVLE School 8기 4차 미니프로젝트 – Backend

  Spring Boot 기반 백엔드 API 서버 프로젝트입니다.<br>
  프론트엔드(Vite + React)와 연동되며, REST API를 제공하는 역할을 수행합니다.

## 👥 Team Structure

  PM : 조유송 <br>
  Backend : 나도요, 나성곤, 정성호<br>
  Frontend : 이정민, 이동규, 조유송<br>

## 📋 프로젝트 목표

### 학습 목표
- Spring Boot와 React를 활용한 풀스택 웹 애플리케이션 개발 역량 강화
- REST API 설계 및 구현
- JPA를 이용한 데이터베이스 연동
- 외부 API(OpenAI DALL·E) 연동 경험

### 프로젝트 목표
- Spring Boot와 React를 사용하여 안정적이고 확장 가능한 도서 관리 시스템 구축
- 사용자가 손쉽게 도서를 등록, 조회, 수정, 삭제할 수 있는 CRUD 기능 제공
- OpenAI API를 연동하여 도서 제목이나 내용에 기반한 표지를 자동으로 생성하는 기능 구현
- MUI를 활용하여 사용자 친화적인 기본 UI 제공

### 중점 사항
- 백엔드와 프론트엔드의 역할 분담 및 연동 이해
- CRUD (Create, Read, Update, Delete) 기능의 완전한 구현
- 실제 외부 API를 연동하여 동적인 기능을 추가하는 경험
- 기본적인 UI/UX 설계를 통한 사용자 친화적인 애플리케이션 제작

## Skills

  Versions
  
    JDK 17
    Spring Boot 3.5.8
  
  Dependencies
  
    Spring Web
    Spring Data JPA
    Spring Boot DevTools
    Lombok
    H2 Database


## Project Structure 
  
  Example
  
    src
     ├── main
     │    ├── java
     │    │    └── com.example.backend
     │    │           ├── api.config   # Front-end Server 연결 설정 (CORS 설정)
     │    │           ├── aspect       # AOP 로그 설정 
     │    │           ├── controller   # REST API 컨트롤러
     │    │           ├── exception    # 전역 예외 설정
     │    │           ├── service      # 비즈니스 로직
     │    │           ├── repository   # DB 접근 레이어
     │    │           └── model        # 엔티티/DTO
     │    └── resources
     │          ├── application.yml    # 환경 설정
     │          └── static / templates
     └── test
          └── java                     # 테스트 코드

## CORS 테스트 (Front-end : localhost:5173)

#### 1. 백엔드 서버 실행

    Spring Boot 프로젝트 BookMsApplication (메인 클래스) 실행 → 기본 주소: http://localhost:8080

#### 2. 프론트엔드 서버 실행

    React + Vite 프로젝트 실행 → 기본 주소: http://localhost:5173

#### 3. 프론트엔드 페이지 접속

    브라우저에서 http://localhost:5173 접속

#### 4. 프론트에서 백엔드 API 요청 실행 

    브라우저에서 CORS 여부 확인

    에러 없으면 → CORS 정상

    에러 발생시 F12 개발자 도구 console를 확인하여 오류 확인 


## 주요 기능 

### 🤖 OpenAI API 연동

- OpenAI DALL·E API를 활용하여 도서 표지 이미지 자동 생성
- 도서 제목 및 내용을 프롬프트로 전달하여 이미지 생성
- 생성된 이미지 URL을 도서 정보에 저장하여 재활용

### ⚠️ 예외 처리

- 전역 예외 처리(@ControllerAdvice) 적용
- 잘못된 요청 및 서버 오류에 대해 일관된 응답 구조 제공
- 프론트엔드에서 오류 메시지를 명확히 확인 가능

<!--## 배포정보--> 



    

    

