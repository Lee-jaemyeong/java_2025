<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>

	<div class="container my-5">
		<h3> NAVER BOOK </h3>
		<div class="result">
		</div>
		
		<script>
		//1. window.onload = function(){}; 브라우저 로딩되면 동작
		// $() jquery
		function loadBooks() {
			$.ajax({
				url:"${pageContext.request.contextPath}/books",
				dataType:"json",
				type:"GET",
				success:function(json){  //Object
					//1. 데이터 분해
					//console.log(json);
					let items = json.items;
					//console.log(items[0]); // 객체1개 items[0] = {title:"",image:"",,,,}
					
					for(let i=0; i<items.length; i++) {
						let div = $('<div class="card my-3">');  //<div></div> 태그만들기
						let p1 = $('<div class="card-body">').html('<img src="'+ items[i].image +'" />');
						let p2 = $('<div class="card-body">').html( items[i].title ); // html reset해서 넣기
						div.append(p1).append(p2);  // div태그 안에 p1추가하고 p2추가
						$(".result").append(div);
					}
					//2. 보여줄 화면에 껴넣기
					
				},error:function(xhr, textStatus, errorThrown){
					$(".result").html(textStatus + "(HTTP-" + xhr.status + "/" + errorThrown);
				} // $(".result") document.querySelector(".result")
			});
			
		}
		$(function() {
			loadBooks();
		}); // 2. jQuery 브라우저 로딩되면 동작
		</script>
		<hr/>
	</div>
	
	<div class="container my-5">
	<h3> NAVER NEWS </h3>
		<div class="result1">
		</div>
		
		<script>
		function loadNews(){
			$.ajax({
				url:"${pageContext.request.contextPath}/news",
				dataType:"json",
				type:"GET",
				success:function(json){
					//1. 데이터 분해
					let items = json.items;
					
					for(let i=0; i<items.length; i++) {
						let div2 = $('<div class="card my-3">');
						let p3 = $('<div class="card-body">').html( items[i].title );
						let p4 = $('<link rel="stylesheet" href="'+ items[i].link +'" />');
						let p5 = $('<div class="card-body">').html(items[i].description);
						div2.append(p3).append(p4).append(p5);
						$(".result1").append(div2);
					}
					
				},error:function(xhr, textStatus, errorThrown){
					$(".result1").html(textStatus + "(HTTP-" + xhr.status + "/" + errorThrown);
				}
			});
			
		}
		
		$(function() {
			loadNews();
		});
		</script>
	</div>
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