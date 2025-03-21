<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<!--                                    -->
	<!--                                    -->
	<!--                                    -->
	<!--                                    -->
	<!--                                    -->
	<div class="p-3 bg-primary text-white ">
		<h1>007. CONTROL</h1>
		<ol>
			<li>IF</li>
			<li>SWITCH</li>
			<li>FOR/WHILE/DO WHILE</li>
		</ol>
	</div>
	<!--                                    -->
	<!--                                    -->
	<div class="container card  my-3">
		<h3 class="card-header">007. CONTROL - Step1. IF</h3>
		<div class="card-body">
			<script>
				// 작업위치
				/*
				  if(조건) {  조건이 맞으면 true }
				  else{   조건이 다르면 false }
				 */
				 //1. 출력구문
				 document.write("정리1. 출력");
				 document.write("<p>하고싶은말~!</p>");
				 console.log("안녕! javascript"); // 브라우저-개발자모드(f12)-console
				 
				 //2. var, let, const
				 // 런타임보다 먼저 실행 - 호이스팅( var, function, class,,,, )
				 // var - 전역변수
				 // let - 지역변수 ( 변수중복 선언불가)
				 // const - 상수
				 document.write("<br/>정리2. var, let, const");
				 
				 //3. 자료형
				 document.write("<br/>정리3. 자료형");
				 let d1; console.log(d1);  // undefined
				 d1=10;  d1=3.14;  d1="abc"; d1=true; d1=["sally",3,7,8];  d1={};
				 d1=function(){};
				 
				 test3=10;
				 console.log( test3 + "10" ); //1010 - 원하는 결과물 : 20
				 console.log( typeof(test3) + typeof("10") ); // number - string
				 console.log( test3 + Number("10") ); // number - number  20
				                      // Number 문자열을 숫자로
				 
				 //4. 알림창
				 document.write("<br/>정리4. 알림창");
			</script>
			<button class="btn btn-outline-primary" onclick="alert('홀길동')">alert</button>
			<button class="btn btn-outline-primary" onclick="prompt('물어보고싶은말')">prompt</button>
			<button class="btn btn-outline-primary" onclick="confirm('취소?')">confirm</button>
			
			<h4>EX1</h4>
			<button class="btn btn-success" onclick="yourname()">YOURNAME</button>
			<script>
			function yourname(){
				let name = prompt('당신의 이름은?'); //1. 사용자에게 이름입력받아
				alert('반갑습니다~' + name + '님!'); //2. 반갑습니다~ 고객님!
			}
			</script>	
			
			<h4>EX2</h4>
			<button class="btn btn-success" onclick="plus()">PLUS</button>
			<script>
			function plus(){
				let num1 = prompt('숫자입력1'); // string
				let num2 = prompt('숫자입력2'); // string
				let result = Number(num1)+Number(num2)
				alert(num1 + "+" + num2 + "=" + result);
			}
			
			</script>		
			<h4>Step1. IF</h4>
			<script>
				let if1 = 2;
				if(if1==2){console.log("2이다");}
				else{ console.log("2가 아니다"); }
				
			</script>
				
		</div>
		<!--     -->
		<!--     -->
		<hr />
		<div class="card-body">
			<h4>EX</h4>
			<pre>
      평균을 입력하세요 __입력받기
      만약 평균이 60점 이상(60점포함)이라면 합격, 아니면 불합격 출력
    </pre>
			<input type="button" value="ex1" id="ex1" title="버튼을 클릭하세요"
				class="btn btn-success" onclick="ex1()" />
			<script>
				// 작업위치
				function ex1() {
					let avg = prompt('평균을 입력하세요');
					if(avg >= 60) {alert('합격');}
					else{alert('불합격');}
				}
			</script>
		</div>
	</div>




	<!--                                    -->
	<!--                                    -->
	<div class="container card  my-3">
		<h3 class="card-header">007. CONTROL - Step2. SWITCH</h3>
		<div class="card-body">
			<h4>Step2. SWITCH</h4>
			<script>
				/*
				swtich(  처리하고 싶은 대상    ){
				    case 대상의상태:    처리;  break;
				    case 대상의상태:    처리;  break;
				    case 대상의상태:    처리;  break;
				    default : 기본처리
				} */

				// 작업위치
				let sw = 2;
				switch(sw){
				 case 1 : console.log('1이다'); break;
				 case 2 : console.log('2이다'); break;
				 case 3 : console.log('3이다'); break;
				 default : console.log('1,2,3이 아니다');
				}
				
			</script>
		</div>
		<!--     -->
		<!--     -->
		<hr />
		<div class="card-body">
			<h4>EX</h4>
			<pre>
      4,5,6 중에 입력하세요
      4번 월드콘  ,  5번 구구콘 , 6번 설레임 알림창을 띄우시오.
    </pre>
			<input type="button" value="switch1" id="switch1" title="버튼을 클릭하세요"
				class="btn btn-success" onclick="switch1()" />
			<script>
				// 작업위치
				//1. switch 
				function switch1() {
					let ice = prompt('4,5,6중에 입력하세요');
					switch (ice) {
					case '4': alert('월드콘'); break;
					case '5': alert('구구콘'); break;
					case '6': alert('설레임'); break;
					default : ('4,5,6중에 입력하세요');
					}
				}
				//2.  switch1
			</script>
		</div>
	</div>




	<!--                                    -->
	<!--                                    -->
	<div class="container card  my-3">
		<h3 class="card-header">007. CONTROL - Step3. FOR/WHILE/DO WHILE</h3>
		<div class="card-body">
			<h4>Step3. FOR/WHILE/DO WHILE</h4>
			<script>
				/* STEP1 for  - 반복횟수 알때
				   for(  초기문; 조건문; 증감문 ){  }
				 */

				//1. 영역 :  복붙-복사하는 한줄 { 반복되는 영역 }    -  {  console.log(1); }
				//2. 변수 : {반복 영역 - 변수}                      -  {  console.log(i); }    
				//3. 패턴 : for(시작; 종료; 변화) 
				// 작업위치
			</script>
		</div>
		<!--     -->
		<!--     -->
		<hr />
		<div class="card-body">
			<h4>EX</h4>
			<pre>
    for 
    Q1)		1	2	3	4	5
    Q2)		5	4	3	2	1
    Q3)		2	4	6 
    Q4)		hello1		hello2		hello3
    </pre>
			<script>
				// for, while, do while
				//A1)		1	2	3	4	5
				for(let i=1;i<=5;i++){
					document.write(i +"\t");
				}
				document.write("<br/>")
				let i=1; while(i<=5) {document.write(i+"\t"); i++;}
				document.write("<br/>")
				i=1; do{document.write(i+"\t"); i++;} while(i<=5);
				document.write("<br/>")
				//A2) 5 4 3 2 1
				for(let i=5;i>=1;i--) {
					document.write(i+"\t");
				}
				document.write("<br/>")
				let i1=5; while(i1>=1) {document.write(i1+"\t"); i1--;}
				document.write("<br/>")
				i1=5; do{document.write(i1+"\t"); i1--;} while(i1>=1);
				document.write("<br/>")
				//A3) 2 4 6
				for(let i2=1;i2<=6;i2++) {
					if(i2%2==0){document.write(i2+"\t");}
				}
				document.write("<br/>")
				let i2=1; while(i2<=6) {if(i2%2==0){document.write(i2+"\t");} i2++;}
				document.write("<br/>")
				i2=1; do {if(i2%2==0){document.write(i2+"\t");} i2++;} while(i2<=6);
				document.write("<br/>")
				//A4) hello1  hello2 hello3
				for(let i3=1;i3<=3;i3++) {
					document.write("hello "+i3+"\t");
				}
				document.write("<br/>")
				let i3=1; while(i3<=3) {document.write("hello "+i3+"\t"); i3++;}
				document.write("<br/>")
				i3=1; do {document.write("hello "+i3+"\t"); i3++;} while(i3<=3);
				document.write("<br/>")
				
				//A5)  const list1=[1,2,3,4,5];
				// 향상된 for , forEach
				const list1=[1,2,3,4,5];
				for(let li in list1) {document.write(li + "-" +list1[li] + "<br/>");}
				for(let li of list1) {document.write(li  + "<br/>");}

				document.write("<br/>")
				list1.forEach( (value, index, list1 )=>{
					document.write( value + "/" + index + "/" + list1 + "<br/>" );
				});
				document.write("<br/>")
				
				//Q1. const list2 = ['a','b','c','d']
				const list2 = ['a','b','c','d']
				// 향상된 for
				for(let i in list2) {document.write(i + "-" +list2[i] + "<br/>");}
				for(let i of list2) {document.write(i+ "<br/>");}
				// forEach 연습
				list2.forEach((value,index,list2)=>{
					document.write(value + "/" + index + "/" + list2 + "<br/>");
				});
			</script>
		</div>
	</div>


</body>
</html>