package com.company.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
//@NoArgsConstructor  final때문에 오류남 디폴트 생성자 수동생성
@NoArgsConstructor(force=true) // 강제로 필드에 null or 0초기화
@RequiredArgsConstructor // final  TestDto(String) 디폴트 생성자 깨짐
public class TestDto {
	private final String company;
	private int year;
	
}
