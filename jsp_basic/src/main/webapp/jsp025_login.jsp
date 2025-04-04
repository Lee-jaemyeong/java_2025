<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<%@ include file="jsp025_header.jsp" %>
<!-- navbar -->
<%
// 쿠키검사
String cookie = request.getHeader("Cookie");
// 찾는쿠키가 null이 아니면 
if(cookie != null) {
	// 하단에 view checked
	String check="checked";
}
%>

	<div class="container my-5">
		<h3>Portfolio</h3>
		<p style="text-align:center"><img src="img/login.png" alt="login"></p>
		<form action="<%=request.getContextPath()%>/user_login" method="post" onsubmit="return login()">
		<h4>LOGIN</h4>
			<div class="my-3">
				<label for="name" class="form-label">아이디</label>
				<input type="text" class="form-control" id="name" placeholder="아이디를 입력하세요" name="name"/>
			</div>
			<div class="my-3">
				<label for="pass" class="form-label">비밀번호</label>
				<input type="password" class="form-control" id="pass" placeholder="비밀번호를 입력하세요" name="pass"/>
			</div>
			<div class="my-3">	
				<input type="checkbox" id="check" name="remember"/>
				<label for="check" class="form-label" 
					<% if("check" != null){%> checked <% }  %>>아이디 기억하기</label>
	  	 	</div>
	  	 	<div  class="my-3 text-end">
	  	 		<input type="submit" title="login 하러가기" class="btn btn-danger" value="LOGIN">
	  	 	</div>
		</form>
		<script>
			function login(){
				let name = document.querySelector("#name");
				let pass = document.querySelector("#pass");
				
				if(name.value == "") {alert("아이디를 입력해주세요"); name.focus(); return false;}
				if(pass.value == "") {alert("비밀번호를 입력해주세요"); pass.focus(); return false;}
			}
		</script>
	</div>
<!-- footer.jsp -->
<%@ include file="jsp025_footer.jsp" %>