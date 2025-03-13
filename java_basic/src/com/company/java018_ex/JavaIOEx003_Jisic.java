package com.company.java018_ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class JavaIOEx003_Jisic {
	public static void main(String[] args) {
	 try {
		String apiurl = "https://openapi.naver.com/v1/search/kin.json?query="
				  + URLEncoder.encode("사랑","UTF-8");
		URL url = new URL(apiurl);
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.setRequestMethod("GET");
		conn.setRequestProperty("X-Naver-Client-Id", "k397eleMXGY25hqhpx5p");
		conn.setRequestProperty("X-Naver-Client-Secret", "tAjvip6d9j");
		
		//System.out.println(conn.getResponseCode());
		int code = conn.getResponseCode();
		BufferedReader br;
		if(code==200) {br = new BufferedReader(new InputStreamReader(conn.getInputStream()));}
		else {br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));}
		
		String line="";StringBuffer sb = new StringBuffer();
		while((line=br.readLine()) != null) {sb.append(line + "\n");}
		
		System.out.println(sb.toString());
		br.close(); conn.disconnect();
		
	 }catch(Exception e) {e.printStackTrace();}
	}
}
