package spring009_ex_board4;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.BoardDao;
import com.company.dto.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")
public class Test2_BoardDao {
	@Autowired BoardDao dao;
	
	//@Test
	@Ignore
	public void selectAll() {
		System.out.println(dao.selectAll());
	}
	//@Test
	@Ignore
	public void insert() throws UnknownHostException {
		BoardDto dto = new BoardDto();
		dto.setBname("name"); dto.setBtitle("title"); dto.setBcontent("content"); 
		dto.setBip(InetAddress.getLocalHost().getHostAddress()); dto.setBpass("1111");
		System.out.println(dao.insert(dto));
	}
	@Test
	//@Ignore
	public void select() {
		System.out.println(dao.select(8));
	}
	// @Test
	@Ignore
	public void updateHit() {
		System.out.println(dao.updateHit(8));
	}
	//@Test
	@Ignore
	public void update() {
		BoardDto dto = new BoardDto();
		dto.setBtitle("title-new"); dto.setBcontent("content-new");
		dto.setBpass("1111"); dto.setBno(8);
		System.out.println(dao.update(dto));
	}
	// @Test
	@Ignore
	public void delete() {
		BoardDto dto = new BoardDto();
		dto.setBpass("1111"); dto.setBno(8);
		System.out.println(dao.delete(dto));
	}
}
