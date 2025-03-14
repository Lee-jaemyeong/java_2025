package com.company.java019_ex;
import javax.swing.JOptionPane;

// 방법1 Thread class QuestionCount extends Thread {}
// 방법2 Runnable class QuestionCount implements Runnable{}

public class ThreadEx001 {
	public static void main(String[] args) {
		Thread count = new Thread(new Runnable() {
			@Override public void run() {
				for(int i=10; i>0; i--) {
					System.out.println(i);
					try { Thread.sleep(1000); } catch (InterruptedException e) { break; }
				}
			}
		}); count.start();
		
		String answer = JOptionPane.showInputDialog("사과알파벳을 입력하세요.");
		System.out.println(answer);
		if(answer.equals("apple")) {System.out.println("정답입니다."); count.interrupt();}
		else {System.out.println("정답이 아닙니다."); count.interrupt();}
		
	}
}
// 문제점 : 1) 정답말했는데 count 계속실행  2) main이 끝났는데 다른 프로세스 실행중