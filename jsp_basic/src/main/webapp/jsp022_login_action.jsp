<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<%
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null;
		String url ="jdbc:mysql://localhost:3306/mbasic";
		String id = "root", passw = "1234";
		String sql = "select count(*) `cnt` from member where name=? and pass=?";
		int result = -1;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,passw);
			// if(conn!=null) {out.println("DB 연동!");}
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			rset = pstmt.executeQuery();
			if (rset.next()) { result = rset.getInt("cnt"); }
			
			if(result == 1) { // 아이디와 비밀번호가 같은 사람 1명
				request.getRequestDispatcher("jsp022_my.jsp").forward(request, response);
				session.setAttribute("username", name); // 세션정보유지하기 #
			} else { out.println("<script>alert('정보를 확인해주세요.'); history.go(-1); </script>"); }
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rset != null){rset.close();}
			if(pstmt != null){pstmt.close();}
			if(conn != null){conn.close();}
		}
		%>
