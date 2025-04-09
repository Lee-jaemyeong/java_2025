package com.thejoa.boot005.board;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.thejoa.boot005.member.Member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Board {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition="text")
	private String bcontent;
	
	private String bfile;
	private Long bhit=0L;
	private String bip;
	private String bpass;
	
	@Column(length = 200)
	private String btitle;
	
	@Column(updatable = false)
	private LocalDateTime createDate=LocalDateTime.now();
	
	@ManyToOne  @JoinColumn(name="MEMBER_ID")
	private Member member;
}
