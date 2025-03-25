<%@page import="java.awt.font.ImageGraphicAttribute"%>
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
		<h3 class="card-header" style="background-color:skyblue; color:blue">좋아하는 과일 정보</h3>
		<%
			String username = request.getParameter("username");
			String fname = request.getParameter("fname");
			String btn = fname.equals("apple.jpg") ? "btn-danger"
						:fname.equals("banana.jpg") ? "btn-warning"
						: "btn-success";
		%>
		<table class="table table-striped" >
			<caption></caption>
			<tbody>
				<tr><th scope="row">유저정보</th><td><%=username%></td></tr>
				<tr><th scope="row" style="background-color:lightgreen"></th><td style="background-color:lightgreen">
				    <img src="img/<%=fname%>" alt="<%=fname%>"/>
				</td></tr>
			</tbody>
		</table>
		<p><a href="javascript:history.go(-1)" class="btn <%=btn%>">BACK</a></p>
	</div>
</body>
</html>