<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
	<div class="container my-5">
	<%-- <%=request.getAttribute("update") %> --%>
	<h3 class="text-center">MULTIBOARD-글수정</h3>
		<form action="${pageContext.request.contextPath}/board/update?bno=${dto.bno}" method="post" onsubmit="return form()">
		<h4>UPDATE</h4>
			<div class="mb-3 mt-3">
				<label for="bname" class="form-label">이름</label> <input
					type="text" class="form-control" id="bname" 
					value="${dto.bname}" readonly name="bname">
					
			</div>
			<div class="mb-3">
				<label for="bpass" class="form-label">비밀번호</label> <input
					type="password" class="form-control" id="bpass"
					placeholder="비밀번호을 입력해주세요" name="bpass">
					<span>(*) 수정,삭제시 필수입니다. </span>
			</div>
			<div class="mb-3">
				<label for="btitle" class="form-label">제목</label> <input
					type="text" class="form-control" id="btitle"
					value="${dto.btitle}" name="btitle">

			</div>
			<div class="mb-3">
			<label for="bcontent">내용</label>
			<textarea class="form-control" cols="60" rows="10" id="bcontent" name=bcontent>${dto.bcontent}</textarea>
			</div>
			<div class="text-end">
	  	 	<input type="submit" title="입력하기" class="form-control mb-3 text-center btn btn-info text-white" value="수정">
	  	 	<a href="list" class="mb-3 btn btn-light text-black" style="display: block">취소</a>
	  	 	<a href="list" class="btn btn-light text-black" style="display: block">목록</a>
	  	 	</div>
		</form>
		<script>
			function form() {
				let bpass = document.querySelector("#bpass");
				let btitle = document.querySelector("#btitle");
				let bcontent = document.querySelector("#bcontent");
				
				if(bpass.value == ""){ alert("빈칸입니다"); bpass.focus(); return false; }
				if(btitle.value == ""){ alert("빈칸입니다"); btitle.focus(); return false; }
				if(bcontent.value == ""){ alert("빈칸입니다"); bcontent.focus(); return false; }
			}
		</script>
	</div>
<%@ include file="/inc/footer.jsp" %>