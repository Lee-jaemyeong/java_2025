package com.company.java005;

import java.util.Scanner;

public class Bank_v1_control {
	public static void main(String[] args) {
		//변수
		int num; char id=' ', pass=' '; int balance=0;
		Scanner scanner = new Scanner(System.in);
		// Step1. 메뉴판 무한반복
		for(;;) {
			System.out.print("====== BANK ======\n* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>> ");
			num = scanner.nextInt();
			if(num==9) {System.out.println("종료기능입니다. "); break;}
		//step2. 기능
			switch(num) {
			case 1: System.out.println("추가기능");
				// Step3
				// *ID : _입력받기 first
				// *PASS : _입력받기 1111
				// *BALANCE : _입력받기 10000
				System.out.print("*ID : ");    id=scanner.next().charAt(0);
				System.out.print("*PASS : ");  pass=scanner.next().charAt(0);
				System.out.print("*BALANCE : ");  balance=scanner.next().charAt(0);
			break; //end case1
			case 2: System.out.println("조회기능"); 
				//Step4
				//변수 - 임시변수 temp_id, 임시변수 temp_pass
				//입력 - 임시변수 temp_id, temp_pass 입력받기
				//처리 - if(temp_id 와 id가 같고 temp_pass 와 pass가 같다면){ 사용자정보출력}
				//      else{아니라면 비밀번호 확인해주세요.}
				char temp_id=' ' ,temp_pass=' ';
				System.out.print("*ID : ");   temp_id=scanner.next().charAt(0);
				System.out.print("*PASS : "); temp_pass=scanner.next().charAt(0);
				if( temp_id == id && temp_pass == pass) {
					System.out.println("ID: "+id+"\nPASS: "+pass+"\nBALANCE: "+balance);
				}else {System.out.println("정보를 확인해주세요!");}
			break; //end case2
			
			case 3: System.out.println("입금기능"); 
			break; //end case3
			
			case 4: System.out.println("출금기능"); 
			break; //end case4
			
			case 5: System.out.println("삭제기능"); 
			break; //end case5
			} 
			
		}//end for
	}//end main
}//end class
