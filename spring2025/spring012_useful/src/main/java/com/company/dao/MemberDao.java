package com.company.dao;

import java.util.List;

import com.company.dto.MemberDto;

@MyDao
public interface MemberDao {
	public int insert( MemberDto dto );
	public int update( MemberDto dto );
	public int delete( int uno );
	public MemberDto select( int uno );
	public List<MemberDto> selectAll(); 
}
