package spring006_mybatis2;


import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.UserDao;
import com.company.dto.UserDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")
public class Test2_userDao {
	@Autowired UserDao dao;
	@ Test
	//@Ignore
	public void selectAll() {
		System.out.println(dao.selectAll());
	};
	//@Test
	@Ignore
	public void insert() {
		UserDto dto = new UserDto();
		dto.setName("seven"); dto.setAge(77);
		System.out.println(dao.insert(dto)); //1
	}
	//@Test
	@Ignore
	public void selectOne() {
		System.out.println(dao.selectOne(1)); //UserDto [no=1, name=first, age=11]
	}
	//@Test
	@Ignore
	public void update() {
		UserDto dto = new UserDto();
		dto.setName("five"); dto.setAge(5); dto.setNo(5);
		System.out.println(dao.update(dto)); //1
		System.out.println(dao.selectOne(5)); //UserDto [no=5, name=five, age=5]
	}
	//@Test
	@Ignore
	public void delete() {
		System.out.println(dao.delete(7)); //1
	}
}
