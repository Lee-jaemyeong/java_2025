package jsp023_servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet003
 */
@WebServlet("/hello")
public class Servlet003 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int initCnt = 1;
	int doGetCnt = 1;
	int destroyCnt = 1;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet003() { super(); }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("#1. init() 첫요청에만 호출 > " + initCnt++);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("파일 조금 수정하고 ctrl + s 저장 ");
		System.out.println("#3. destroy() 맨마지막에만 호출 > " + destroyCnt++);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("#2-1. get > " + doGetCnt++);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("#2-2. post > ");
	}

}
