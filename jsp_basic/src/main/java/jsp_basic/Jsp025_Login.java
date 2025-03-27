package jsp_basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Jsp025_Login
 */
@WebServlet("/user_login")
public class Jsp025_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jsp025_Login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		DBManager db = new DBManager();
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null; ResultSet rset = null;
		String sql = "select count(*) 'cnt' from member where name=? and pass=?";
		int result = -1;
		
		String remember = request.getParameter("remember");
		String cookie = request.getHeader("Cookie");
		
		if(remember != null) {
			Cookie cookie1 = new Cookie("remember", name);
			cookie1.setMaxAge(60*60*24); 
			response.addCookie(cookie1);
		} else {
			Cookie cookie1 = new Cookie("remember", null);
			cookie1.setMaxAge(0); response.addCookie(cookie1);
		  }
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2,pass);
			rset = pstmt.executeQuery();
			if(rset.next()) { result = rset.getInt("cnt"); }
			
			if(result == 1) {
				HttpSession session = request.getSession();
				session.setAttribute("username", name);  // 세션설정
				out.println("<script> location.href='jsp025_my.jsp'; </script>");
			} else { out.println("<script>alert('정보를 확인해주세요.'); history.go(-1); </script>"); }
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rset != null) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}

}
