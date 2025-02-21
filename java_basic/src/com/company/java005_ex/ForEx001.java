package com.company.java005_ex;

public class ForEx001 {
	public static void main(String[] args) {
		System.out.println("q1) ");
		for(int i=1; i<=5; i++)
		{System.out.print(i+"\t");}
		
		System.out.println("\nq2) ");
		for(int i=5; i>=1; i--)
		{System.out.print(i+"\t");}
		
		System.out.println("\nq3) ");
		for(int i=1; i<=3; i++)
		{System.out.print("JAVA"+i+"\t");}
		
		System.out.println("\nq4) ");
		for(int i=3; i>=1; i--)
		{System.out.print("HAPPY"+i+"\t");}
		
		System.out.println("\nq5) ");
		for(int i=0; i<=2; i++)
		{System.out.print(i);
		 if(i<=1) {System.out.print(",");}
		 }
		// for(int i=0; i<=2; i++){System.out.print ((i==0 ? " ":",") + i);}
		
		System.out.println("\nq6) ");
		for(int i=0; i<=99; i++)
		{System.out.print(i);
		 if(i<99) {System.out.print(",");}
		 }
		// for(int i=0; i<=99; i++){System.out.print ((i==0 ? " ":",") + i);}
		
		System.out.println("\nq7) ");
		for(int i=10; i>=1; i--)
		{System.out.print(i);
		 if(i>1) {System.out.print(",");}
		}
		// for(int i=10; i>=1; i--){System.out.print ((i==10 ? " ":",") + i);}
		
		System.out.println("\nq8) ");
		for(int i=0; i<=8; i+=2)
		{System.out.print(i);
		 if(i<8) {System.out.print(",");}
		}
		// for(int i=0; i<=8; i+=2){System.out.print ((i==0 ? " ":",") + i);}
		
		System.out.println("\nq9) ");
		for(int i=0; i<=18; i+=2)
		{System.out.print(i);
		 if(i<18) {System.out.print(",");}
		}
		// for(int i=0; i<=18; i+=2){System.out.print ((i==0 ? " ":",") + i);}
	}
}

