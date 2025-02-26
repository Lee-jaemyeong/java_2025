package com.company.java008_ex;

public class MethodEx003 {
	public static int retrun_num() { return 1;}
	public static double retrun_float() { return 3.3333;}
	public static String mycolor() { return "PURPLE";}
	public static String jangsu() { return "★★★★★";}
	public static int myadd(int a,int b) { return a+b; }
	public static String myban(char a) {
//		if(a=='A'){return"노랑조";}
//		else if(a=='B'){return"주황조";}
//		else {return "";}
		return (a=='A')? "노랑조" : (a=='B')? "주황조":"";
	}
	public static String stdId(int a) { return "G" + a;}
	public static char stdAvg(int a) {
//		if(a>=90) {return 'A';}
//		else if(a>=80 && a<90) {return 'B';}
//		else if(a>=70 && a<80) {return 'C';}
//		else {return 'D';}
		return (a>=90)? 'A' : (a>=80)? 'B' : (a>=70)? 'C' : 'D';}
	
	public static void main(String[] args) {
		// 1. 내가 좋아하는 숫자    : 1
		System.out.println("1. 내가 좋아하는 숫자 : " + retrun_num());
		// 2. 10/3.0을 실수로 표현 : 3.3333
		System.out.println("2. 10/3.0을 실수로 표현 : " + retrun_float());
		// 3. BEST COLOR        : PURPLE
		System.out.println("3. BEST COLOR : " + mycolor());
		// 4. 장수돌침대 별이       : ★★★★★
		System.out.println("4. 장수돌침대 별이 : " + jangsu());
		// 5. 10+20= 30
		System.out.println("5. 10+20 = " + myadd(10,20));
		// 6. 반(노랑조/주황조)= 나는 노랑조
		// public static 리턴값 메서드명(파라미터) {}
		// public static 노랑조 myban('B') {}
		// public static String myban(char a) {if(A이면){노랑조}else if(B이면){주황조}}
		System.out.println("6. 반(노랑조/주황조)= " + myban('B'));
		// 7. 당신의 학번은? G1111
		System.out.println("7. 당신의 학번은? " + stdId(1111));
		// 8. 당신의 평균은? B
		System.out.println("8.당신의 평균은? " + stdAvg(88));
		// 90점이상이면 A ,  80점이상이면 B ,  70점이상이면 C , 아니라면  D
	}
}
