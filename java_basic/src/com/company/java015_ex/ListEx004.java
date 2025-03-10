package com.company.java015_ex;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1. Fruits  Dto 클래스만들기
class Fruits {
	private int no;
	private String name;
	private int price;
	
	public Fruits() { }
	public Fruits(int no, String name, int price) { this.no = no; this.name = name; this.price = price; }
	
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getPrice() { return price; } public void setPrice(int price) { this.price = price; }
}

public class ListEx004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//2. fruits     ArrayList 만들기
		List<Fruits> fruits = new ArrayList<>();
		//3. 다음의 데이터 넣기
		fruits.add(new Fruits(1, "apple" , 2000));
		fruits.add(new Fruits(2, "banana" , 2500));
		fruits.add(new Fruits(3, "coconut" , 4500));
		//4. for+size / 향상된 for 이용해서 데이터 출력
		/*
		for(int i=0;i<fruits.size();i++) {
			Fruits temp = fruits.get(i);
			System.out.println(temp.getNo() + " / " + temp.getName() + " / " + temp.getPrice()); 
			break;
		}
		*/
		// for(Fruits temp : fruits) {System.out.println(temp.getNo() + " / " + temp.getName() + " / " + temp.getPrice());break;}
		
		//5. 1,2,3 과일정보를 입력하시오. - 번호을 입력받으면 해당하는  과일정보의 자료출력
		String [] fruitinfo = {"사과는 빨갛다" , "바나나는 노랗다" , "코코넛은 코코하다"};
		
		System.out.print("1,2,3 원하는 과일정보를 입력하시오. > ");
		int num = scanner.nextInt();
		int find = -1;
		
		for(Fruits temp : fruits) {if(temp.getNo()==num) {System.out.println("번호: " + temp.getNo() + ", 이름: " + temp.getName() + ", 가격: " + temp.getPrice());}}
		for(int i=0;i<=fruitinfo.length;i++) {
			find=i;
			if(find==num) {System.out.println(fruitinfo[find-1]); break;} 
		}
		
		// int find = -1;
		// for(int i=0;i<=fruits.size();i++){
		// if(fruits.get(i).getNo() == num) {find=i; break;} // 찾았으면 나오기
		// }
		/*
		 	System.out.println("번호: " + fruits.get(find).getNo());
		 	System.out.println("이름: " + fruits.get(find).getName());
		 	System.out.println("가격: " + fruits.get(find).getPrice());
		 	System.out.println(fruitinfo[find]);
		 */
	}
}
