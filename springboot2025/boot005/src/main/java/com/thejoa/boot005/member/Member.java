package com.thejoa.boot005.member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.thejoa.boot005.team.Team;
import com.thejoa.boot005.board.Board;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
	@Id // 기본값
	@GeneratedValue(strategy=GenerationType.IDENTITY) // auto_increment
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private int age;
	
	@Column( updatable = false )  // 수정못하게
	private LocalDateTime createDate = LocalDateTime.now();
	
	@ManyToOne
	private Team team;
	
	@OneToMany(mappedBy="member" , cascade=CascadeType.REMOVE)
	List<Board> board = new ArrayList<>();
}
