#### 1. 2025-02-17
 1. welcome!
 2. git (로컬저장소 - 원격저장소)
 3. java (설치 , eclipse )

---
#### 2. 2025-02-18
 1. 출력 (print,println,prinf - 연산)
 2. 변수 (정수(byte-short-int-long), 실수(float-double))
  -> 자바기본처리단위 (정수 - int , 실수 - double)  
 3. 자료형(1) (기본형(실제값 저장),참고형(주소값 저장))
  -> Scanner
    
--- 
#### 3. 2025-02-19
 1. 자료형(2) (형변환)
 2. 자료형(3) (char,유니코드)
 3. 연산자 (값(+,-,*,/,%) 비교(>,<,>=,<=,==,!=) 조건처리(&&,||,?:) 대입(=,+=...))

---
#### 4. 2025-02-20
 1. 제어문(1) - 조건문(if, else, else if)
 2. 제어문(2) - 조건문(switch)

---
#### 5. 2025-02-21
 1. 제어문(3) - 반복문(for)
 2. mini project - Bank(https://youtu.be/RloOIEwHmbk)

---
#### 6. 2025-02-24
 1. 반복문(for) 복습
 2. 제어문(4) - 반복문(while,do while)
 3. html+css -  bootstrap 사용법,html 요소정리

---
#### 7. 2025-02-25
 1. 반복문(for) 복습
 2. 배열 (1차원 배열)
 3. 배열 (다차원 배열)
 4. html+css - img삽입, click 이벤트

---
#### 8. 2025-02-26
 1. 배열(Array) 복습
 2. 메서드(Method)
 3. html+css - click 이벤트(getElementById)

---
#### 9. 2025-02-27
 1. 메서드(Method)(2) - 오버로딩(call by value, call by reference)
 2. OOP(CLASS) - 클래스와 인스턴스
 3. html+css - click 이벤트(querySelector)

---
#### 10. 2025-02-28
 1. OOP(생성자) - 생성자형식(기본생성자[디폴트생성자], 파라미터[알규먼트]가 있는 생성자)
 2. OOP(static) - runtime data area(method, heap, stack), static

---
#### 11. 2025-03-04
 1. control part 복습
 2. OOP(지정접근자) - public, protected, default(package), private
 3. OOP(클래스배열) - 클래스[] 배열명 - new 클래스[갯수];

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
#### 14. 2025-03-07
 1. OOP(interface) - arr interface
 2. OOP(익명클래스) - 한번만 사용하고 버려지는 객체
 3. OOP(Exception) - try catch finally, throws

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
#### 16. 2025-03-11
 1. OOP 활용 복습 - ArrayList,HashSet
 2. OOP 활용 (Collection Framework) - HashMap
 3. OOP 활용 (Collection Framework) - Iterator
 4. Lambda + Stream - Lambda (함수적 프로그래밍 지원기법 )

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

---
