package com.thejoa.boot008;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.boot008.util7_Iddouble.MyUser;
import com.thejoa.boot008.util7_Iddouble.MyUserService;

@SpringBootTest
class Util007_IdDouble {
	@Autowired MyUserService myUserService;
	
	@Disabled
	//@Test 
	void userInsert() {
		MyUser user = new MyUser();
//		user.setUsername("first");
//		user.setEmail("first@gmail.com");
		user.setUsername("second");
		user.setEmail("second@gmail.com");
		System.out.println(myUserService.insertUser(user));
	}
	
	@Disabled
	//@Test
	void userSelect1() {
		System.out.println(myUserService.selectUsername("first"));
	}

	@Test
	void userSelect2() {
		System.out.println(myUserService.selectEmail("second@gmail.com"));
	}
	
}
