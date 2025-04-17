package com.thejoa.boot006;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.boot006.board.Board;
import com.thejoa.boot006.board.BoardRepository;
import com.thejoa.boot006.board.BoardService;
import com.thejoa.boot006.member.Member;
import com.thejoa.boot006.member.MemberRepository;

@SpringBootTest
class Test001_Board {

	@Autowired MemberRepository memberRepository;
	@Autowired BoardRepository boardRepository;
	@Autowired BoardService boardService;
	
	@Disabled 
	//@Test
	public void insertMember() {
		Member member = new Member();
		member.setUsername("second");
		memberRepository.save(member); // ## insert, update - save 유저추가
	}
	
	// 유저(OneToMany:mappedby="member")는 많은 글(ManyToOne)을 쓸 수 있다.
	@Disabled 
	//@Test
	public void insertBoard() {
		for(int i=0; i<120; i++) {
			Member member = new Member(); 
			member.setUsername("test"); // 있는 username
			Board board = new Board();
			board.setBtitle("title-paging");
			board.setBcontent("content-paging");
			board.setBpass("1111");
			board.setBfile("1.jpg");
			try {
				board.setBip(InetAddress.getLocalHost().getHostAddress());
			} catch (UnknownHostException e) { e.printStackTrace(); }
			board.setMember(member);
			boardService.insert(board);
		}
	}
	
	// select *from board
	@Disabled 
	//@Test 
	public void findAllBoard() {
		List<Board> list = boardRepository.findAll();
		
		System.out.println(list.get(0).getBtitle());
	}
	
	// editView / detail
	// select *from board where id=?
	//@Disabled 
	@Test 
	public void findBoard() {
		Optional<Board> findBoard = boardRepository.findById(3L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			System.out.println(board.getBtitle());
			boardRepository.save(board);
		}
	} // find- select / save- insert,update / delete- delete
	
	// update board set btitle=?, bcontent=?, bfile=? where id=?
	@Disabled 
	//@Test 
	public void updateBoard() {
		Optional<Board> findBoard = boardRepository.findById(2L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			board.setBtitle("title-new");
			board.setBcontent("content-new");
			boardRepository.save(board);
		}
	}
	// delete from board where id=?
	@Disabled 
	//@Test
	public void deleteBoard() {
		Optional<Board> findBoard = boardRepository.findById(2L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			boardRepository.delete(board);
		}
	}
	
}
