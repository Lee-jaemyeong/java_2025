package com.thejoa.boot008.util5_kakao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Component
public class KakaoLogin {
	@Value("${kakao_redirect_url}")
	private String kakao_redirect_url;
	
	@Value("${kakao_api}")
	private String kakao_api;
	
	// 1.login - 인증(사용자신원확인) , 인가(접근권한)
	public String step1() {
		return "https://kauth.kakao.com/oauth/authorize?response_type=code&client_id="
				    + kakao_api
					+ "&redirect_uri="
				    + kakao_redirect_url;
	}
	// 2. 인가코드를 토큰으로 처리
	public List<String> step2(String code) { // code
		System.out.println("......... STEP1) " + code);
		String tokenUrl="https://kauth.kakao.com/oauth/token";
		tokenUrl += "?grant_type=authorization_code"
				   +"&client_id=" + kakao_api
				   +"&redirect_uri=" + kakao_redirect_url
				   +"&code=" + code;
		//POST
		// Content-Type: application/x-www-form-urlencoded;charset=utf-8
		URL url = null; HttpURLConnection conn = null;
		BufferedReader br = null; String line=""; StringBuffer buffer=new StringBuffer();
		String resultToken="";
		
		try {
			url = new URL(tokenUrl);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setDoInput(true); conn.setDoOutput(true);
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
			
			if(conn.getResponseCode() == 200) {
				br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				br=new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			while( (line =br.readLine()) != null ) { buffer.append(line); }
			br.close();
			conn.disconnect();
			resultToken = buffer.toString();
			System.out.println("........." + resultToken);
		} catch (MalformedURLException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); }
		
		//......... STEP1) oXDPpv1SzGtfx_VkOhEmCpCmzVEWBBcQzy8_w_eTEZ8qokTiheLwpQAAAAQKFwAnAAABlkbO_ndPBWDH3LuH7A
		//.........{"access_token":"tR41CFuUO-hxbpAHyBGkz4J28gokgnAxAAAAAQoXAQ8AAAGWRs7-3SEj9baI01p6","token_type":"bearer","refresh_token":"16WWeZhbaGjiDhpzWLnZF5IwVrorG0ReAAAAAgoXAQ8AAAGWRs7-1yEj9baI01p6","expires_in":21599,"scope":"profile_image profile_nickname","refresh_token_expires_in":5183999}
		// com.google.gson
		JsonObject job = JsonParser.parseString(resultToken).getAsJsonObject();
		String token = job.get("access_token").getAsString();
		
		System.out.println("............" + token);
		
		return step3(token); // 마지막수정
	}
	
	/*

	curl -v -X POST "https://kauth.kakao.com/oauth/token" \
	    -H "Content-Type: application/x-www-form-urlencoded;charset=utf-8" \
	    -d "grant_type=authorization_code" \
	    -d "client_id=${REST_API_KEY}" \
	    --data-urlencode "redirect_uri=${REDIRECT_URI}" \
	    -d "code=${AUTHORIZE_CODE}"
	*/
	
	// 사용자정보가져오기
	// nickname , profile_img
	public List<String> step3(String token) { // token
		System.out.println("......... STEP2) " + token);
		List<String> userinfos = new ArrayList<>();

		String userUrl="https://kapi.kakao.com/v2/user/me";

		URL url = null; HttpURLConnection conn = null;
		BufferedReader br = null; String line=""; StringBuffer buffer=new StringBuffer();
		String result="";
		
		try {
			url = new URL(userUrl);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
			conn.setRequestProperty("Authorization", "Bearer " + token); // Bearer뒤 공백 필수
			
			if(conn.getResponseCode() == 200) {
				br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else { br=new BufferedReader(new InputStreamReader(conn.getErrorStream())); }
			
			while( (line =br.readLine()) != null ) { buffer.append(line); }
			br.close();
			conn.disconnect();
			
		} catch (MalformedURLException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); }
		
		/*
		 ......... STEP2) nphTqxo2gK2RZZrfnL9skGyrPLoPQDqzAAAAAQoXAVAAAAGWRwGz4yEj9baI01p6
		 ........{"id":4221815428,"connected_at":"2025-04-18T02:50:34Z",
		 "properties":{"nickname":"재명","profile_image":"http://k.kakaocdn.net/dn/FaVvD/btsJPPf8mDN/YvD3HjtpUAX0sBPFVwZYu1/img_640x640.jpg","thumbnail_image":"http://k.kakaocdn.net/dn/FaVvD/btsJPPf8mDN/YvD3HjtpUAX0sBPFVwZYu1/img_110x110.jpg"},
		 "kakao_account":{"profile_nickname_needs_agreement":false,"profile_image_needs_agreement":false,"profile":{"nickname":"재명","thumbnail_image_url":"http://k.kakaocdn.net/dn/FaVvD/btsJPPf8mDN/YvD3HjtpUAX0sBPFVwZYu1/img_110x110.jpg","profile_image_url":"http://k.kakaocdn.net/dn/FaVvD/btsJPPf8mDN/YvD3HjtpUAX0sBPFVwZYu1/img_640x640.jpg","is_default_image":false,"is_default_nickname":false}}}
		*/
		
		result = buffer.toString(); System.out.println("........" + result);
		JsonObject job = JsonParser.parseString(result).getAsJsonObject();
		userinfos.add(job.getAsJsonObject("properties").get("nickname").getAsString());
		userinfos.add(job.getAsJsonObject("properties").get("profile_image").getAsString());
		System.out.println("..........." + userinfos);
		
		return userinfos; 
	}
}

/*
curl -v -X POST "https://kapi.kakao.com/v2/user/me" \
	-H "Content-Type: application/x-www-form-urlencoded;charset=utf-8" \
	-H "Authorization: Bearer ${ACCESS_TOKEN}" \
	--data-urlencode 'property_keys=["kakao_account.email"]'
*/
