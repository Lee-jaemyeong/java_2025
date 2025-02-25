package com.company.java007_ex;

public class Array2Ex005 {
	public static void main(String[] args) {
		int[][] arr = {{1,1,1},{2,2,2},{3,3,3},{4,4,4}};
		int total=0; double avg=0.0;
		
		for(int ch=0;ch<arr.length;ch++) {  // #1 층의 정보
			for(int kan=0;kan<arr[ch].length;kan++) {  // #2 칸의 정보
				total+=arr[ch][kan];
			}
			// 한 층이 끝나고 해야할 일
		}
		                       //  층    *    칸
		avg= (double)total/(arr.length*arr[0].length);  // 평균 = total/갯수(층갯수*칸갯수)
		System.out.print("총점 : "+total+"\n평균 : "+avg);
	}
}
