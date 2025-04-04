<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>
	<div class="container my-5">
	<h3 class="text-center">MULTIBOARD 상세보기</h3>
		<form action="board/write" method="post" >
			<div class="my-3">
				<span><i class="bi bi-book"></i> 조회수</span>
				<p>${dto.bhit}</p> 
			</div>
			<div class="my-3">
				<span><i class="bi bi-book"></i> 이름</span>
				<p>${dto.bname}</p>
			</div>
			<div class="my-3">
				<span><i class="bi bi-book"></i> 제목</span>
				<p>${dto.btitle}</p>
			</div>
			<div class="my-3">
				<span><i class="bi bi-book"></i> 내용</span>
				<textarea class="form-control" readonly>${dto.bcontent}</textarea>
			</div>
	  	 	<div  class="my-3 text-end">
	  	 		<a href="${pageContext.request.contextPath}/board/update?bno=${dto.bno}" class="btn btn-info text-white">수정</a>
	  	 		<a href="${pageContext.request.contextPath}/board/delete?bno=${dto.bno}" class="btn btn-info text-white">삭제</a>
	  	 		<a href="list" class="btn btn-light text-black">목록</a>
	  	 	</div>
		</form>
	</div>
<%@ include file="../inc/footer.jsp" %>