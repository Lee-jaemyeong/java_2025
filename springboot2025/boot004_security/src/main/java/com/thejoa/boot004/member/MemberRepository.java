package com.thejoa.boot004.member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface MemberRepository extends JpaRepository<Member, Long> {
	Optional<Member>	findByUsername(String username);
	
	@Modifying
	@Transactional
	@Query ("update Member m set m.password= :password where m.id= :id and m.password= :old ")
	int updateByIdAndPassword( String password , String old , Long id);
}

// Q1. crud - sql구문적기
/*
	insert into member (username,password,email) values (?,?,?) - save
	select *from member;             - findAll
	select *from member where id=?;  - findById
	update member set username=?, password=?, email=? where id=? - save
	delete from member where id=?
*/

// Q2. @Query 아이디와 비번이 같은 유저의 비밀번호 변경 - 위에 repository 작성!
// 2-1 @Modifying @Transactional @Query
