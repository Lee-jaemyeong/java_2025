package com.company.service;

import java.util.List;
import com.company.dto.BoardDto;

public interface BoardService {
	public int insert( BoardDto dto ); // 글쓰기기능
	public int update( BoardDto dto ); // 수정기능
	public BoardDto updateForm( int bno );  // 해당번호 글수정 폼
	public int delete( BoardDto dto ); // 글 삭제기능
	public BoardDto detail( int bno ); // 상세보기
//	public int updateHit( int bno );   // 조회수 올리기
//	public BoardDto select( int bno ); // 해당번호의 글가져오기
	public List<BoardDto> selectAll(); // 전체데이터가져오기
}
