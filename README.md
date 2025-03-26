#### 26.2025-03-25
 1. MYSQL - Select subquery
    - select 구문안에 select 구문
    - 메인쿼리 안에 또 다른 쿼리가 있는 것
    - subquery 형식 : select 컬럼명 from 테이블명 where 컬럼명 in (select을 이용한 컬럼)
    - 다중행 연산자
      - in  : 서브쿼리의 결과가 하나라도 일치하면 true
      - any : 서브쿼리의 결과가 하나 이상이면 true
      - all : 서브쿼리의 결과가 모두 만족하면 true
 2. jsp - 내장객체 (2)
    - 내장객체 종류
      - session(정보저장)
        - http 프로토콜 ( 데이터요청 - 응답을 받게 되면 바로 종료 )
        - 서버측에 저장되는 정보
      - cookie
        - 클라이언트 측에 저장되는 정보
        - 보안에 매우 취약함
      - error
        - 4xx (클라이언트 오류) 5xx (서버측에 오류)
        - 404 페이지 찾을 수 없음, 405 메서드 요청 잘못됨, 500 자바코드상에 오류
        - web.xml  에러설정

---
#### 25.2025-03-24
 1. MYSQL - Select Function(join)
   - join : 두 개 이상의 테이블들을 연결 또는 결합하여 데이터를 출력
   - join 종류
     - inner join : 양 쪽 테이블 모두 일치
       - = join
       - join on
       - join using
       - natural join
     - outer join : 특정 테이블을 기준으로 검색
       - left join
       - right join
 2. jsp - 내장객체 (1)
   - 내장객체 종류
     - request(요청)
       - jsp페이지가 웹컨테이너에 의해 서블릿으로 변환될때
       - 고정된 이름의 객체 컨테이너로 자동으로 구현
     - response(응답)
       - Http요청에 대한 응답정보를 저장한 객체
       - 응답처리를 하는객체인 response는 실행결과를 브라우저로 되돌려줄때 사용하는 내장객체
       - jsp에서 다른페이지로 이동시키는방법
         - sendRedierct   - 브라우저 url을 변경 , request/response객체가 유지되지 않음
         - RequestDispatcher - 경로가 숨겨져서 안보임
     - scope (범위)
       [ application(애플리케이션) > session(브라우저) > request(요청) > pageContext(페이지) ]
     - out(출력)
 3. Milk - 우유주문시스템

 [![Video Label](http://img.youtube.com/vi/5tDv0Q8iAMg/0.jpg)](https://youtu.be/5tDv0Q8iAMg)
 
---
#### 24.2025-03-21
 1. MYSQL - Select Function(Number)
   - ceil(올림)
   - floor(내림)
   - round(반올림)
   - mod(숫자,나눌 수)(나머지 연산자)
 2. MYSQL - Function(String)
   - length : 문자길이
   - upper / lower   : 대문자 / 소문자
   - instr( 문자열,찾을 문자열 )  : 문자열 위치찾기
   - substr( 문자열,시작,갯수 )   : 문자열 일부분 추출
   - left / right ( 문자열,갯수 ) : 왼쪽 추출 / 오른쪽 추출
   - concat( 문자열,문자열 )   : 문자열 연결
   - trim(),ltrim,rtrim    : 공백제거
   - replace(문자열,찾아서,바꾸기) : 문자열 바꾸기
   - repeat( 문자열,몇번 )  : 반복
   - lpad( 문자열,전체자리수,특정문자 ) : 왼쪽 특정 문자 채우기
   - rpad( 문자열,전체자리수,특정문자 ) : 오른쪽 특정 문자 채우기
 3. MYSQL - Select Function(Date)
   - now(),current_time : 시스템 현재 시각 조회
   - weekday : 요일
   - date_format : 날짜지정,'%Y-%m-%d'
   - date_add : ~일전 ~일후 (now() , interval -10 day)
   - datediff : 차이 조회 ("2023-10-25","2023-10-24") = 1
 4. MYSQL - Select Function(if,case)
   - if(조건,참,거짓) : 1형식
   - case when 조건1 then 상태1 when 조건2 then 상태2 else 모든 조건에 해당되지 않을 때 end : 다형식
 5. jsp - 우유주문시스템(db연동)
   - milk(delete) : 우유데이터 삭제 - 웹페이지에서 우유데이터(번호)를 입력받아 milk.jsp에 입력되어 있는 데이터 삭제
   - 빈칸유효성검사 : 웹페이지에 빈칸이 있는 채로 버튼을 누르면 "빈칸입니다"가 뜨고 빈칸으로 이동
 6. jsp - jsp_basic(control,useful)
   - if , switch , FOR/WHILE/DO WHILE 복습
   - console.log : 콘솔창에 표시
   - document.write : 웹페이지에 표시
   - var - 전역변수, let - 지역변수 ( 변수중복 선언불가), const - 상수
   - type of : 자료형 확인
   - useful : 빈칸유효성검사 function form문안에 onsumit에 넣어 준 값 {let 변수 = document.querySelector("빈칸검사할 아이디"); if( 빈칸검사할 아이디.value == ""){ alert("빈칸입니다."); 빈칸검사할 아이디.focus(); return false; } }
---
#### 23.2025-03-20
 1. MYSQL - CRUD(selete 2)
   - order by : 정렬(asc-오름차순,desc:내림차순)
   - limit 갯수 : 갯수 제한
 2. MYSQL - CRUD(selete 3)
   - 집계함수(Gruop by)
     - avg(컬럼명) : 평균값
     - max(컬럼명) : 최댓값
     - min(컬럼명) : 최소값
     - sum(컬럼명) : 합계
     - conut(*)   : 요소수
   - having 조건 집계함수 : 집계결과 필터링
 3. jsp - 우유주문시스템(db연동)
   - milk(insert) : 우유데이터 삽입 - 웹페이지에서 우유데이터를 입력받아 milk.jsp에 데이터 삽입
   - milk(update) : 우유데이터 수정 - 웹페이지에서 우유데이터를 입력받아 milk.jsp에 입력되어 있는 데이터 수정
---
#### 22.2025-03-19
 1. MYSQL - CRUD(selete 1)
   - 전체데이터 검색 : select *from 테이블명;
   - 필드검색 : select 필드1(no...),필드2(name...) form 테이블명;
   - 중복빼기(distinct) : select distinct 필드1 from 테이블명;
   - 별명 as : select 필드1 as `별명1` , 필드2 `별명2` form 테이블명;
   - 비교연산자 : =(같다),<>/!=(다르다), <(작다), <=(작거나 같다), >(크다), >=(크거나 같다)      
   - 논리연산자 : and
   - 범위로 추출 : between and
   - 일치하는 레코드추출 : or, in
   - 추출조건으로 null지정 : null과 같다는 것을 확인하고 싶을 때(=연산자 사용못함) is null
   - 문자열 필터링
      - like "a%" : a로 시작하는
      - like "%a" : a로 끝나는
      - like "%a%" : a가 포함되어 있는
      - like "_a%" : 2번째 글자가 a인
   - NOT(반대) : not in, not between and, is not null, not 필드명 ...
 2. jsp - DB연동
   - Persistence(영속성)
   - JDBC
     - 드라이버로딩 : Class.forName()
     - DB연결 : DriverManager.Connection
     - Connection DB연동
     - Statement PreparedStatement sql 구문실행
     - ResultSet sql 구문실행 후 객체 받기(select)

---
#### 21.2025-03-18
 1. MYSQL - CRUD(조작어)
   - insert(추가)
   - update(수정)
   - select(선택,확인)
   - delete(삭제)
 2. jsp - 기본요소
   - 주석 <!-- html 주석 -->, <%-- jsp 주석 --%>, <% //java 주석 %>
   - 지시자 <%@page import="값"%>
   - 스트립트립 <% %>
   - 표현식 <%= %>
 3. jsp - FORM 태그 - 서버쪽으로 정보를 전달할때 사용하는 태그
   - action : 요청을 처리해주는 컴포넌트 (링크)
   - method : 요청을 처리해주는 방식 (get / post)
   - name : 데이터 보관이름
 
---
#### 20. 2025-03-17
 1. DBMS - Database Management System(데이터베이스 관리 시스템)
 2. RDBS - Relational Database Management System(관계형 데이터베이스 관리 시스템)
 3. RDBMS 구성요소
  - 개체( Entity : Table )
  - 관계( Relational : 외래키 )
  - 속성( Arrtibute : 필드 )
 4. 데이터베이스 언어
  - 정의어(DDL)  -  create, alter, drop - CAD
  - 조작어(DML)  -  insert, select, update, delete - CRUD
  - 제어어(DCL)  -  grant, revoke
 5. TABLE - 저장소 안에 분류표
  - 자료형
     - 1) 숫자 - int, double
     - 2) 문자 - char 고정문자열 - y/n / varchar 가변형문자열 / text
     - 3) 날짜 - date, datetime, timestamp
  - 속성
     - 필수입력     - not null  ( 아니오, 값없음 )
     - 숫자자동증가 - auto_increment
     - 기본키       - primary key
 6. key - 튜플(행, 레코드, 한명의 정보)들을 구분할 수 있는 기준필드(행,속성)
  - 후보키(기본키로 사용할 수 있는 속성)
  - 기본키(후보키들 중에서 선택한 주 키)
  - 대체키(후보키들 중에서 선택안된 키)
  - 외래키(테이블과 테이블을 연결해주는 속성)
  - 슈퍼키(속성 + 속성 집합으로 구성된 키)
 7. alter
  - 문법 alter table 테이블명 ();
    - add   (추가)      필드명 자료형 속성
    - drop  (삭제)      필드명
    - modify (필드수정) 수정할필드명 자료형 속성
    - change (필드수정) 수정할필드명 새로넣을필드명 자료형 속성
    - rename            새로운테이블명
 8. jsp
  - 클라이언트 ↔ 서버 (서비스이용(요청 -> request)        서비스제공(응답 -> response))
  - WS : Web Server(정적서버 apache)
  - WAS : Was Server(동적서버 apache + tomcat)
  - FORM 태그 : 처리컨테이너( action ) / 처리방식( method ) / 보관이름( name )

---
#### 19. 2025-03-14
 1. Thread
  - 프로세스
  - 멀티프로세스
  - 동시성과 병렬성
  - Thread 상속 / Runnable 인터페이스 구현
 2. Network
  - Network
  - 서버와 클라이언트
  - Socket 프로그래밍
  - TCP/IP
 3. 채팅프로그램 만들기
 4. MYSQL설치

---
#### 18. 2025-03-13
 1. OOP 활용 복습 - OOP part2 (JVM 영역, 클래스, 다형성, 콜렉션프레임워크)
 2. JAVA I/O - JAVA I/O(폴더 + text파일 만들기)
 3. JAVA I/O - (InputStream / OutputStream) : byte단위
 4. JAVA I/O - (InputStream / OutputStream) : char단위
 5. JAVA I/O - 보조스트림
  - 1) new FileInputStream(file) [byte#]/char  
  - 2) new InputStreamReader     바이트를 문자스트림으로 - 텍스트처리가능
  - 3) new BufferedReader        속도향상 (StringBuffer)
 6. Network  (http://localhost:8080 내로컬에서만 사용:값)
  - URL 
  - 연결객체 (HttpURLConnection)
  - 요청설정 (파라미터)
  - 응답코드 - 200(getResponseCode())
  - 응답데이터
 7. html + css (BootStrap) - css

---
#### 17. 2025-03-12
 1. Lambda 복습 - Lambda
 2. Lambda + Stream - Lambda(자바 api - 함수 인터페이스)
  - 함수 인터페이스
   - Consumer - 받는용도 - accept
   - Supplier - 제공용도 - get
   - Predicate - 판단용도 - test
   - Function - 처리용도 - apply
   - Operator - 연산용도 - apply
 3. (Lambda + Stream - Stream( 데이터 종류에 상관없이( Stream ) 같은 방식으로 처리 ( lambda ) )
 4. JAVA I/O - 입력(input)과 출력(output)
 4-1) 분류
  - byte 단위(InputStream / OutputStream) - 모든종류( 그림, 멀티미디어, 문자 )
  - char 단위(Reader / Writer ) - 문자
 5. JAVA I/O - 보조스트림 ( 스트림? 사용연결통로 )

---
#### 16. 2025-03-11
 1. OOP 활용 복습 - ArrayList,HashSet
 2. OOP 활용 (Collection Framework) - HashMap
 3. OOP 활용 (Collection Framework) - Iterator
 4. Lambda + Stream - Lambda (함수적 프로그래밍 지원기법 )

---
#### 15. 2025-03-10
 1. OOP 복습 - OOP part 1
 2. OOP 활용(Collection Framework) - 동적배열(배열의 단점을 개선한 클래스)
 2-1) 핵심 인터페이스
    - List (index O, 중복허용 O, add/get(번호)/size/remove/contains)
    - Set (index X, 중복허용 X, add/향상된 for, Iterator/size/remove/contains)
    - Map
 3. html + css (BootStrap) - 디바이스 사이즈

---
#### 14. 2025-03-07
 1. OOP(interface) - arr interface
 2. OOP(익명클래스) - 한번만 사용하고 버려지는 객체
 3. OOP(Exception) - try catch finally, throws

---
#### 13. 2025-03-06
 1. OOP 복습 - 상속,다향성
 2. OOP(abstract) - Is A: 고양이는 동물이다
   - 추상화
   - 추상클래스
 3. OOP(interface) - can do this
   - 연관관계
   - 일반화관계
   - 집합관계
   - 의존관계
   - 실체화관계( 인터페이스 )
      - (implements , Can do this , 빈삼각형과 점선)
      - 객체가 해야할 일, 할 수 있는 일 - 책임
 4. html-css (복습)
   - click event
   - 기본문법

---
#### 12. 2025-03-05
 1. OOP(상속) - super,sub / 모든클래스는 Object를 상속
 2. OOP(오버라이드) - @Override(상속시 부모메서드와 동일한지)
 3. OOP(클래스 다이어그램) - 시스템을 구성하는 클래스들 사이관계를 표현
 4. UML관계
   - 연관관계
   - 일반화관계
      - 상속관계
      - IS-A관계 - 한 클래스가 다른 클래스를 포함하는 상위 개념
      - 속이 빈 화살표
   - 집합관계
   - 의존관계
   - 실체화관계( 인터페이스 )
 5. 다형성
 6. html-css (기본문법)
   - font 속성
   - 문단 속성

---
#### 11. 2025-03-04
 1. control part 복습
 2. OOP(지정접근자) - public, protected, default(package), private
 3. OOP(클래스배열) - 클래스[] 배열명 - new 클래스[갯수];
 4. mini project - Bank_Arr

 [![Video Label](http://img.youtube.com/vi/lTyqwdJSP5c/0.jpg)](https://youtu.be/lTyqwdJSP5c)

---
#### 10. 2025-02-28
 1. OOP(생성자) - 생성자형식(기본생성자[디폴트생성자], 파라미터[알규먼트]가 있는 생성자)
 2. OOP(static) - runtime data area(method, heap, stack), static

---
#### 9. 2025-02-27
 1. 메서드(Method)(2) - 오버로딩(call by value, call by reference)
 2. OOP(CLASS) - 클래스와 인스턴스
 3. html+css - click 이벤트(querySelector)

---
#### 8. 2025-02-26
 1. 배열(Array) 복습
 2. 메서드(Method)
 3. html+css - click 이벤트(getElementById)

---
#### 7. 2025-02-25
 1. 반복문(for) 복습
 2. 배열 (1차원 배열)
 3. 배열 (다차원 배열)
 4. html+css - img삽입, click 이벤트

---
#### 6. 2025-02-24
 1. 반복문(for) 복습
 2. 제어문(4) - 반복문(while,do while)
 3. html+css -  bootstrap 사용법,html 요소정리

---
#### 5. 2025-02-21
 1. 제어문(3) - 반복문(for)
 2. mini project - Bank

   [![Video Label](http://img.youtube.com/vi/RloOIEwHmbk/0.jpg)](https://youtu.be/RloOIEwHmbk)

---
#### 4. 2025-02-20
 1. 제어문(1) - 조건문(if, else, else if)
 2. 제어문(2) - 조건문(switch)

---
#### 3. 2025-02-19
 1. 자료형(2) (형변환)
 2. 자료형(3) (char,유니코드)
 3. 연산자 (값(+,-,*,/,%) 비교(>,<,>=,<=,==,!=) 조건처리(&&,||,?:) 대입(=,+=...))

---

#### 2. 2025-02-18
 1. 출력 (print,println,prinf - 연산)
 2. 변수 (정수(byte-short-int-long), 실수(float-double))
  -> 자바기본처리단위 (정수 - int , 실수 - double)  
 3. 자료형(1) (기본형(실제값 저장),참고형(주소값 저장))
  -> Scanner
    
--- 
#### 1. 2025-02-17
 1. welcome!
 2. git (로컬저장소 - 원격저장소)
 3. java (설치 , eclipse )

---

