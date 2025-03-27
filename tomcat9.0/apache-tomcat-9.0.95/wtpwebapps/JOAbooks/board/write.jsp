<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
	<div class="container my-5">
	<h3 class="text-center">MULTIBOARD-글쓰기</h3>
	
		<form action="" method="post" onsubmit="return form()">
		<h4>WRITE(CREATE)</h4>
			<div class="mb-3 mt-3">
				<label for="bname" class="form-label">이름</label> <input
					type="text" class="form-control" id="bname"
					placeholder="이름을 입력해주세요" name="bname">
			</div>
			<div class="mb-3">
				<label for="btitle" class="form-label">제목</label> <input
					type="text" class="form-control" id="btitle"
					placeholder="제목을 입력해주세요" name="btitle">
			</div>
			<div class="mb-3">
			<label for="bcontent">내용</label>
			<textarea class="form-control" rows="5" id="bcontent" name="bcontent"></textarea>
			</div>
			<div class="my-3  text-end">
		  	 	<input type="submit"   value="입력"  class="btn btn-info btn-block text-white" > 
		  	 	<a href="list.jsp"   class="btn btn-light text-black btn-block" >취소</a>
		  	 	<a href="list.jsp"   class="btn btn-light text-black btn-block" >목록보기</a>
	  	 	</div>
		</form>
		<script>
			function form() {
				let bname = document.querySelector("#bname");
				let btitle = document.querySelector("#btitle");
				let bcontent = document.querySelector("#bcontent");
				
				if(bname.value == ""){ alert("빈칸입니다"); bname.focus(); return false; }
				if(btitle.value == ""){ alert("빈칸입니다"); bname.focus(); return false; }
				if(bcontent.value == ""){ alert("빈칸입니다"); bname.focus(); return false; }
			}
		</script>
	</div>
<%@ include file="/inc/footer.jsp" %>