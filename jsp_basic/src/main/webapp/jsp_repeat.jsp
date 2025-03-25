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
	<div class="container card my-5">
		<h3 class="card-header" style="background-color:skyblue; color:blue">select box</h3>
		<h3 class="my-2">좋아하는 과일선택</h3>
		<form action="jsp_repeat_info.jsp" method="get" onsubmit="return fruit()">
			<div class="mb-3 mt-3">
				<label for="username" class="form-label" style="font-weight: bold">사용자이름</label>
				 <input type="text" class="form-control" id="username"
					    placeholder="홍길동" name="username">
			</div> <!-- user name -->
			<label for="fname" class="form-label" style="font-weight: bold">좋아하는 과일선택</label>
			<select class="form-select" id="fname" name="fname">
				<option value="" >-- 선택 --</option>
				<option value="apple.jpg">APPLE</option>
				<option value="banana.jpg">BANANA</option>
				<option value="coconut.png">COCONUT</option>
			</select>
			<div class="my-3">
				<button type="submit" class="btn btn-danger">수신체크하러가기</button>
			</div>
		</form>
		<script>
			function fruit() {
				let username = document.querySelector("#username");
				let fname = document.querySelector("#fname")
				
				if(username.value == ""){alert("빈칸입니다."); username.focus(); return false;}
				if(fname.value == ""){alert("과일을 선택해주세요."); fname.focus(); return false;}
			}
		</script>
	</div>
</body>
</html>