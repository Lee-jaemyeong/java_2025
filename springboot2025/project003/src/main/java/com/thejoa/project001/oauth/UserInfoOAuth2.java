package com.thejoa.project001.oauth;

public interface UserInfoOAuth2 {
	String getProvider();
	String getProviderId();
	String getEmail();
	String getNickname();
	String getImage();
}

// provider = "google" , "kakao" , "naver" , "facebook"
// providerId = google → sub , kakao/facebook → id , naver → response
// username = providerId 설정
// username = 각 사이트에 등록한 이름으로 설정