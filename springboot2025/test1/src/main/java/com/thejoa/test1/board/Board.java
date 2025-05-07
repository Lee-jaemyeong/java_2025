package com.thejoa.test1.board;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	private String btitle;
	
	@Column(columnDefinition="text")
	private String bcontent;
	
	private String bpass;
	private long bhit;
	private LocalDateTime createDate = LocalDateTime.now();
	private String bip;
	
}
