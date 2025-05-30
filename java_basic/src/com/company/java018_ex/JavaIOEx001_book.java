package com.company.java018_ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class JavaIOEx001_book {
	public static void main(String[] args) {
	 try {
		//#1. URL
		String apiurl = "https://openapi.naver.com/v1/search/book.xml?query=" 
					 + URLEncoder.encode("고양이", "UTF-8");
		URL url = new URL(apiurl);
		
		//#2. HttpURLConnection
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		//#3. 요청설정
		conn.setRequestMethod("GET");
		conn.setRequestProperty("X-Naver-Client-Id", "k397eleMXGY25hqhpx5p");
		conn.setRequestProperty("X-Naver-Client-Secret", "tAjvip6d9j");
		
		//#4. 응답확인 - 200
		// System.out.println(conn.getResponseCode());
		int code = conn.getResponseCode();
		BufferedReader br;
		if(code==200) { br= new BufferedReader(new InputStreamReader(conn.getInputStream()));}
		else {br= new BufferedReader(new InputStreamReader(conn.getErrorStream()));}
		
		//#5. 응답데이터 - xml/json/csv
		String line=""; StringBuffer sb = new StringBuffer();
		while((line=br.readLine()) != null) {sb.append(line + "\n");}
		
		System.out.println(sb.toString());
		br.close(); conn.disconnect();
		
	 }catch(Exception e) {e.printStackTrace();}
	}
}
