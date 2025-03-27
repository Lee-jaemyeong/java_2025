<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
	<div class="container my-5">
	<h3 class="text-center">MULTIBOARD-글수정</h3>
	
		<form action="/action_page.php">
		<h4>UPDATE</h4>
			<div class="mb-3 mt-3">
				<label for="name" class="form-label">이름</label> <input
					type="text" class="form-control" id="name"
					placeholder="이름을 입력해주세요" name="name">
			</div>
			<div class="mb-3">
				<label for="title" class="form-label">제목</label> <input
					type="text" class="form-control" id="title"
					placeholder="제목을 입력해주세요" name="title">
			</div>
			<div class="mb-3">
			<label for="comment">내용</label>
			<textarea class="form-control" rows="5" id="comment" name="text"></textarea>
			</div>
	  	 	<input type="submit" title="글입력하기" class="form-control mb-3 text-center bg-info text-white" value="입력">
	  	 	<input type="submit" title="취소하기" class="form-control mb-3 text-center bg-light text-black" value="취소">
	  	 	<input type="submit" title="글쓰러가기" class="form-control mb-3 text-center bg-light text-black" value="목록보기">
		</form>
	</div>
<%@ include file="/inc/footer.jsp" %>