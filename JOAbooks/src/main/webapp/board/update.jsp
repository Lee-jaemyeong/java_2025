<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>
	<div class="container my-5">
	<%-- <%=request.getAttribute("update") %> --%>
	<h3 class="text-center">MULTIBOARD-글수정</h3>
		<form action="edit.do?bno=${update.bno}" method="post" onsubmit="return form()">
		<h4>UPDATE</h4>
			<div class="mb-3 mt-3">
				<label for="bname" class="form-label">이름</label> <input
					type="text" class="form-control" id="bname" 
					value="${update.bname}" readonly name="bname">
					
			</div>
			<div class="mb-3">
				<label for="btitle" class="form-label">제목</label> <input
					type="text" class="form-control" id="btitle"
					value="${update.btitle}" name="btitle">

			</div>
			<div class="mb-3">
			<label for="bcontent">내용</label>
			<textarea class="form-control" cols="60" rows="10" id="bcontent" name=bcontent>${update.bcontent}</textarea>
			</div>
			<div class="text-end">
	  	 	<input type="submit" title="입력하기" class="form-control mb-3 text-center btn btn-info text-white" value="수정">
	  	 	<a href="list.do" class="mb-3 btn btn-light text-black" style="display: block">취소</a>
	  	 	<a href="list.do" class="btn btn-light text-black" style="display: block">목록</a>
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