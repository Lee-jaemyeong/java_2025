<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>

<script>
//	window.onload=function(){}; 브라우저로딩 작업  맨 마지막 1번만
//	window.addEventListener("load" , function(){});
//	jQuery(document).ready(function(){});
//	$(document).ready(function(){});
	$(function(){
		let result = '${result}';  console.log(result);
		if(result == 'fail'){ alert('비밀번호를 확인해주세요'); history.go(-1); }
		else if(result.length != 0) { alert( result ); }
	});
</script>

	<div class="container my-5">
	<h3 class="text-center">MULTIBOARD</h3>
	<%-- <%=request.getAttribute("list") %> --%>
	<table class="table table-striped">
	<caption>MULTIBOARD-MVC1</caption>
		<thead>
			<tr>
				<th scope="col">NO</th>
				<th scope="col">TITLE</th>
				<th scope="col">WRITER</th>
				<th scope="col">DATE</th>
				<th scope="col">HIT</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list}" varStatus="status" >
				<tr>
					<%-- <td>${status.index+1}</td> 맨위가 1부터 시작 --%>
					<td>${list.size() - status.index}</td>
					<td><a href="${pageContext.request.contextPath}/board/detail?bno=${dto.bno}">${dto.btitle}</a></td>
					<td>${dto.bname}</td>
					<td>${dto.bdate}</td>
					<td>${dto.bhit}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p class="text-end"><a href="${pageContext.request.contextPath}/board/write" class="btn btn-info text-white">글쓰기</a></p>
</div>
<%@ include file="/inc/footer.jsp" %>