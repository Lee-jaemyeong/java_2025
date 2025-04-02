<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
	<div class="container my-5">
	<%-- <%=request.getAttribute("detail") %> --%>
	<h3 class="text-center">MULTIBOARD 상세보기</h3>
		<form action="write.do" method="post" >
			<div class="my-3">
				<span><i class="bi bi-book"></i> 조회수</span>
				<p>${detail.bhit}</p> <!-- detail.gethit() -->
			</div>
			<div class="my-3">
				<span><i class="bi bi-book"></i> 이름</span>
				<p>${detail.bname}</p> <%-- <% detail.getBname() %> --%>
			</div>
			<div class="my-3">
				<span><i class="bi bi-book"></i> 제목</span>
				<p>${detail.btitle}</p>
			</div> <!-- http://localhost:8080/JOAbooks/detail.do?bno=6 -->
			<div class="my-3">
				<span><i class="bi bi-book"></i> 내용</span>
				<textarea class="form-control" readonly>${detail.btitle}</textarea>
			</div>
	  	 	<div  class="my-3 text-end">
	  	 		<a href="edit_view.do?bno=${detail.bno}" class="btn btn-info text-white">수정</a>
	  	 		<a href="delete.do?bno=${detail.bno}" class="btn btn-info text-white">삭제</a>
	  	 		<a href="list.do" class="btn btn-light text-black">목록</a>
	  	 	</div>
		</form>
	</div>
<%@ include file="/inc/footer.jsp" %>