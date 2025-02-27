package com.company.java009_ex;

public class Repeat006 {
	
	public static void hi() {System.out.println("hi");}
	public static void hi(int a) {System.out.println("hi "+ a);}
	public static String hi(String a) {return "hi "+ a;}
	
	
	public static void main(String[] args) {
		// public static 리턴값 메서드명(재료) { 해야할일 }
		// public static void 재료() { System.out.println("hi"); }  // 1단계) 구조
		hi();
		
		// public static void 메서드명(재료) { 해야할일 } // 2단계) 파라미터-재료
		// public static void hi(int a) {System.out.println("hi "+ (int)a);}
		hi(1);
		
		// public static void 메서드명(재료) { 해야할일 } // 3단계) return
		// public static String hi(String a) {return "hi "+ a;}
		System.out.println(hi("sally"));
	}
}
// 6. html+css
// <button class="btn btn-warning my-3" onclick=("alert('이재명');")> ONE </button>

// 7.
// <button class="btn btn-warning my-3" id="two" > TWO </button>
// <script>
// document.getElementById.onclick = function("two") { alert("이재명"); };
// </script>