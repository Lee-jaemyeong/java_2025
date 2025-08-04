#### 84.2025-06-23
 1. Spring + MyBatis - OAuth2(kakao, google, naver)
    - MemberUserDetails 상속 클래스 생성
    - OAuth2 인터페이스 클래스 생성
    - kakao, google, naver 상속 클래스 생성
    - 개발자 센터 - RESTful API 키,시크릿 키 삽입
 2. 3차 팀프로젝트

---
#### 83.2025-06-20
 1. Spring + MyBatis - Security
    - url
     - 로그인 세션 처리
     - 로그아웃 세션 처리
     - csrf: 사용자 인증정보를 웹페이지에서 보내기
    - AuthenticationManager
     - 사용자 인증시 Service와 PasswordEncoder를 사용
    - PasswordEncoder

---
#### 82.2025-06-19
 1. Spring + MyBatis - Spring 보안
   1. 보안 : security
   2. 폼 검사 : validation
   3. 카카오, 네이버, 구글로그인 : oauth2-client
 2. Spring + MyBatis - 연동
    - @Mapper 인터페이스 , Mapper XML 파일 생성
    - XML 파일 안에 SQL 구문 작성

---
#### 81.2025-06-18
 1. react.js - 능력단위 시험
   - NODE
    - Q1. node 프로젝트만들기 - [back]
    - Q2. setting - setting 파일 확인
    - Q3. [express] - controller
    - Q4. [sequelize] - model
    - Q5. [미들웨어] - passport
    - Q6. [router] - user.js / post.js
    - Q7. postman이용해서 rest api 기능확인 - 회원가입
    - Q8. postman이용해서 rest api 기능확인 - 로그인
    - Q9. postman이용해서 rest api 기능확인 - 파일업로드
    - Q10. postman이용해서 rest api 기능확인 - 글쓰기기능
   - REACT
    - Q1. react 프로젝트만들기 - [front]
    - Q2. react 셋팅 - package.json (npm i)
    - Q3. [pages] - index.js / signup.js / profile.js / _app.js(공통) , _document.js
    - Q4. [components] - AppLayout.js / PostForm / PostCard / LoginForm.js / UserProfile.js
    - Q5. [hooks] - userInput.js
    - Q6. [reducer] - index.js / user.js, post.js
    - Q7. [store] - configureStore.js
    - Q8. [sagas] - index.js / user.js, post.js
    - Q9. 회원가입 - restful api 이용해서 서버와 연동
    - Q10. 로그인 - restful api 이용해서 서버와 연동
    - Q11. 이미지업로드 - restful api 이용해서 서버와 연동
    - Q12. 글쓰기 - restful api 이용해서 서버와 연동
      
---
#### 80.2025-06-17
 1. 2차 팀프로젝트 - 시연회

---
#### 79.2025-06-16
 1. 2차 팀프로젝트 - 디버깅, 결과보고서, 시연회 준비

---
#### 78.2025-06-11~13
 1. 2차 팀프로젝트 - 구현

---
#### 77.2025-06-10
 1. 2차 팀프로젝트 - 요구사항정의서(ERD,Figma 설계)

---
#### 76.2025-06-09
 1. 2차 팀프로젝트 - 요구사항정의서(기획)

---
#### 75.2025-06-05
 1. react.js - SDK
    - 컴포넌트에 js스크립트
    - 개발자 센터 - JavaScript키
 2. react.js - SSR(서버사이드렌더링)
    - 서버 사이드 렌더링은 웹 페이지의 HTML을 서버에서 미리 생성하여 클라이언트에 전달하는 렌더링 방식
    - React나 Vue 같은 프레임워크에서는 Next.js나 Nuxt.js 같은 SSR을 지원하는 라이브러리를 사용해서 구현
    - React Hooks 기반의 데이터 페칭 라이브러리
 3. react.js - 날짜와 시간파싱, 검증, 조작, 포맷
    - https://momentjs.com/
    - date-fns, luxon, dayjs ,,,
 4. react.js - Webpack 번들 분석
    - npm i @next/bundle-analyzer는 Next.js 프로젝트에서 Webpack 번들 분석을 위한 패키지를 설치하는 명령어
 5. react.js - 다른 환경에서도 동작하게 만들기
    - npm i cross-env
    - npx @next/codemod new-link . --force    

---
#### 74.2025-06-04
 1. react.js - api - 리트윗
    - 기존 게시글 확인
      - findOne
    - 리트윗 - 조건확인
      - req.user.id ===post.UserId
    - 리트윗한 게시글 번호
      - post.RetweetId || post.id
    - 중복 리트윗 여부
      - findOne으로 리트윗 글 찾기
      - 403 오류가 뜨면 '리트윗한 게시물' 메세지 띄우기
    - 리트윗 생성
      - create
    - 리트윗 상세조회
      - findOne - include[model]
    - res 응답
      - res.status(201).json(상세조회 변수명)
 2. react.js - api - back
    - axios 설치
    - app.js - api_url 삽입

---
#### 73.2025-06-02
 1. react.js - Back (글수정)
    - Patch - update
 2. react.js - Front (글수정)
    - disPatch - UPDATE_POST_REQUEST - data: post.id, editText
    - useState - 중앙저장소 상태관리
    - description - PostCardContent 값 적용
    - editMode - data, hashtag 분리
    - useEffect - 수정 리렌더링
 3. 2차 팀프로젝트

---
#### 72.2025-05-30
 1. react.js - 해쉬태그
   - back - routes - hashtag.js
     - include - [{name: decodeURIComponent(req.params.hashtag)}]
   - back - app.js
     - require(./routes/hashtag)
     - app.use('/hashtag',hashtag)
 2. react.js - 페이지 무한로딩
   - screenY vs pageYOffset
     - screenY : 현재창에서 마우스 커서 기준 Y
     - pageYOffset : 페이지 스크롤을 측정 Y

---
#### 71.2025-05-29
 1. react.js - 유저 프로필
    - user - [id].js
 2. 2차 팀프로젝트

---
#### 70.2025-05-28
 1. react.js - 댓글
    - /:postId/comment
    - 게시물 존재확인
    - 댓글 생성
    - 댓글 조회
    - 응답 코드
 2. react.js - 글삭제
 3. react.js - 닉네임 변경
    - /nickname
    - 로그인
    - Header 쿠키설정
    - Body - [Raw] - [Json]
 4. react.js - 좋아요
    - /:postId/like
    - 게시글 존재여부 확인
    - 좋아요 추가
    - 응답
 5. 2차 팀프로젝트

---
#### 69.2025-05-27
 1. react.js - 서버 연동(글쓰기)
 2. react.js - 이미지 삽입
 3. react.js - 댓글
 4. 2차 팀프로젝트

---
#### 68.2025-05-26
 1. react.js - 닉네임 변경
 2. react.js - immer(코드줄이기)
 3. react.js - 무한 로딩
 4. react.js - 서버 연동(회원가입,로그인,로그아웃)
    - 사용자 정보 쿠키저장
    - 세션 이용하여 로그인,로그아웃
 5. 2차 팀프로젝트

---
#### 67.2025-05-23
 1. react - 회원가입,로그인
    - saga 이용하여 회원가입,로그인,로그아웃
 2. react - 글쓰기
    - saga 이용하여 글쓰기
 3. 2차 팀프로젝트

---
#### 66.2025-05-22
 1. react.js - redux-saga
    - redux의 미들웨어
    - 미들웨어: 기능향상
    - 비동기액션을 디스패치할 수 있게 해주는 역할
 2. react.js - axios
    - 웹요청 비동기 라이브러리
 3. react.js - generator 함수
    - function*
    - yield에서 멈춤, 중간지점이 있는 함수
 4. 2차 팀프로젝트

---
#### 65.2025-05-21
 1. react.js - css최적화 렌더링
 2. react.js - redux
    - 중앙데이터 저장소
    - 로그인한 정보
    - 에러추적이 됨
 3. react.js - redux 사용
    - react-redux(react와 연결)
    - next-redux-wrapper(next에서 redux 사용)
    - redux-devtools-extension(브라우저에서 개발자 연동)
 4. react.js - redux 사용하여 로그인/로그아웃
 5. 2차 팀프로젝트

---
#### 64.2025-05-20
 1. react.js - 더미데이터 로그인/로그아웃
 2. react.js - Hooks
    - 훅(Hook)
      - React의 상태를 관리, 컴포넌트 내부에서 값이 변할 수 있도록 해주는 역할
      - 비구조화 할당문법
    - 화살표 함수
      - ()=>{} return 필요
      - ()=>() 자동반환
 3. react.js - NicknameForm
 4. react.js - 팔로워리스트
 5. 2차 팀프로젝트

---
#### 63.2025-05-19
 1. react.js - 리액트 설치
    - node(자바스크립트를 실행할 수 있게 해주는 런타임도구)
      - 비동기식으로 이뤄지는 대표적인 프로그램
    - npm(노드 패키지 매니저)
    - react vs vue 차이점
      - react(데이터 연동시 단방향)
      - vue(양방향)
    - AppLayout 설정(확장프로그램 React DevTools,Redux DevTools설치)
 3. react.js - Antd
    - 공통레이아웃(반응형디자인)
      - 컬럼 24개
      - 각 디바이스 사이즈별로 디자인 가능
    - 웹팩
      - 모듈번들러, 웹애플리케이션을 구성하는 여러파일을 하나의 번들로 묶어주는 역할
      - nextjs 기본적인 웹팩이 들어 있음
      - 웹팩이 css를 찾아서 style 태그로 바꿔서 html에 넣어줌
 4. react.js - 로그인폼

---
#### 62.2025-05-16
 1. node.js - 복습
 2. node.js - 게시글 준비
    - express 프레임워크 이용해서 서버생성
    - cross origin 다른 도메인에서 api 요청허용
    - 업로드 설정
      - 저장소 설정(업로드된 파일의 위치,파일이름 지정하는 역할)
      - 파일을 디스크(로컬 파일시스템)에 저장하도록 설정
 3. node.js - 게시글쓰기 작성 중간
    - 게시글 생성하고 관련데이터 저장하는 역할
      - 해시태그 추출
      - 게시글 저장
      - 해시태그 존재하면 - 해시태크 저장
        - 비동기로 작업 병렬로 실행하고, 작업완료시 결과반환
      - 이미지처리
      - 게시글 상세정보조회
        - 해당유저의 id에 맞는 글찾기 / join / Image테이블 / Comment / User
    - 글삭제
    - 사용자 댓글
    - 좋아요 추가
      - PATCH
      - 게시글 존재 여부 확인
      - 좋아요 추가
      - 응답
    - 좋아요 삭제
      - DELETE
      - 게시글 존재 여부 확인
      - 좋아요 추가
      - 응답

---
#### 61.2025-05-15
 1. node.js - 복습
 2. node.js - 사용자 정보
    - router.get 이용해서 사용자페이지 출력
    - 로그인 사용자 확인, 로그인한 유저 정보 반환
 3. node.js - 로그아웃
 4. node.js - 정보수정
    - 로그인
    - Header 쿠키설정
    - Body - [Raw] - [Json]
 5. node.js - 팔로우하기
    - router 작성
    - 넘겨받은 아이디로 유저인지 select 구문확인
    - 유저에 추가
    - 상태표시
 6. node.js - 팔로잉,팔로워찾기
    - router 작성
    - 넘겨받은 아이디로 유저찾기
    - 해당유저의 팔로잉찾기
 7. node.js - 언팔로우
    - router 작성
    - 언팔로우할 유저찾기
    - 팔로우 삭제
    - 상태표시
 8. node.js - 팔로우차단
    - router 작성
    - 차단할 유저찾기
    - 팔로우 삭제
    - 상태표시
 9. 2차 팀프로젝트

---
#### 60.2025-05-14
 1. node.js - 복습
 2. node.js - 필수셋팅
    - 모듈
      - 특정기능을 제공하는 코드블록
      - require 코드포함시키기
    - nodemon
      - 코드변경시 자동으로 서버 재시작
    - 비밀번호 암호화
      - bcrypt(암호화, 무작위데이터 추가)
    - cors
      - cors(cross-origin resource sharing)
      - 다른 브라우저(react)가 다른 도메인(node, spring boot)에 리소스를 요청할 때 보안정책
    - passport
      - passport(사용자인증 프레임워크)
      - passport-local(사용자이름, 비밀번호를 사용해서 사용자 정보확인)
    - session, cookie
      - session(서버측에 데이터 저장)
      - cookie(클라이언트측 데이터 저장)
    - 환경변수로드
      - .env 저장된 환경변수 로드
    - 파일업로드
      - 파일업로드 미들웨어
    - 모니터링
      - 서버로부터 들어오는 요청의 정보 디버깅, 모니터링
 3. node.js - 회원가입, 로그인
 4. 2차 팀프로젝트 - 주제선정 및 기능선정

---
#### 59.2025-05-13
 1. node.js - 복습
 2. node.js - sequelize
    - sequelize(데이터베이스 조작가능하게, sql을 몰라도 자바스크립트로 조작가능하게)
    - mysql2(node, mysql 연결해주는 드라이버)
    - 시퀄라이즈 이용해서 table 만들기
      > 기본 테이블값
      > 관계설정
 3. 2차 팀프로젝트 - 주제선정

---
#### 58.2025-05-12
 1. node.js
    - node  setting, 서버구동
      - javascript를 이용한 프레임워크, 플랫폼
      - 패키지 관리 npm
      - 비동기식으로 이뤄지는 대표적인 프로그램
    - express 라우팅
      - 코드를 깔끔하고 구조적으로
      - backend frontcontroller 역할
    - model(시퀄라이즈 모델 / 관계)
      - mysql 설치확인
      - sequelize(데이터베이스 조작가능하게, sql을 몰라도 자바스크립트로 조작가능하게)
      - mysql2(node, mysql 연결해주는 드라이버)
 2. LINUX - aws
    - 팀 프로젝트 올리기  

---
#### 57.2025-05-09
 1. LINUX - 복습
 2. LINUX - aws
    - ubuntu 셋팅
      - jdk
        - 설치할 수 있는 jdk 버젼
        - apt 업데이트
        - java 설치
        - java 버젼확인
        - java 경로확인
        - java 경로설정
        - 경로 설정반영
        - 환경변수 설정확인
      - tomcat9
        - 설치할 수 있는 tomcat 버젼
        - apt 업데이트
        - tomcat9 설치
        - tomcat 버젼확인
        - 방화벽
        - 톰캣시작
        - 톰캣시작확인
        - ip 확인
      - mysql
        - 설치할 수 있는 mysql-server 버젼
        - apt 업데이트
        - mysql8 설치
        - mysql8 버젼확인
        - mysql 접속
    - aws 회원가입
    - aws ec2 올리기 준비물
      - 만든 프로젝트 배포파일로 만들기(.jar)
      - filezilla
      - putty  - key   
    - aws ec2
      - 로그인
      - ec2(대쉬보드)
      - 인스턴스 생성
      - jdk11 + tomcat9 + mysql8 설정
      - putty 키
      - filezilla
      - ec2 > mysql db만들기
      - ec2 >  jar 파일실행
    - aws ec2 관리
      - https 접속
      - 백그라운드로 실행

---
#### 56.2025-05-08
 1. LINUX
    - 실습환경구성
      - 1단계-Linux용 Windows 하위 시스템 사용
        dism.exe /online /enable-feature /featurename:Microsoft-Windows-Subsystem-Linux /all /norestart
      - 2단계-WSL 2 실행에 대한 요구 사항 확인
      - 3단계-Virtual Machine 기능 사용
        dism.exe /online /enable-feature /featurename:VirtualMachinePlatform /all /norestart
      - 4단계-Linux 커널 업데이트 패키지 다운로드
      - 5단계-WSL 2를 기본 버전으로 설정
        wsl --set-default-version 2
      - 우분투 설치
        wsl  -l  -o
        wsl --install -d Ubuntu-22.04
        wsl --list --all 
    - 기본명령어
      - $,  #
        - $(일반사용자)
        - #(root)
      - 명령어 사용법
        - 명령어 option input
      - 출력 echo, 위치확인
        - 출력
          echo  hello world
          echo  $PATH
        - 위치확인
          which date
          which echo
        - 디렉토리 구조
          - / (루트)
          - /usr (기본실행)
          - /bin (명령어파일)
          - /etc (설정파일)
          - /home (유저계정)
          - /opt (추가패키지)
          - /tmp (임시파일)
          - /var (시스템운영 로그파일)
          - 현재 작업 디렉토리 (pwd)
          - 이동 (change directory)
            - cd
            - cd /
            - cd ~ 계정디렉토리
            - cd .. 상위디렉토리
      - 폴더 만들기
        - mkdir  폴더명
      - 파일 쓰고 읽기 (쓰고, 추가, 읽기)
        - cat > 파일명
        - cat >> 파일명
        - cat < 파일명
      - 파일/폴더복사
        - 파일복사(cp file1 file2)
        - 폴더복사(cp -r basic2 basic4)
      - 파일/폴더삭제
        - 파일삭제(rm file2)
        - 폴더삭제(rm -r basic3)
      - vi editor
        - 입력모드(텍스트입력) / 명령모드(커서이동, 복사, 저장)
          - 파일선택 : vi 파일명
          - 입력모드 : i
          - 빠져나오기 : esc
          - 파일저장  :   :wq! ( 저장하고 나오기 강제종료 )
      - 유저권한(4-read(r), 2-write(w), 1-execute(x))
        - chmod  777  모든사용자 r,w,x           
      - 프로세스(aux 모든 프로세스 확인)
        - ps aux | grep ubuntu
      - 압축 (c: 새압축파일생성, v: 진행사항출력, f: 파일이름지정)
        - 압축
          - tar -cvf my.tar 파일/디렉토리
        - 압축풀기
          - tar -xvf my.tar

---
#### 55.2025-05-07
 1. SPRING BOOT - TEST(시험)

---
#### 54.2025-05-02
 1. 팀 프로젝트 발표
 2. Team Yoonlee3

 [![Video Label](http://img.youtube.com/vi/F6DzPczeOM4/0.jpg)](https://youtu.be/F6DzPczeOM4)

---
#### 53.2025-05-01
 1. 팀 프로젝트

---
#### 52.2025-04-30
 1. 팀 프로젝트

---
#### 51.2025-04-29
 1. 팀 프로젝트

---
#### 50.2025-04-28
 1. 팀 프로젝트

---
#### 49.2025-04-25
 1. 팀 프로젝트

---
#### 48.2025-04-24
 1. SPRING BOOT - sms 문자 보내기
    - coolsms
      - 카카오톡 및 문자 메세지 웹 발송을 지원해주는 REST API 제공 서비스입니다.
      - 단문, 장문, 포도 메세지 등을 보낼 수 있다.
    - api키 생성
    - dependency(nurigo) 삽입
 2. 팀 프로젝트

---
#### 47.2025-04-23
 1. SPRING BOOT - 기상청 api(kma)
    - data.go.kr(정부 api)
      - 인증키
      - 사용법
 2. SPRING BOOT - xml
    - $(xml).find("찾을 변수명").each(){}
    - let tr = $("<tr>") // tr 태그 동적으로 만들기
    - tr.append(td1) // tr태그에 td태그를 넣기
    - $(.ajax클래스명 tbody).append(tr) // tbody안에 tr넣기
 3. 팀 프로젝트

---
#### 46.2025-04-22
 1. SPRING BOOT - ajax(id double check)
 2. 팀 프로젝트

---
#### 45.2025-04-21
 1. SPRING BOOT - 생활형 ai
    - openai api key 등록
    - 헤더 설정
    - 요청 바디 작성
    - 요청 전송
    - postman 확인
 2. SPRING BOOT - ajax(naver book) / keyup
    - $.ajax({});
    - 데이터 가져오기
    - tbody 행추가  ## 템플릿 리터럴 ``(백틱)
    - keyup(키보드 누를 때)
    - let 변수명 = $(값).val().trim() / 입력값 공백없이
    - if(변수명.length>0) / 검색어가 공백이 아닐 때 호출
 3. 팀 프로젝트

---
#### 44.2025-04-18
 1. SPRING BOOT - kakao api
    - 카카오개발자센터
      - 애플리케이션만들기
      - 로그인활성화
      - 동의항목
      - redirect url
      - rest api key
    - 스프링부트 프로젝트
      - pom.xml (dependency 추가)
      - application.properties 등록
        - redirect uri
        - rest api
 2. 팀 프로젝트

---
#### 43.2025-04-17
 1. SPRING BOOT - 스케쥴러
    - @Scheduled - 부품
    - fixedDelay 		  어떤 작업이 끝난 후 지정된 시간에 실행
    - cron			  크론표현식
      - cron = "0 0 0 * * ?"  초  분  시  날짜  월  요일   - 자정
    - (*) 제한없는 모든값
    - (?) 특정값 없음 (대신 다른필드를 기준으로 실행)
    - @EnableScheduling  구동시키기
      - @SpringBootApplication
      - @EnableScheduling
      - public class Boot008ApiApplication {}
 2. SPRING BOOT - 네이버 개발자 (book 검색)
 3. SPRING BOOT - 네이버 개발자 (메일)
    - 보내는 쪽 (naver host , 아이디 , 비번)
    - 받는 사람 (메일 주소)
    - 인증과 함께 보내는 세션설정 (naver host, 인증, 포트, debug, 이메일 전송시 보안연결, ssl 인증서 신뢰, protocols)
    - 메일보내기
 4. 팀 프로젝트

---
#### 42.2025-04-16
 1. SPRING BOOT - upload_img(이미지 업로드 기능)
   - 이미지 업로드 기능 추가
   - 이미지 업로드 view 수정
   - 이미지 수정 기능 추가
 2. 팀 프로젝트

---
#### 41.2025-04-15
 1. SPRING BOOT - paging
    - 변수 생성
      - 전체글
      - 한페이지에 보여줄 게시물의 수
      - 총페이지수
      - 하단의 페이지 나누기
      - 페이지의 스타트번호
      - 현재페이지 번호
      - 시작페이지 번호
      - 끝페이지 번호
    - 계산
      - 전체계산한 값
      - 시작번호 넘겨받은 값
 2. 팀 프로젝트

---
#### 40.2025-04-14
 1. 팀 프로젝트 - Git hub
    - Team Repository 생성
    - 팀원 invite
    - 팀 프로젝트 생성및 회의

---
#### 39.2025-04-11
 1. SPRING BOOT - ERD(Entity Relationship Diagram)
    - 정규화
      - 관계형데이터모델 - 데이터간 관계에 초점을 둔 모델
      - 이상(Anomaly)- 공간낭비
        - 삽입, 갱신, 삭제 이상
      - 정규화? 이상을 제거하는것.
    - erd 핵심구성요소
      - 개체(Entity) - 테이블, 개념의 정보단위
      - 속성(Attribute) - 테이블 열, 가장작은 논리적단위
      - 관계(Relationship) - 외래키
    - 정규화 1NF-5NF (NF:  Normal Form)
      - 1NF : 관계 (최소형) - 최소한 테이블, [중복]되는 항목이 없어야 함.
      - 2NF : 부분함수 종속제거 -  모든속성이 기본키에 완전함수 종속
      - 3NF : 이행함수 종속제거
      - 4NF : 다치종속
      - 5NF : 조인종속
  2. FIGMA
     - UI/UX 디자인 도구
  3. 팀 프로젝트

---
#### 38.2025-04-10
 0. SPRING BOOT - 복습
 1. SPRING BOOT - Security(2)
    - passwordEncoder.encode() : 비밀번호 암호화
    - @NotEmpty(message="알림말") : 공백
    - sec:authorize="isAuthenticated()" : 로그인해야지 사용가능
    - sec:authorize="isAnonymous()" : 권한없어도 사용가능
 2. SPRING BOOT - Security 적용 board
 
---
#### 37.2025-04-09
 0. SPRING BOOT - 복습
 1. SPRING BOOT - CRUD
    - @Modifying : 삽입, 수정, 삭제 쿼리는 변경작업
    - @Transactional : rollback 활성화
    - @Query : crud
 2. SPRING BOOT - Security
    - spring security?
      - 애플리케이션의 보안(인증, 인가) 담당
      - filter의 흐름에 따라 처리
    - 인증 vs 인가
      - 인증 - 본인이 맞는지 확인
      - 인가 - 인증된 사용자가 접근가능
    - spring security 아키텍쳐
      - 사용자가 로그인폼 로그인시도 (username + password 전달)
      - UsernamePasswordAuthentication 요청정보 - Authentication 생성
      - Authentication 인증처리
    - spring security 아키텍쳐 (2)
      - Authentication Manager 인증담당
        - UsernamePasswordAuthentication Token 은 Provider를 찾는데 사용
      - AuthenticationProvider - 로그인정보와 db정보를 비교
      - UserDetailService - db에 있는 사용자 정보 가져오기
    - 인증완료 (사용자정보) SecurityContextHolder에 담기
      - AuthenticationSuccessHandler 성공!
      - AuthenticationFailureHandler 실패!

---
#### 36.2025-04-08
 1. SPRING BOOT - 엔티티
    - @Entity : curd를 spring에서 적용
    - @Id : 기본키(primary key)
    - @GeneratedValue(strategy=GenerationType.IDENTITY) : 숫자자동증가(auto_increment)
    - @Column( updatable=false ) : 수정못하게
    - @OneToMany(mapperBy="부모이름" , cascade=CascadeType.REMOVE) : 부모가 있으면 참조할 수 있게... 자식
    - @ManyToOne
    - @JoinColumn(name="팀 이름") : 팀 셋팅
 2. SPRING BOOT - BOARD

---
#### 35.2025-04-07
 1. SPRING BOOT - setting
    - spring boot project 생성
    - setting( application properties )
       - WebApplication
       - Banner
       - DataSource
       - Jpa
       - Logging
       - Thymeleaf
 2. SPRING BOOT - db
    - jpa
      - application.properties
      - @Entity - Dto / 테이블만들기
      - @Repository - Dao
    - jpa-외래키설정
      - JpaRepository<테이블명, pk의 자료형>{}
      - ManyToOne / OneToMany
 3. SPRING BOOT - view
    - pom.xml 셋팅
    - application.properties 설정 
      - Thymeleaf
      - none=java / servlet=web
    - layout
    - 화면설정

---
#### 34.2025-04-04
 0. SPRING - 복습
 1. SPRING - dto → lombok
    - @Data
 2. SPRING - Aop ( 관점지향프로그래밍 : Aspect Oriented Programming )
    - 핵심기능 vs 부가기능
      - 핵심기능 : 비지니스로직
      - 부가기능 : 비지니스로직 도와주는 기능
    - Aspect
      - AOP ( Aspect Oriented Programming )
      - Aspect : 관점, 어떤행동, 시작, 완료, 반복,,,,, 나타내는 형태
      - Advice(부가기능정의) + PointCut(적용부위) = Aspect
    - 용어
      - Target : 대상
      - Advice : 부가기능정의
      - PointCut : 적용타겟에 메서드로 대상을 선별하는 정규식
      - Weaving : Target(대상)에 Advice(부가기능)를 처리(삽입)하는 과정
    - 특징
      - 프록시기반의 Aop
      - 프록시(대리)
      - 프록시 Target(대상)에 Advice(부가기능)를 처리(삽입)하는 과정에서 생성되는 객체
      - 호출 → [ Proxy[ Target ] ]
 3. SPRING - HikariCP (dbcp / sql 과정다보이게)
 4. SPRING - Tx ( sql 여러개 실행될때 중간에 실패하면 sql 다 처리 안되게)
    - 트랜잭션
    - 여러단계의 처리를 하나의 처리처럼 다루는 기능
    - 반영(commit) / 되돌리기 (rollback)
 5. SPRING - Board-useful 버전

---
#### 33.2025-04-03
 0. SPRING - 복습
 1. SPRING - useful(Jstl)
    - pom.xml 설정
    - Model
      - table
      - dto   UserDto / mapper-config.xml
      - dao   UserDao / user-mapper.xml / root-context.xml (등록)
    - @Repository - Dao ( sql 실행 )
    - @Service : 비즈니스로직 - 처리하는 기능
  2. SPRING - Board-service 버전

---
#### 32.2025-04-02
 0. SPRING - 복습
 1. SPRING - MapperFactoryBean
   - before : Impl 구현클래스삭제 - 구현클래스 없애고.... 안에 있는 설정을 @Autowired private SqlSession sqlSession;  //sql 실행
     - private static final String namespace="com.company.dao.TestDao";
 2. SPRING - MapperScannerConfigurer
    - MapperFactoryBean 매번 설정이 힘듦. 모든 mapper에 설정하기 힘듦
      - MyDao 인터페이스 생성
      - mapper로 만들어주는 interface
      - MyDao root-context.xml 등록
 3. SPRING - mvc controller - 서로 영향없이 쉽게 고칠수 있는 애플리케이션을 만들자!
    - mvc
      - Model : 정보 ( dto, dao, service )
      - View : 화면 ( html, css, js/jquery )
      - Controller : 처리 ( 요청을 받아서 처리후 응답 )
    - mvc1 vs mvc2
      - mvc1 : controller의 역할을 jsp 담당
      - mvc2 : controller의 역할을 servlet 담당
      - Frontcontroller - 공통작업수행 → 세부컨트롤러에 처리
    - SPRING MVC
      - 클라이언트 ( 코요테 - web.xml - root-context.xml / servlet-context.xml / DispatcherServlet )
      - DispatcherServlet - HandlerMapping  - @Controller / 처리할 Controller 확인
      - 세부Controller 클라이언트 요청처리 ( sevice - 비지니스로직 )
      - 요청결과와 View정보를 DispatcherServlet 줌 / View 개체를 생성해서 응답
 4. SPRING - Board-mvc 버전
 5. xml 템플릿 설정, gitgnore 설정

---
#### 31.2025-04-01
 1. SPRING - JDBC/DB 연동
    - DataSource
      - SimpleDriverDataSource 가장단순버젼 : getConnection() 매번생성
 2. SPRING - Mybatis
    - Mybatis
      - sql을 별도로 파일분리해서 관리
      - ORM( object relational mapping) 프레임워크
      - mybatis
        - SqlSessionFactory   SqlSession 생성관리
        - SqlSession : sql실행, 트랜잭션
 3. SPRING - Board project

---
#### 30.2025-03-31
 1. SPRING
    - Step0. jsp
      - mvc1 -  jsp( controller )역할
      - mvc2 - servlet( controller )역할
      - frontcontroller
    - Step1.  framework
      - framework  [  디자인패턴 + 라이브러리 = 프레임워크 ]
      - 소프트웨어 개발의 뼈대역할
 2. SPRING - DI
    - ioc + di
      - ioc
        - inversion of control
        - 인스턴스의 생성~소멸까지 생명주기를 개발자가 아니라 컨테이너가 하는 것
        - pojo ( plain old java object)
    - di ( dependency injection : 의존성주입 )
      - 각 클래스간의 의존관계를  [설정파일]을 통해 [컨테이너]가 자동으로 연결
      - 장점 : 코드단순화 / 결합도 제거
 3. SPRING 실습
    - 설치
    - spring setting
      - dynamic web project
      - configure : [Convert to Maven Project]
      - spring : add Spring project Nature
      - java se-11 / project facts, build path
      - build path-add Libraries-JUnit 4
      - 구조확인
        - pom.xml : 설치 다운로드
        - src/main/java : 실제 자바파일들 위치
        - src/test/java : 실제 테스트파일위치
        - src/main/webapp : jsp 파일들위치
    - spring mvc
      - 검색 : spring
      - legacy project
      - mvc project
    - SPRING 정리
 4. Bean
    - 스프링이 관리하는 객체
    - xml vs Annotation
      - xml [운영]
        - 모든 bean을 명시적으로 xml 에 등록
        - 여러개발자가 같은 설정파일을 공유해서 개발하면 수정시 충돌이 일어날 경우가 많음.
      - Annotation (Bena Scanning ) [개발]
        - @을 붙여서 자동인식
        - 개발속도 향상
        - Bean간의 의족관계를 파악하기 힘듦
    - @Component
      - @Component 일반적인 컴포넌트
      - @Component 구체화된 형식 : @Controller(웹요청받아서 응답), @Service(비즈니스로직), @Repository(db연동)

---
#### 29.2025-03-28
 1. jsp - 필요기능
    - el/jstl
      - el
        - 표현식( 출력 )
        - before:<%= %>
        - after:${}
      - jstl ( JavaServer page Standard Tag Library )
        - 자바코드 대신 태그로 웹페이지 작성
        - before:<%= if() %>
        - after:<c:if test=></c:if> / <c:forEach items="" var></c:forEach>
    - admin만 글쓰기 ( session 정리 )
    - Naver api
    - ajax
 2. jsp - jstl 라이브러리
    - core : 기본적인 기능제공
    - fmt  : format 형식
    - xml  : xml관련처리
    - sql  : sql관련처리
 3. jsp - api / ajax
    
---
#### 28.2025-03-27
 1. jsp - board project
    - DBCP 셋팅
    - frontcontroller 만들기

---
#### 27.2025-03-26
 1. jsp - session 복습
 2. jsp - dbcp(분산응용프로그램)
    - 다운로드 https://commons.org/  [commons] - dbcp, poll, collections
    - [WEB-INF] - [lib] - JAR
    - DBCP - JAVA 파일 만들기 https://tomcat.apache.org/
 3. mvc1 vs mvc2
    - MVC : 서로 영향없이 쉽게 고칠수 있는 애플리케이션
      - M : 애플리케이션의 정보 ( db정보, dto, dao, 비지닉스 login 포함)
      - V : view 사용자가 사용하는 화면
      - C : controller model과 view 사이의 상호작용 관리
    - mvc1 vs mvc2
      - mvc1 - controller 역할을 jsp가 담당
      - mvc2 - controller 역할을 servlet이 담당 
 4. jsp - Login project
---
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

