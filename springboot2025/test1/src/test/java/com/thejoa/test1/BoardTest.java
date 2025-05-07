package com.thejoa.test1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.test1.board.Board;
import com.thejoa.test1.board.BoardRepository;

@SpringBootTest
class BoardTest {
	@Autowired BoardRepository boardRepository; 
	
	@Disabled		
	@Test
	public void insertBoard() {
		Board board = new Board();
		board.setBtitle("title");
		board.setBpass("1234");
		board.setBcontent("content");
		try { board.setBip(InetAddress.getLocalHost().getHostAddress()); }
		catch (UnknownHostException e) { e.printStackTrace(); }
		boardRepository.save(board);
	}
	
	@Disabled	
	@Test
	public void findAllBoardDesc() {
		List<Board> list = boardRepository.findAllByOrderByDesc();
		
		System.out.println(list);
	}
	
	@Disabled
	@Test
	public void findAllBoard() {
		List<Board> list = boardRepository.findAll();
		
		System.out.println(list.get(0).getBtitle());
	}
	
	
	@Disabled
	@Test
	public void findByBoard() {
		Optional<Board> findBoard = boardRepository.findById(1L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			System.out.println(board.getBtitle());
			boardRepository.save(board);
		}
	}
	
	@Disabled
	@Test
	public void updateBoard() {
		Optional<Board> findBoard = boardRepository.findById(1L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			board.setBtitle("title-new");
			board.setBcontent("content-new");
			boardRepository.save(board);
		}
	}
	
	@Disabled	
	@Test
	public void updateBoardByIdAndPass() {
		int board = boardRepository.updateByIdAndPass(1L,"1234", "title-new", "content-new");
		
		System.out.println(board);
	}
	
	@Disabled
	@Test
	public void deleteBoard() {
		Optional<Board> findBoard = boardRepository.findById(1L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			boardRepository.delete(board);
		}
	}
	
	@Test
	public void deleteBoardByIdAndPass() {
		int board = boardRepository.deleteByIdAndPass(1L, "1234");
		
		System.out.println(board);
	}
}
