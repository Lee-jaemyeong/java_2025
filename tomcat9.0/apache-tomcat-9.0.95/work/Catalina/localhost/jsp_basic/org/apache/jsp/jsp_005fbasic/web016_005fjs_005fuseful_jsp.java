/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2025-03-21 09:01:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp_005fbasic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class web016_005fjs_005fuseful_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
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
      out.write("	<!--                                    -->\r\n");
      out.write("	<!--                                    -->\r\n");
      out.write("	<!--                                    -->\r\n");
      out.write("	<!--                                    -->\r\n");
      out.write("	<!--                                    -->\r\n");
      out.write("	<div class=\"p-3 bg-primary text-white \">\r\n");
      out.write("		<h1>008. 유용한 기능</h1>\r\n");
      out.write("		<ol>\r\n");
      out.write("			<li>빈칸검사</li>\r\n");
      out.write("			<li>css 적용</li>\r\n");
      out.write("		</ol>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- end navi  -->\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container card  my-3\">\r\n");
      out.write("		<h3 class=\"card-header\">008. 유용한 기능 - STEP1. 빈칸검사</h3>\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h4>STEP1. 빈칸검사</h4>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col\"> <input type=\"text\" id=\"blank_target\" class=\"form-control\"\r\n");
      out.write("						            placeholder=\"input에서는 value\" />\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col\">\r\n");
      out.write("					<input type=\"button\" value=\"BLANK 검사\" title=\"blank_target\"\r\n");
      out.write("						id=\"blank\" class=\"btn btn-outline-primary\" onclick=\"empty()\" />\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<script>\r\n");
      out.write("		     //작업위치\r\n");
      out.write("		      function empty() {\r\n");
      out.write("		    	 alert('빈칸유효성검사');\r\n");
      out.write("		    	 //1. text칸의 값 확인\r\n");
      out.write("		    	 let target = document.querySelector(\"#blank_target\");\r\n");
      out.write("		    	 //console.log(target); console.log(target.value); console.log(typeof(target.value)); // 빈 문자열도 string\r\n");
      out.write("		    	 //2. 빈칸이라면 빈칸입니다 알림창, 칸에 커서가게\r\n");
      out.write("		    	 if( target.value == \"\" ){ alert(\"빈칸입니다.\"); target.focus(); return; }\r\n");
      out.write("		     }\r\n");
      out.write("		    </script>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- end card-body  -->\r\n");
      out.write("		<!--     -->\r\n");
      out.write("		<!--     -->\r\n");
      out.write("		<hr />\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h4>EX- 빈칸유효성검사</h4>\r\n");
      out.write("			<pre>\r\n");
      out.write("      Q1. #plus_form 안에 있는  \r\n");
      out.write("      Q2. #divide 버튼을 클릭하면 빈칸검사\r\n");
      out.write("      Q3. 빈칸이 아니라면 소수점 둘째자리 나누기 결과를 출력함.\r\n");
      out.write("    </pre>\r\n");
      out.write("			<form action=\"#\" method=\"post\" id=\"plus_form\" onsubmit=\"return form()\">\r\n");
      out.write("				<fieldset>\r\n");
      out.write("				</fieldset>\r\n");
      out.write("					<div class=\"my-3\">\r\n");
      out.write("						<label for=\"one\">숫자입력:</label> \r\n");
      out.write("						<input type=\"text\" id=\"one\" name=\"one\" class=\"form-control\" />\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"my-3\">\r\n");
      out.write("						<label for=\"two\">숫자입력:</label> \r\n");
      out.write("						<input type=\"text\" id=\"two\" name=\"two\" class=\"form-control\" />\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"my-3\">\r\n");
      out.write("						<input type=\"submit\" id=\"result\" value=\"전송\" name=\"result\" class=\"form-control\" />\r\n");
      out.write("					</div>\r\n");
      out.write("			</form>\r\n");
      out.write("			<script>\r\n");
      out.write("    		function form() {\r\n");
      out.write("    			let one = document.querySelector(\"#one\");\r\n");
      out.write("    			let two = document.querySelector(\"#two\");\r\n");
      out.write("    			\r\n");
      out.write("    			if( one.value == \"\"){ alert(\"빈칸입니다.\"); one.focus(); return false; }\r\n");
      out.write("    			if( two.value == \"\"){ alert(\"빈칸입니다.\"); two.focus(); return false; }\r\n");
      out.write("    		}\r\n");
      out.write("    		</script>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- end card-body  -->\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- end container  -->\r\n");
      out.write("\r\n");
      out.write("	<br />\r\n");
      out.write("	<br />\r\n");
      out.write("	<br />\r\n");
      out.write("	<br />\r\n");
      out.write("	<hr />\r\n");
      out.write("	<!--                          -->\r\n");
      out.write("	<!--                          -->\r\n");
      out.write("	<div class=\"container card  my-3\">\r\n");
      out.write("		<h3 class=\"card-header\">008. 유용한 기능 - STEP2. css 적용</h3>\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h4>STEP2. css 적용</h4>\r\n");
      out.write("			<input type=\"button\" value=\"네비게이터\" id=\"fn_css\" title=\"버튼을 클릭하세요\"\r\n");
      out.write("				class=\"btn btn-outline-primary\" />\r\n");
      out.write("			<script>\r\n");
      out.write("       //작업위치 -  브라우저 로딩\r\n");
      out.write("       // Step1. 대상  id=\"fn_css\"  찾기\r\n");
      out.write("       // Step2. #fn_css 클릭 본인이름알림창\r\n");
      out.write("     \r\n");
      out.write("     </script>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- end card-body  -->\r\n");
      out.write("		<!--     -->\r\n");
      out.write("		<!--     -->\r\n");
      out.write("		<hr />\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h4>EX</h4>\r\n");
      out.write("			<pre>\r\n");
      out.write("    1.  #fn_css_test 버튼에  클릭 시  btn-outline-success 가 있다면 btn-outline-danger로\r\n");
      out.write("    2.  #fn_css_test 버튼에  클릭 시  btn-outline-danger  가 있다면 btn-outline-success로\r\n");
      out.write("    </pre>\r\n");
      out.write("			<input type=\"button\" value=\"SUCCESS-DANGER TOGGLE\" id=\"fn_css_test\"\r\n");
      out.write("				title=\"버튼을 클릭하세요\" class=\"btn btn-outline-success\" />\r\n");
      out.write("			<script>\r\n");
      out.write("      // 작업위치 - 브라우저 로딩\r\n");
      out.write("      // Step1. 대상  #fn_css_test  찾기\r\n");
      out.write("      // Step2. 이벤트대상, 이벤트 , 핸들러(처리)\r\n");
      out.write("      // #fn_css_test 버튼에  클릭 시  \r\n");
      out.write("      //           btn-outline-success 가 있다면   btn-outline-danger로\r\n");
      out.write("      //           btn-outline-danger  가 있다면   btn-outline-success로\r\n");
      out.write("      \r\n");
      out.write("    </script>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- end card-body  -->\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- end container  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
