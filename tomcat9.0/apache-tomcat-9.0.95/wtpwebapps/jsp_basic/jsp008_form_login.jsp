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
		<h3 class="card-header">FORM-LOGIN</h3>
		<pre style="text-align:justify; font-size: 18px">
		처리할 경로 : jsp008_form_login_result.jsp
		주소표시창줄에 노출
		보관용기이름 : email / pass / remember
		</pre>
		<p style="text-align:center"><img src="img/login.png" alt="lodin"></p>
		<form action="jsp008_form_login_result.jsp" method="get">
			<div class="my-3">
				<label for="Email" class="form-label">Email</label>
				<input type="email" class="form-control" id="Email" placeholder="Email" name="email">
				<label for="PASSWARD" class="form-label">PASSWARD</label>
				<input type="password" class="form-control" id="PASSWARD" placeholder="PASSWARD" name="pass">
				<label for="RE" class="form-label">REMEMBER</label>
				<input type="checkbox" id="RE" name="remember">
	  	 	</div>
	  	 	<div>
	  	 		<input type="submit" title="login 하러가기"
	  	 		       class="btn btn-danger" id="check" name="remember">
	  	 	</div>
		</form>
	</div>
</body>
</html>