package com.thejoa.boot008.util7_Iddouble;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyUserService {
	private final MyUserRepository myUserRepository;
	
	public MyUser insertUser(MyUser myUser) {
		return myUserRepository.save(myUser);
	}	
	public MyUser selectUsername(String username) {
		return myUserRepository.findByUsername(username).get();
	}
	public MyUser selectEmail(String email) {
		return myUserRepository.findByEmail(email).get();
	}
}
