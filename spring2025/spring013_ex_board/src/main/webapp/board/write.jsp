<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
	<div class="container my-5">
	<h3 class="text-center">MULTIBOARD-글쓰기</h3>
	
		<form action="${pageContext.request.contextPath}/board/write" method="post" onsubmit="return form()">
		<h4>WRITE(CREATE)</h4>
			<div class="mb-3 mt-3">
				<label for="bname" class="form-label">이름</label> <input
					type="text" class="form-control" id="bname"
					placeholder="이름을 입력해주세요" name="bname">
			</div>
			<div class="mb-3">
				<label for="bpass" class="form-label">비밀번호</label> <input
					type="text" class="form-control" id="bpass"
					placeholder="비밀번호을 입력해주세요" name="bpass">
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
			<div  class="my-3 text-end">
	  	 		<input type="submit" title="입력하기" class="btn btn-info text-white"  value="입력">
	  	 	</div>
		</form>
		<form action="list" method="get">
			<div class="text-end">
	  	 		<input type="submit" title="취소" class="btn btn-light text-black"  value="취소">
	  	 	</div>
	  	 	<div class="my-3 text-end">
	  	 		<input type="submit" title="목록보기" class="btn btn-light text-black"  value="목록보기">
	  	 	</div>
	  	 </form>
		<script>
			function form() {
				let bname = document.querySelector("#bname");
				let bpass = document.querySelector("#bpass");
				let btitle = document.querySelector("#btitle");
				let bcontent = document.querySelector("#bcontent");
				
				if(bname.value == ""){ alert("빈칸입니다"); bname.focus(); return false; }
				if(bpass.value == ""){ alert("빈칸입니다"); bpass.focus(); return false; }
				if(btitle.value == ""){ alert("빈칸입니다"); bname.focus(); return false; }
				if(bcontent.value == ""){ alert("빈칸입니다"); bname.focus(); return false; }
			}
		</script>
	</div>
<%@ include file="/inc/footer.jsp" %>