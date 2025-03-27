<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
	<div class="container my-5">
	<h3 class="text-center">MULTIBOARD 상세보기</h3>
	
		<form action="" method="post" >
			<div class="my-3">
				<span><i class="bi bi-book"></i> 조회수</span>
			</div>
			<div class="my-3">
				<span><i class="bi bi-book"></i> 이름</span>
			</div>
			<div class="my-3">
				<span><i class="bi bi-book"></i> 제목</span>
			</div>
			<div class="my-3">
				<span><i class="bi bi-book"></i> 내용</span>
			</div>
	  	 	<div  class="my-3 text-end">
		  		<input type="submit"   value="입력"  class="btn btn-info btn-block text-white" > 
		  	 	<a href="list.jsp"   class="btn btn-light text-black btn-block" >삭제</a>
		  	 	<a href="list.jsp"   class="btn btn-light text-black btn-block" >목록보기</a>
	  	 	</div>
		</form>
	</div>
<%@ include file="/inc/footer.jsp" %>