<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>

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
			<c:forEach items="${list}" var="dto" varStatus="status">
				<tr>
					<td>${list.size() - status.index}</td>
					<td><a href="detail.do?bno=${dto.bno}">${dto.btitle}</a></td>
					<td>${dto.bname}</td>
					<td>${dto.bdate}</td>
					<td>${dto.bhit}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p class="text-end"><a href="write_view.do" class="btn btn-info text-white">글쓰기</a></p>
</div>
<%@ include file="/inc/footer.jsp" %>