package com.company.java010_ex;

//1. 클래스는 부품객체
//2. 상태와 행위
class Card {
	//상태-멤버변수  : int cardNum; boolean  isMembership;
	int cardNum; boolean isMembership;
	//행위-멤버함수  : X
    // Card(){} 생략되어 있음. 컴파일러가 자동생성
	// alt + shift + s (밑에서 2,3,4)
	@Override public String toString() {
		return "Card [cardNum= " + cardNum + ", isMembership= " + isMembership + "]";
	}
	// 1. Card() : 생성자 오버로딩시 컴파일러가 기본생성자 자동생성취소
	// 2. Card() : 기본생성자 많이 사용 기본셋팅- cardNum=1; 멤버쉽이니? true
	public Card(int cardNum, boolean isMembership) { super(); this.cardNum = cardNum; this.isMembership = isMembership; }
	public Card() { this.cardNum=1; this.isMembership=true; } 
}
public class ClassEx005 {
	public static void main(String[] args) {
		Card  c1= new Card();                           
		System.out.println(c1); // Card [cardNum= 0, isMembership= false]
		
		Card c2 = new Card(3, false);
		System.out.println(c2);
	}
}
