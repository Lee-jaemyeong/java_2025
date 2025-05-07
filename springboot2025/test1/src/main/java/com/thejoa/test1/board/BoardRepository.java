package com.thejoa.test1.board;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<Board,Long> {
	@Query("select b from Board b order by id desc")
	List<Board> findAllByOrderByDesc();
	
	@Modifying
	@Transactional
	@Query("delete from Board b where b.id= :id and b.bpass= :bpass")
	int deleteByIdAndPass(Long id, String bpass);
	
	@Modifying
	@Transactional
	@Query("update Board b set b.btitle= :btitle, b.bcontent= :bcontent where b.id= :id and b.bpass= :bpass")
	int updateByIdAndPass(Long id,String bpass,String btitle,String bcontent);
}
