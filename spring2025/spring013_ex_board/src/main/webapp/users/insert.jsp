<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Insert </title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card">
		<h3 class="card-header bg-success text-white"> USERS </h3>
		<!--   for( UserDto u : list ){}    -->
		<c:forEach var="u" items="${list}" varStatus="status" >
		<div class="alert alert-warning my-3">
			<a href="detail.user?no=${u.no}">	
			 	NO : ${u.no} - NAME : ${u.name} - AGE : ${u.age} 
			</a>
			
			<a href="delete.user?no=${u.no}" class="btn btn-danger">삭제</a>
		</div>
		</c:forEach>
	</div>
	<!-- insert -->
	<div class="container card my-3">
		<form method="post" action="insert.user" id="userInsert" onsubmit="return form()">
			<fieldset>
				<legend>유저입력폼</legend>
				<div class="form-group">
					<label for="name">이름</label> <input type="text" name="name"
						id="name" class="form-control" />
				</div>
				<div class="form-group">
					<label for="age">나이</label> <input type="number" name="age"
						id="age" class="form-control" />
				</div>
				<div class="form-group">
					<input type="submit" value="전송" class="btn  btn-danger" />
				</div>
			</fieldset>
		</form>
	</div>
	<script>
		function form() {
			let name=document.querySelector("#name")
			let age=document.querySelector("#age")
				
			if(name.value==""){ alert("빈칸입니다."); name.focus(); return false; } 
			if(age.value==""){ alert("빈칸입니다."); age.focus(); return false; } 
		}
	</script>
</body>
</html>