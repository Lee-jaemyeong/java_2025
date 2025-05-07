package com.thejoa.test2.member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface MemberRepository extends JpaRepository<Member,Long> {
	Optional<Member> findByUsername(String username);
	Optional<Member> findByEmail(String email);
	
	@Modifying
	@Transactional
	@Query ("update Member m set m.password= :password where m.id= :id and m.password= :old ")
	int updateByIdAndPassword( String password , String old , Long id);
}
