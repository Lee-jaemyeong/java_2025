package com.thejoa.test2.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	@Autowired MemberRepository memberRepository;
	@Autowired PasswordEncoder passwordEncoder;
	
	public Member insertMember(Member member) {
		member.setPassword(passwordEncoder.encode(member.getPassword()));
		return memberRepository.save(member);
	}
	
	public List<Member> findAll() {
		return memberRepository.findAll();
	}
	
	public Member selectMember(Long id) {
		return memberRepository.findById(id).get();
	}
	
	public Member selectUsername(String username) {
		return memberRepository.findByUsername(username).get();
	}
	public Member selectEmail(String email) {
		return memberRepository.findByEmail(email).get();
	}
	
	public int updateByPass(Member member, String old) {
		return memberRepository.updateByIdAndPassword(member.getPassword(), old, member.getId());
	}
	public Member updateByEmail(Member member) {
		Member find = memberRepository.findById(member.getId()).get();
		find.setEmail(find.getEmail());
		return memberRepository.save(find);
	}
	
	public void deleteMember(Long id) {
		Member find = memberRepository.findById(id).get();
		memberRepository.delete(find);
	}
}
