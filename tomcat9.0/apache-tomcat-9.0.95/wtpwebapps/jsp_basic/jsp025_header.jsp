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
	<!-- navbar -->
	<nav class="navbar navbar-expand-sm navbar-dark bg-success">
		<div class="container-fluid">
			<a class="navbar-brand" href="jsp025_login.jsp">Portfolio</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#mynavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="mynavbar">
				<ul class="navbar-nav me-auto">
					<li class="nav-item">
					<a class="nav-link" href="javascript:void(0)">Link</a>
					</li>
				</ul>
				<ul class="navbar-nav d-flex">
				<% 	
				  	String id = (String)session.getAttribute("username");
					if(id != null){  %>
						<!-- 로그인 했을 때 -->
						<li class="nav-item">
						<a class="nav-link" href="jsp025_my.jsp"><%=id%></a>
						</li>
						<li class="nav-item">
						<a class="nav-link" href="jsp025_logout.jsp">LOGOUT</a>
						</li>
				<%  } else {  %>
						<!-- 로그인 안했을 때 -->
						<li class="nav-item">
						<a class="nav-link" href="jsp025_login.jsp">LOGIN</a>
						</li>
						<li class="nav-item">
						<a class="nav-link" href="jsp025_login_servlet.jsp">JOIN</a>
						</li>
				<%  }  %>
				</ul>
			</div>
		</div>
	</nav>