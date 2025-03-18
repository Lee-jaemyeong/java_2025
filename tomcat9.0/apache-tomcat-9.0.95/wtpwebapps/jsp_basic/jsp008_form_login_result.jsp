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
		<h3 class="card-header">LOGIN RESULT</h3>
		<%
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			String remember = request.getParameter("remember");
		%>
		<!-- <div  style="font-size:20px"> -->
		<div  class="alert alert-warning h5 my-3">
			Email : <%=email%><br/>
			PASS  : <%=pass%><br/>
			remember : <%=remember%><br/>
		</div>
		<p><a href="javascript:history.go(-1)" title="로그인 폼으로 돌아가기" class="btn btn-danger"> 처음으로 </a></p>
	</div>
</body>
</html>