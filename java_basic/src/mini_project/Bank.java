package mini_project;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		//변수
		int bank;
		String id="",temp_id="" ,temp_pass="" ,pass="";
		char del=' ';
		int age=0 ,cash=0, inmn=0, outmn=0;
		//입력
		Scanner scanner = new Scanner(System.in);
		//처리
		for(;;) {
		System.out.print("====== BANK ======\n* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>> ");
		bank = scanner.nextInt();
		if(bank==9) {System.out.print("서비스가 종료되었습니다."); break;}
		switch(bank) {
			case 1:
				System.out.print("아이디 입력 : ");
				id = scanner.next();
				System.out.print("비밀번호 입력 : ");
				pass = scanner.next();
				System.out.print("나이 입력 : ");
				age = scanner.nextInt();
				System.out.print("잔액 입력 : ");
				cash = scanner.nextInt();
				break; 
			case 2:
					System.out.print("ID : ");
					temp_id = scanner.next();
					System.out.print("PASS : ");
					temp_pass = scanner.next();
				if (id.equals(temp_id)&&pass.equals(temp_pass)) {
						System.out.print("== 계좌조회\nID : " + id + "\n" + "PASS : " + pass + "\n" + "나이 : " + age
									     + "\n" + "잔액 : " + (cash + inmn - outmn) + "\n"+"조회에 성공하셧습니다.\n");
					} else {System.out.println("다시 입력해주세요.");}
				break;
			case 3:
				System.out.println("입금");
				System.out.print("ID : ");
				temp_id = scanner.next();
				System.out.print("PASS : ");
				temp_pass = scanner.next();
				if(id.equals(temp_id)&&pass.equals(temp_pass)) {
						System.out.print("입금 : ");
						inmn = scanner.nextInt();
						System.out.println("== 입금 완료\n" + "잔액: "+(cash + inmn));
				} else {System.out.println("다시 입력해주세요.");}
				break;
			case 4:
				System.out.println("출금");
				System.out.print("ID : ");
				temp_id = scanner.next();
				System.out.print("PASS : ");
				temp_pass = scanner.next();
				if(id.equals(temp_id)&&pass.equals(temp_pass)) {
						System.out.print("출금 : ");
						outmn = scanner.nextInt();
						System.out.println("== 출금 완료\n"+"잔액 : "+(cash + inmn - outmn));
				} else {System.out.println("다시 입력해주세요.");}
				break;
			case 5:
				System.out.println("삭제");
				System.out.print("ID : ");
				temp_id = scanner.next();
				System.out.print("PASS : ");
				temp_pass = scanner.next();
				if(id.equals(temp_id)&&pass.equals(temp_pass)) {
						System.out.println("계좌를 삭제하시겠습니까? "+"(Y/N)");
						del = scanner.next().charAt(0);
						switch(del) {
						case 'Y': case'y': id=" "; pass=" ";
						System.out.println("삭제되었습니다.");
						case 'N': case'n': break;
					}
				} else {System.out.println("다시 입력해주세요.");}
				break;
			} //end switch
		} //end for
	} //end main
} //end class
