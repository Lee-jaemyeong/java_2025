package com.thejoa.boot006.board;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Board {
	private Long id;
	
	private String bcontent;
	private String bfile;
	private Long bhit;
	private String bip;
	private String btitle;
	private String bpass;
	private LocalDateTime createDate=LocalDateTime.now();
}
