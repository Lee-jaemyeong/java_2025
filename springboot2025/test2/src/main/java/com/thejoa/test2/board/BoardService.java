package com.thejoa.test2.board;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	@Autowired BoardRepository boardRepository; 
	
	public List<Board> findAll() {
		return boardRepository.findAllByOrderByDesc();
	}
	
	@Transactional
	public Board find(Long id) {
		Board board = boardRepository.findById(id).get();
		board.setBhit(board.getBhit()+1);
		boardRepository.save(board);
		return board;
	}
	
	public void insert(Board board) {
		
		try { board.setBip(InetAddress.getLocalHost().getHostAddress()); }
		catch (UnknownHostException e) { e.printStackTrace(); }
		boardRepository.save(board);
	}
	
	public Board update_view(Long id) {
		return boardRepository.findById(id).get();
	}
	
	public int update(Board board) {
		return boardRepository.updateByIdAndPass(
				board.getId(), board.getBpass(), 
				board.getBtitle(), board.getBcontent());
	}
	
	public int delete(Board board) {
		return boardRepository.deleteByIdAndPass(board.getId(), board.getBpass());
	}
	
}
