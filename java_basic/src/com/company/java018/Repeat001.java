package com.company.java018;

import java.io.File;

public class Repeat001 {
	public static void main(String[] args) {
		//#1. 경로
		String folder_rel="src\\com\\company\\java018\\";
		String file_rel = "JavaIO002.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		//#2. 폴더와 파일만들기
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
			System.out.println("폴더/파일 준비완료!");
		} catch(Exception e) {e.printStackTrace();}
	}
}
