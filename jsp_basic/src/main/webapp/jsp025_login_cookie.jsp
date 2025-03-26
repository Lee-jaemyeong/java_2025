<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		String remember = request.getParameter("remember");
		String name = request.getParameter("name");

		if(remember != null) {
			Cookie cookie = new Cookie("remember", name);
			cookie.setMaxAge(60*60*24); 
			response.addCookie(cookie);
			if(cookie != null) {
				Cookie[] cookies = request.getCookies();
				for(Cookie c : cookies){ 
					out.println(c.getValue());
				}
			}
		} else {
			Cookie cookie = new Cookie("remember", null);
			cookie.setMaxAge(0); response.addCookie(cookie);
		  }
		response.sendRedirect("jsp025_login.jsp");
	%>