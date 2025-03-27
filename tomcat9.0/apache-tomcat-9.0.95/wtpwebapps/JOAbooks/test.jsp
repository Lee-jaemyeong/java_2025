<%@page import="com.company.domain.BoardVo"%>
<%@page import="com.company.dao.BoardDao"%>
<%@page import="org.apache.commons.collections4.bag.SynchronizedSortedBag"%>
<%@page import="java.sql.*"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="inc/header.jsp" %>

	<div class="container card my-5">
		<h3 class="card-header">PROJECT (1) 셋팅</h3>
		
	<h4>ERROR TEST</h4>
	<!-- error 404 -->
	<p><a href="no.jsp" class="btn btn-danger">NO PAGE</a></p>
	<!-- error 500 -->
	<%-- <%= null %> --%>
	
	<h4>DBCP TEST</h4>
	<%-- <%
		Context initContext = new InitialContext(); // Context 찾겠다 - Resource
		Context envContext  = (Context)initContext.lookup("java:/comp/env"); // 환경Context
		DataSource ds = (DataSource)envContext.lookup("jdbc/mbasic"); // pool 이름
		Connection conn = ds.getConnection(); // db연동
		out.println("db연동");
	%> --%>
	</div>
	
	<div class="container card my-5">
		<h3 class="card-header">PROJECT (2) MODEL</h3>
		<pre>
		1. Dto       : [com.company.domain]    - BoardVO     private
  		2. DBManager : [com.company.dbmanager] - DBManager
 		3. Dao       : [com.company.dao]       - BoardDao
		</pre>
		<%
		BoardDao dao = new BoardDao();
		//6. delete
		System.out.println( dao.delete(3) );
		System.out.println( dao.select(3) );
		
		//5. update
		/*
		BoardVo vo = new BoardVo();
		vo.setBtitle("제목-new");
		vo.setBcontent("내용-new");
		vo.setBno(3);
		System.out.println( dao.update(vo) ); //1
		System.out.println( dao.select(3) );
		*/
		
		//4. updateHit
		//System.out.println(dao.updateHit(3)); // 1 성공, -1 실패
		
		//3. select
		//System.out.println(dao.select(3));  // 있는 번호!
		
		
		//2. insert( BoardVo vo ) - btitle, bcontent, bname
		/* 	
		BoardVo vo = new BoardVo();
		vo.setBtitle("제목");
		vo.setBcontent("내용");
		vo.setBname("first");
		System.out.println( dao.insert(vo) ); 
		*/
		
		//1. selectAll
		/* System.out.println( dao.selectAll() ); */
		
		/* System.out.println( dao.update(vo) ); */
		%>
	</div>
	
	<div class="container card my-5">
		<h3 class="card-header">PROJECT (3) VIEW</h3>
		<pre>
		[webapp] - [board]
		            ㄴ list.jsp
		            ㄴ write.jsp		 
		            ㄴ detail.jsp
		            ㄴ update.jsp
		1. markup
		2. validator - 오류검사
		3. 빈칸검사          
		</pre>	
	</div>

<%@ include file="inc/footer.jsp" %>