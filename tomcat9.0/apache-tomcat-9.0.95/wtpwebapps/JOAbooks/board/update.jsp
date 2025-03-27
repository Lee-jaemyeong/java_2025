<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
	<div class="container my-5">
	<h3 class="text-center">MULTIBOARD-글수정</h3>
	
		<form action="/action_page.php" method="post" onsubmit="return form()">
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
			<div class="my-3  text-end">
		  	 	<input type="submit"   value="입력"  class="btn btn-info btn-block text-white" > 
		  	 	<a href="list.jsp"   class="btn btn-outline-light btn-block" >취소</a>
		  	 	<a href="list.jsp"   class="btn btn-outline-light btn-block" >목록보기</a>
	  	 	</div>
		</form>
		<script>
		function form(){  
			let bname = document.getElementById("bname");
			let btitle = document.getElementById("btitle");
			let bcontent = document.getElementById("bcontent");
		
			if(bname.value ==""){alert("빈칸입니다");   bname.focus();  return false; }
			if(btitle.value ==""){alert("빈칸입니다");   btitle.focus();  return false; }
			if(bcontent.value ==""){alert("빈칸입니다");   bcontent.focus();  return false; }
		}
		</script>
	</div>
<%@ include file="/inc/footer.jsp" %>