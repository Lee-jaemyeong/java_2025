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

@WebServlet("/news")
public class NaverNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public NaverNewsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		try {
			//#1. URL
			String apiurl="https://openapi.naver.com/v1/search/news.json?query="
						  + URLEncoder.encode("AI" , "UTF-8");
			URL url = new URL(apiurl);
				
			//#2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			//#3. 요청설정
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "k397eleMXGY25hqhpx5p");
			conn.setRequestProperty("X-Naver-Client-Secret", "tAjvip6d9j");
			
			//#4. 응답확인 - 200
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
