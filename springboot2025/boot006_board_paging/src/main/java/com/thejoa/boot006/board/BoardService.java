package com.thejoa.boot006.board;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.thejoa.boot006.member.Member;
import com.thejoa.boot006.member.MemberRepository;

@Service
public class BoardService {
	@Autowired BoardRepository boardRepository;
	@Autowired MemberRepository memberRepository;
	
	/* PAGING */
	// 1 : 최신글 10  order by bno desc limit 0,10 0번째부터 10개
	// 2 : 그 다음 최신글 10 order by bno desc limit 10,10 10번째부터 10개
	public Page<Board> getPaging(int page) { // 어디서부터
		List<Sort.Order> sorts = new ArrayList<>();
		sorts.add(Sort.Order.desc("id"));  // id를 기준으로 내림차순
		
		Pageable pageable = PageRequest.of(page, 10 , Sort.by(sorts));
		return boardRepository.findAll(pageable);
	}
	
	/* BOARD */
	public List<Board> findAll() { //##전체리스트뽑고
		//return boardRepository.findAll();
		return boardRepository.findAllByOrderByDesc();
	} 
	
	@Transactional // commit (반영) / rollback (되돌리기)
	public Board find(Long id) { //##조회수올리고 / 상세보기기능
		Board board = boardRepository.findById(id).get();
		board.setBhit(board.getBhit()+1);  // 기존조회수 + 1
		boardRepository.save(board);
		return board;
	}
	
	public void insert(Board board) { //## 글쓰기기능
		board.setMember(
				memberRepository.findByUsername( board.getMember().getUsername() ).get()
		);
		
		try { board.setBip(InetAddress.getLocalHost().getHostAddress()); }
		catch (UnknownHostException e) { e.printStackTrace(); }
		boardRepository.save(board);
	}
	
	public Board update_view(Long id) { //## 글수정 폼
		return boardRepository.findById(id).get(); 
	}
	
	public int update(Board board) { //## 글수정기능
		//boardRepository.save(board);
		return boardRepository.updateByIdAndBpass(
				board.getId() , board.getBpass() ,
				board.getBtitle() , board.getBcontent()
		);
	}
	
	public int delete(Board board) { 
		//boardRepository.delete(board);  기본 : delete from board where id=?
		return boardRepository.deleteByIdAndBpass(board.getId(), board.getBpass());
	}

}
