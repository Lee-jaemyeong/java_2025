/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2025-03-24 00:09:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class milk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"p-5 bg-secondary text-white\">\r\n");
      out.write("		<h1>MILK ORDER Project</h1>\r\n");
      out.write("		<p>PreparedStatement EX</p>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- bg-primary(파랑) danger(빨강) warning(노랑) dark(블랙) info(하늘색) secondary(회색) -->\r\n");
      out.write("	<!-- 메뉴판 -->\r\n");
      out.write("	<div class=\"container card my-5\">\r\n");
      out.write("		<h3 class=\"card-header text-white bg-success my-3\">Milk MENU</h3>\r\n");
      out.write("\r\n");
      out.write("		<table class=\"table table-bordered table-striped table-hover my-5\">\r\n");
      out.write("			<caption>우유 메뉴</caption>\r\n");
      out.write("			<thead>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th scope=\"col\" class=\"bg-secondary\" style=\"color:white\">NO</th>\r\n");
      out.write("					<th scope=\"col\" class=\"bg-secondary\" style=\"color:white\">NAME</th>\r\n");
      out.write("					<th scope=\"col\" class=\"bg-secondary\" style=\"color:white\">PRICE</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</thead>\r\n");
      out.write("			<tbody>\r\n");
      out.write("				");

				// project mvc1
				// select *from milk; - PreparedStatedment
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rset = null;
				String sql = "select *from milk";
				String url = "jdbc:mysql://localhost:3306/mbasic";
				String id = "root", pass = "1234";

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(url, id, pass);
					pstmt = conn.prepareStatement(sql);
					rset = pstmt.executeQuery();
					while (rset.next()) {
						//out.println(rset.getInt("mno") + "/" + rset.getString("mname") + "/" + rset.getInt("mprice") + "<br/>");
						int mno = rset.getInt("mno");
						String mname = rset.getString("mname");
						int mprice = rset.getInt("mprice") ;
				
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>");
      out.print(mno);
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(mname);
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(mprice);
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

				}
					} catch (Exception e) { e.printStackTrace();
				  	  } finally {
							if (rset != null) { rset.close(); }
							if (pstmt != null) { pstmt.close(); }
							if (conn != null) { conn.close(); }
				  	   	}
				
      out.write("\r\n");
      out.write("			</tbody>\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- 주문현황 -표 -->\r\n");
      out.write("	<div class=\"container card my-5\">\r\n");
      out.write("		<h3 class=\"card-header text-white bg-warning my-3\">MILK ORDER</h3>\r\n");
      out.write("		<table class=\"table table-bordered table-striped table-hover\">\r\n");
      out.write("			<caption>milk 주문현황</caption>\r\n");
      out.write("			<thead>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th scope=\"col\" class=\"bg-secondary\" style=\"color:white\">NO</th>\r\n");
      out.write("					<th scope=\"col\" class=\"bg-secondary\" style=\"color:white\">NAME</th>\r\n");
      out.write("					<th scope=\"col\" class=\"bg-secondary\" style=\"color:white\">NUM</th>\r\n");
      out.write("					<th scope=\"col\" class=\"bg-secondary\" style=\"color:white\">주문날짜</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</thead>\r\n");
      out.write("			<tbody>\r\n");
      out.write("			");

			//PreparedStatement pstmt = null; Connection conn = null; ResultSet rset = null; 앞에서 선언함 
			String msql = "select *from milk_order order by ono desc";
			try{
				//1. Driver 연동
				Class.forName("com.mysql.cj.jdbc.Driver");
				//2. DB 연동
				conn = DriverManager.getConnection(url,id,pass);
				//3. PreparedStatement 이용해서 sql 처리
				pstmt = conn.prepareStatement(msql);
				//4. 결과값 받아서 처리
				rset = pstmt.executeQuery();
				while(rset.next()) {
					out.println("<tr><td>"+rset.getInt("ono")
					            +"</td><td>"+rset.getString("oname")
					            +"</td><td>"+rset.getInt("onum")
				                +"</td><td>"+rset.getString("odate")+"</td></tr>");
				}	
			} catch(Exception e) { e.printStackTrace();
			  } finally {
				 	if(rset != null) { rset.close(); }
			 		if(pstmt != null) { pstmt.close(); }
			 		if(conn != null) { conn.close(); } 
			    }
			
      out.write("\r\n");
      out.write("			</tbody>\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container card my-5\">\r\n");
      out.write("		<h3 class=\"card-header text-white bg-danger my-3\">MILK 주문하러가기</h3>\r\n");
      out.write("		<div id=\"accordion\">\r\n");
      out.write("			<!-- 주문하기 -->\r\n");
      out.write("			<div class=\"card my-3\">\r\n");
      out.write("				<div class=\"card-header bg-secondary\">\r\n");
      out.write("					<a class=\"btn text-white\" data-bs-toggle=\"collapse\"\r\n");
      out.write("						href=\"#collapseOne\" style=\"font-weight: bold\"> 주문하기 </a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div id=\"collapseOne\" class=\"collapse show\"\r\n");
      out.write("					data-bs-parent=\"#accordion\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("					<!--  -->\r\n");
      out.write("					<!-- action=\"처리\"   milk_insert.jsp\r\n");
      out.write("					 method=\"방식\"       데이터 노출안됨 (post)\r\n");
      out.write("					 name               oname, onum              text, number, email\r\n");
      out.write("					 -->\r\n");
      out.write("						<form action=\"milk_insert.jsp\" method=\"post\" onsubmit=\"return form()\">\r\n");
      out.write("							<div class=\"mb-3 mt-3\">\r\n");
      out.write("								<label for=\"oname\" class=\"form-label\">주문할 우유이름</label> <input\r\n");
      out.write("									type=\"text\" class=\"form-control\" id=\"oname\"\r\n");
      out.write("									placeholder=\"주문할 우유이름을 적어주세요!\" name=\"oname\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label for=\"onum\" class=\"form-label\">주문할 우유갯수</label> <input\r\n");
      out.write("									type=\"number\" class=\"form-control\" id=\"onum\"\r\n");
      out.write("									placeholder=\"우유갯수를 적어주세요!\" name=\"onum\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<button type=\"submit\" class=\"btn btn-danger\">주문하기</button>\r\n");
      out.write("						</form>\r\n");
      out.write("					<!--  -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- 주문수정 -->\r\n");
      out.write("			<div class=\"card my-3\">\r\n");
      out.write("				<div class=\"card-header bg-secondary\">\r\n");
      out.write("					<a class=\"collapsed btn text-white\" data-bs-toggle=\"collapse\"\r\n");
      out.write("						href=\"#collapseTwo\" style=\"font-weight: bold\"> 주문수정 </a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div id=\"collapseTwo\" class=\"collapse\" data-bs-parent=\"#accordion\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("					<!--  -->\r\n");
      out.write("					<!-- action=\"처리\"   milk_update.jsp\r\n");
      out.write("					 method=\"방식\"       데이터 노출안됨 (post)\r\n");
      out.write("					 name               ono, oname, onum             number, text, number\r\n");
      out.write("					 -->\r\n");
      out.write("						<form action=\"milk_update.jsp\" method=\"post\" onsubmit=\"return form_up()\">\r\n");
      out.write("							<div class=\"mb-3 mt-3\">\r\n");
      out.write("								<label for=\"ono_update\" class=\"form-label\"> 수정 주문번호 </label> <input\r\n");
      out.write("									type=\"number\" class=\"form-control\" id=\"ono_update\"\r\n");
      out.write("									placeholder=\"수정할 주문번호를 입력해주세요\" name=\"ono\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3 mt-3\">\r\n");
      out.write("								<label for=\"oname_update\" class=\"form-label\">수정 우유이름</label>\r\n");
      out.write("								 <input type=\"text\" class=\"form-control\" id=\"oname_update\"\r\n");
      out.write("									    placeholder=\"수정할 우유이름을 적어주세요!\" name=\"oname\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label for=\"onum_update\" class=\"form-label\">수정 우유갯수</label> \r\n");
      out.write("								<input type=\"number\" class=\"form-control\" id=\"onum_update\"\r\n");
      out.write("									   placeholder=\"수정할 우유갯수를 적어주세요!\" name=\"onum\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<button type=\"submit\" class=\"btn btn-danger\">주문수정하기</button>\r\n");
      out.write("						</form>\r\n");
      out.write("					<!--  -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- 주문삭제 -->\r\n");
      out.write("			<div class=\"card my-3\">\r\n");
      out.write("				<div class=\"card-header bg-secondary\">\r\n");
      out.write("					<a class=\"collapsed btn text-white\" data-bs-toggle=\"collapse\"\r\n");
      out.write("						href=\"#collapseThree\" style=\"font-weight: bold\"> 주문삭제 </a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div id=\"collapseThree\" class=\"collapse\" data-bs-parent=\"#accordion\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("					<!--  -->\r\n");
      out.write("					<!-- action=\"처리\"   milk_delete.jsp\r\n");
      out.write("					 method=\"방식\"       데이터 노출됨 (get)\r\n");
      out.write("					 name               ono                  number\r\n");
      out.write("					 -->\r\n");
      out.write("						<form action=\"milk_delete.jsp\" method=\"get\" onsubmit=\"return form_del()\">\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label for=\"ono_delete\" class=\"form-label\">취소 주문번호</label> \r\n");
      out.write("								<input type=\"number\" class=\"form-control\" id=\"ono_delete\"\r\n");
      out.write("									   placeholder=\"취소할 주문번호를 적어주세요!\" name=\"ono\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<button type=\"submit\" class=\"btn btn-danger\">취소하기</button>\r\n");
      out.write("						</form>\r\n");
      out.write("						<script>\r\n");
      out.write("						function form() {\r\n");
      out.write("							let oname = document.querySelector(\"#oname\");\r\n");
      out.write("							let onum = document.querySelector(\"#onum\");\r\n");
      out.write("							\r\n");
      out.write("							if( oname.value == \"\" ){ alert(\"빈칸입니다.\"); oname.focus(); return false;}\r\n");
      out.write("							if( onum.value == \"\" ){ alert(\"빈칸입니다.\"); onum.focus(); return false;}	\r\n");
      out.write("						}\r\n");
      out.write("						function form_up() {\r\n");
      out.write("							let ono_update = document.querySelector(\"#ono_update\");\r\n");
      out.write("							let oname_update = document.querySelector(\"#oname_update\");\r\n");
      out.write("							let onum_update = document.querySelector(\"#onum_update\");\r\n");
      out.write("							\r\n");
      out.write("							if( ono_update.value == \"\" ){ alert(\"빈칸입니다.\"); ono_update.focus(); return false;}\r\n");
      out.write("							if( oname_update.value == \"\" ){ alert(\"빈칸입니다.\"); oname_update.focus(); return false;}\r\n");
      out.write("							if( onum_update.value == \"\" ){ alert(\"빈칸입니다.\"); onum_update.focus(); return false;}\r\n");
      out.write("						}\r\n");
      out.write("						function form_del() {\r\n");
      out.write("							let ono_delete = document.querySelector(\"#ono_delete\");\r\n");
      out.write("							\r\n");
      out.write("							if( ono_delete.value == \"\" ){ alert(\"빈칸입니다.\"); ono_delete.focus(); return false;}\r\n");
      out.write("						}\r\n");
      out.write("						</script>\r\n");
      out.write("					<!--  -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
