package com.company.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NaverBookServlet
 */
@WebServlet("/books")
public class NaverBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NaverBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		try {
			//#1. URL
			//  https://openapi.naver.com/v1/search/news.xml	XML
			//  https://openapi.naver.com/v1/search/news.json	JSON
			String apiurl="https://openapi.naver.com/v1/search/news.json?query="
						  + URLEncoder.encode("요리" , "UTF-8");
			URL url = new URL(apiurl);
			//		* query / UTF-8로 인코딩   쿼리 스트링 형식 - 요청사항 주소표시창줄로 데이터 넘기기
			//                               주소?이름=값&이름=값
				
			//#2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			//#3. 요청설정
			//		* GET
			//		> X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
			//		> X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "k397eleMXGY25hqhpx5p");
			conn.setRequestProperty("X-Naver-Client-Secret", "tAjvip6d9j");
			
			//#4. 응답확인 - 200
			//  System.out.println(conn.getResponseCode());
			int code = conn.getResponseCode();
			BufferedReader br;
			if(code==200) {br = new BufferedReader(new InputStreamReader(conn.getInputStream()));}
			else {br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));}
			
			//#5. 응답데이터 - xml/json/csv
			String line=""; StringBuffer sb = new StringBuffer();
			while( (line=br.readLine()) != null ) { sb.append(line + "\n"); }
			
			System.out.println(sb.toString());
			br.close(); conn.disconnect();
			
			PrintWriter out = response.getWriter();
			out.println(sb.toString()); // ##
			
		 }catch(Exception e) {e.printStackTrace();}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
