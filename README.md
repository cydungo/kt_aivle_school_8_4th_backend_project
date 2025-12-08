## 📌 KT AIVLE School 8기 4차 미니프로젝트 – Backend

  Spring Boot 기반 백엔드 API 서버 프로젝트입니다.<br>
  프론트엔드(Vite + React)와 연동되며, REST API를 제공하는 역할을 수행합니다.

## 👥 Team Structure

  PM : 조유송 <br>
  Backend : 나도요, 나성곤, 정성호<br>
  Frontend : 이정민, 이동규, 조유송<br>

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

## CORS 테스트 


#### 1. 백엔드 서버 실행

    Spring Boot 프로젝트 실행 → 기본 주소: http://localhost:8080

#### 2. 프론트엔드 서버 실행

    React + Vite 프로젝트 실행 → 기본 주소: http://localhost:5173

#### 3. 프론트엔드 페이지 접속

    브라우저에서 http://localhost:5173 접속

#### 4. 프론트에서 백엔드 API 요청 실행 

    브라우저에서 CORS 여부 확인

    에러 없으면 → CORS 정상

    에러 발생시 F12 개발자 도구 console를 확인하여 오류 확인 

    

