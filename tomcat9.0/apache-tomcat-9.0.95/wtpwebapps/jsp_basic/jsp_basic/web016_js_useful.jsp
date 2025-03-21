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
		<h1>008. 유용한 기능</h1>
		<ol>
			<li>빈칸검사</li>
			<li>css 적용</li>
		</ol>
	</div>
	<!-- end navi  -->

	<div class="container card  my-3">
		<h3 class="card-header">008. 유용한 기능 - STEP1. 빈칸검사</h3>
		<div class="card-body">
			<h4>STEP1. 빈칸검사</h4>
			<div class="row">
				<div class="col"> <input type="text" id="blank_target" class="form-control"
						            placeholder="input에서는 value" />
				</div>
				<div class="col">
					<input type="button" value="BLANK 검사" title="blank_target"
						id="blank" class="btn btn-outline-primary" onclick="empty()" />
				</div>
			</div>
			<script>
		     //작업위치
		      function empty() {
		    	 alert('빈칸유효성검사');
		    	 //1. text칸의 값 확인
		    	 let target = document.querySelector("#blank_target");
		    	 //console.log(target); console.log(target.value); console.log(typeof(target.value)); // 빈 문자열도 string
		    	 //2. 빈칸이라면 빈칸입니다 알림창, 칸에 커서가게
		    	 if( target.value == "" ){ alert("빈칸입니다."); target.focus(); return; }
		     }
		    </script>
		</div>
		<!-- end card-body  -->
		<!--     -->
		<!--     -->
		<hr />
		<div class="card-body">
			<h4>EX- 빈칸유효성검사</h4>
			<pre>
      Q1. #plus_form 안에 있는  
      Q2. #divide 버튼을 클릭하면 빈칸검사
      Q3. 빈칸이 아니라면 소수점 둘째자리 나누기 결과를 출력함.
    </pre>
			<form action="#" method="post" id="plus_form" onsubmit="return form()">
				<fieldset>
				</fieldset>
					<div class="my-3">
						<label for="one">숫자입력:</label> 
						<input type="text" id="one" name="one" class="form-control" />
					</div>
					<div class="my-3">
						<label for="two">숫자입력:</label> 
						<input type="text" id="two" name="two" class="form-control" />
					</div>
					<div class="my-3">
						<input type="submit" id="result" value="전송" name="result" class="form-control" />
					</div>
			</form>
			<script>
    		function form() {
    			let one = document.querySelector("#one");
    			let two = document.querySelector("#two");
    			
    			if( one.value == ""){ alert("빈칸입니다."); one.focus(); return false; }
    			if( two.value == ""){ alert("빈칸입니다."); two.focus(); return false; }
    		}
    		</script>
		</div>
		<!-- end card-body  -->
	</div>
	<!-- end container  -->

	<br />
	<br />
	<br />
	<br />
	<hr />
	<!--                          -->
	<!--                          -->
	<div class="container card  my-3">
		<h3 class="card-header">008. 유용한 기능 - STEP2. css 적용</h3>
		<div class="card-body">
			<h4>STEP2. css 적용</h4>
			<input type="button" value="네비게이터" id="fn_css" title="버튼을 클릭하세요"
				class="btn btn-outline-primary" />
			<script>
       //작업위치 -  브라우저 로딩
       // Step1. 대상  id="fn_css"  찾기
       // Step2. #fn_css 클릭 본인이름알림창
     
     </script>
		</div>
		<!-- end card-body  -->
		<!--     -->
		<!--     -->
		<hr />
		<div class="card-body">
			<h4>EX</h4>
			<pre>
    1.  #fn_css_test 버튼에  클릭 시  btn-outline-success 가 있다면 btn-outline-danger로
    2.  #fn_css_test 버튼에  클릭 시  btn-outline-danger  가 있다면 btn-outline-success로
    </pre>
			<input type="button" value="SUCCESS-DANGER TOGGLE" id="fn_css_test"
				title="버튼을 클릭하세요" class="btn btn-outline-success" />
			<script>
      // 작업위치 - 브라우저 로딩
      // Step1. 대상  #fn_css_test  찾기
      // Step2. 이벤트대상, 이벤트 , 핸들러(처리)
      // #fn_css_test 버튼에  클릭 시  
      //           btn-outline-success 가 있다면   btn-outline-danger로
      //           btn-outline-danger  가 있다면   btn-outline-success로
      
    </script>
		</div>
		<!-- end card-body  -->
	</div>
	<!-- end container  -->


</body>
</html>