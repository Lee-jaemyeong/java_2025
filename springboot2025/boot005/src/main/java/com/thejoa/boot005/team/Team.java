package com.thejoa.boot005.team;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.thejoa.boot005.member.Member;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Team {
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Column( updatable = false )  // 수정못하게
	private LocalDateTime createDate = LocalDateTime.now();
	
	@OneToMany(mappedBy = "team" , cascade = CascadeType.REMOVE)
	List<Member> member=new ArrayList<>();
}
