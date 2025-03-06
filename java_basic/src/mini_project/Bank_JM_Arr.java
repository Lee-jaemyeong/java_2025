package mini_project;

import java.util.Scanner;

public class Bank_JM_Arr {
	public static void main(String[] args) {
		//변수
		String[] ids = new String[5];
		String[] passes = new String[5];
		int[] ages = new int[5];
		int[] cashes = new int[5];
		
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
		
		if(bank==1) {
			System.out.print("아이디 입력 : ");
			id = scanner.next();
			System.out.print("비밀번호 입력 : ");
			pass = scanner.next();
			System.out.print("나이 입력 : ");
			age = scanner.nextInt();
			System.out.print("잔액 입력 : ");
			cash = scanner.nextInt();
			
			for(int i=0;i<ids.length;i++) {
				ids[i]=id;
				passes[i]=pass;
				ages[i]=age;
				cashes[i]=cash;
				}
			continue;
		}
		
		switch(bank) { 
			case 2:  case 3:  case 4:  case 5:
				System.out.print("ID : ");
				temp_id = scanner.next();
				System.out.print("PASS : ");
				temp_pass = scanner.next();
				if (!(id.equals(temp_id)&&pass.equals(temp_pass))) {System.out.println("사용자정보를 확인해주세요."); break;}
				
				switch(bank) {
				case 2:
					System.out.print("== 계좌조회\nID : " + id + "\n" + "PASS : " + pass + "\n" + "나이 : " + age
									  + "\n" + "잔액 : " + cash + "\n"+"조회에 성공하셧습니다.\n");
					break;
				case 3:
					System.out.print("입금 : ");
					inmn = scanner.nextInt();
					System.out.println((inmn>0)? "== 입금 완료\n" + "잔액: "+(cash += inmn) : "잔액이 부족합니다." );
					break;
				case 4:
					System.out.print("출금 : ");
					outmn = scanner.nextInt();
					System.out.println(!(cash-outmn>=0)? "잔액이 부족합니다." :
						                (outmn>=0)? "== 출금 완료\n"+"잔액 : "+(cash -= outmn) : "잔액이 부족합니다." );
					break;
				case 5:
					System.out.println("계좌를 삭제하시겠습니까? "+"(Y/N)");
					del = scanner.next().charAt(0);
					switch(del) {
						case 'Y': case'y': id=" "; pass=" ";
						System.out.println("삭제되었습니다.");
						case 'N': case'n': break;
					}
					break;	
				}
			break; 
		} //end switch
		} //end for
	} //end main
} //end class
