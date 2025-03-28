package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.service.BDelete;
import com.company.service.BDetail;
import com.company.service.BEdit;
import com.company.service.BEditView;
import com.company.service.BList;
import com.company.service.BWrite;
import com.company.service.BoardService;
import com.company.util.NaverBook;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FrontController() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String path = request.getServletPath();
		
		BoardService service = null;
		
	//	NaverBook book = new NaverBook();
	//	book.getBooks();
		
		if(path.equals("/list.do")) {
			// C:전체리스트        BList        /      V:list.jsp
			service = new BList(); service.exec(request,response);
			request.getRequestDispatcher("board/list.jsp").forward(request, response);
			
		} else if(path.equals("/write_view.do")) {
			// C:X                                          V:write.jsp
			request.getRequestDispatcher("board/write.jsp").forward(request, response);
			
		} else if(path.equals("/write.do")) {
			// C:글삽입             BWrite(알림창- 성공/실패) /   V: /list.do 
			service = new BWrite(); service.exec(request,response);
			// System.out.println( request.getAttribute("result") ); // 1
			String result =  (String) request.getAttribute("result");
			String msg = "관리자에게 문의바랍니다.";
			if(result.equals("1")) {
				msg="글쓰기에 성공했습니다!";
			}
			out.println("<script> alert('"+msg+"'); location.href='list.do'; </script>");
			
		} else if(path.equals("/detail.do")) {
			// C:해당번호 상세보기  BDetail(조회수올리기/해당글상세) / V:detail.jsp
			service = new BDetail(); service.exec(request,response);
			request.getRequestDispatcher("board/detail.jsp").forward(request, response);
			
		} else if(path.equals("/edit_view.do")) {
			// C:BEditView(해당글수정) / V:edit_view.jsp
			service = new BEditView(); service.exec(request,response);
			request.getRequestDispatcher("board/update.jsp").forward(request, response);
			
		} else if(path.equals("/edit.do")) {
			// C:해당번호 글수정기능 BEdit(해당글수정) / V:edit.jsp
			service = new BEdit(); service.exec(request,response);
			String result = (String) request.getAttribute("result");
			String msg = "관리자에게 문의바랍니다.";
			if(result.equals("1")) { msg="글수정에 성공했습니다."; }
			
			out.println("<script> alert('"+msg+"'); location.href='detail.do?bno="+
			                             request.getParameter("bno")+"'; </script>");
			
		} else if(path.equals("/delete.do")) {
			// C:해당번호 글삭제기능 BDelete(해당글삭제) / V:delete.jsp
			service = new BDelete(); service.exec(request,response);
			String result = (String) request.getAttribute("result");
			String msg = "관리자에게 문의바랍니다.";
			if(result.equals("1")) { msg="글삭제에 성공했습니다."; }
			
			out.println("<script> alert('"+msg+"'); location.href='list.do'; </script>");
		}
	}

}
