package com.company.ex;

class Card{
	   //상태-멤버변수  : 채널/볼륨 int cardNum; boolean  isMembership;
	int cardNum; boolean  isMembership;

	
	@Override
	public String toString() {
		return "Card [cardNum=" + cardNum + ", isMembership=" + isMembership + "]";
	}
	public Card(int cardNum, boolean isMembership) {
		super();
		this.cardNum = cardNum;
		this.isMembership = isMembership;
		}
	public Card() {this.cardNum=1; this.isMembership=true;}
	
}
public class Ex004 {
	public static void main(String[] args) {
		Card  c1= new Card(); 
		System.out.println(c1);
		
		Card c2= new Card(3,false);
		System.out.println(c2);
	}
}
