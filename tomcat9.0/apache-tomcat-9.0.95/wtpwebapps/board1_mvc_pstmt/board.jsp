<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card my-5">
		<h3 class="card-header"></h3>
		<table class="table table-bordered table-striped">
			<caption></caption>
			<thead>
				<tr>
					<th scope="col"  style="color: gray">BNO</th>
					<th scope="col"  style="color: gray">TITLE</th>
					<th scope="col"  style="color: gray">WRITER</th>
					<th scope="col"  style="color: gray">DATE</th>
					<th scope="col"  style="color: gray">HIT</th>
				</tr>
			</thead>
			<tbody>
				<%
				Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null;
				String url = "jdbc:mysql://localhost:3306/mbasic";
				String id = "root",pass = "1234";
				String sql = "select *from mvcborad1 order by bno desc";
				
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(url, id, pass);
					pstmt = conn.prepareStatement(sql);
					rset = pstmt.executeQuery();
					
					while (rset.next()) {
						out.println("<tr><td>" + rset.getInt("bno") + "</td><td>" + rset.getString("btitle") + "</td><td>"
						+ rset.getString("bname") + "</td><td>" + rset.getString("bdate") + "</td><td>" + rset.getInt("bhit") +"</td></tr>");
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (rset != null) { rset.close(); }
					if (pstmt != null) { pstmt.close(); }
					if (conn != null) { conn.close(); }
				}
				%>
			</tbody>
		</table>
		<div>
			<form action="board_insert.jsp" method="post" >
				<button type="submit" class="btn btn-dark color-white">글쓰기</button>
			</form>
		</div>
	</div>
</body>
</html>