package com.thejoa.project001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.project001.dao.AuthDao;
import com.thejoa.project001.dao.EmpDao;
import com.thejoa.project001.dto.EmpDto;
import com.thejoa.project001.dto.UserDto;
import com.thejoa.project001.service.TestService;

@SpringBootTest
class Project001ApplicationTests {
	@Autowired TestService service;
	@Autowired EmpDao dao;
	
	@Autowired AuthDao authdao;
	
	@Disabled @Test void contextLoads() { System.out.println("....." + service.test()); }
	@Disabled @Test public void test1() {
		Map<String, String> para = new HashMap<>();
//		para.put("searchType", "ename");
//		para.put("keyword", "SMITH");
		para.put("searchType", "job");
		para.put("keyword", "clerk");
		System.out.println(dao.test1(para));
	}
	
	@Disabled @Test public void test2() {
		EmpDto dto = new EmpDto();
		dto.setEname("SMITH"); dto.setJob("clerk");
		System.out.println(dao.test2(dto));
	}
	
	@Disabled @Test public void test3() {
		EmpDto dto = new EmpDto();
		dto.setEname("SMITH"); 
		dto.setJob("clerk");
		dto.setEmpno(7369); 
		dto.setMgr(7902);
		System.out.println(dao.test3(dto));
	}

	@Disabled @Test public void test4() {
		EmpDto dto = new EmpDto();
		//dto.setEname("SMITH"); 
		//dto.setJob("clerk");
		System.out.println(dao.test4(dto));
	}
	
	@Disabled @Test public void test5() {
		EmpDto dto = new EmpDto();
		//dto.setEname("SMITH-New"); //dto.setJob("DEVELOPER");
		dto.setEname("SMITH"); dto.setJob("CLERK");
		dto.setEmpno(7369);
		System.out.println(dao.test5(dto));
	}
	
	@Disabled @Test public void test6() {
		List<Integer> list = new ArrayList<>();
		list.add(7369); //list.add(7499); //list.add(7521);
		System.out.println(dao.test6(list));
	}
	
	@Test public void authTest() {
		UserDto dto = new UserDto();
		dto.setUserid("first");
		System.out.println(authdao.readAuth(dto));
	}
}
