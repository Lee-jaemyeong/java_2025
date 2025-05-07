package com.thejoa.test3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.test3.board.Board;
import com.thejoa.test3.board.BoardRepository;

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
	public void findByBoard() {
		Optional<Board> findBoard = boardRepository.findById(1L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			System.out.println(board);
			boardRepository.save(board);
		}
	}
	
	@Disabled
	@Test
	public void updateByBoard() {
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
	public void deleteByBoard() {
		Optional<Board> findBoard = boardRepository.findById(1L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			boardRepository.delete(board);
		}
	}
}
