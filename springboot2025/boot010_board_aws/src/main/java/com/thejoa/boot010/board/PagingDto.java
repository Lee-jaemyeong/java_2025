package com.thejoa.boot010.board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class PagingDto {
	private int listtotal;   //#1) 전체글 121
	private int onepagelist; //#2) 한페이지에 보여줄 게시물의 수 10
	private int pagetotal;   //#3) 총페이지수 121/10 = 11     13페이지+1글
	private int bottomlist;  //#4) 하단의 페이지 나누기 이전 11 12 13 ...몇개?
	
	private int pstartno;    //#5) 페이지의 스타트번호  [1]: 최신글 0~10개
	
	private int current;     //#6) 현재페이지 번호
	private int start;       //#7) 시작페이지 번호
	private int end;         //#8) 끝페이지 번호
	
	public PagingDto(int listtotal, int pstartno) { // pstartno 0 1 2 3
		super();
		this.listtotal = listtotal;  // 전체계산한 값  121
		this.onepagelist = 10;
		
		//121/10 = 13페이지
		if(this.listtotal<=0) {this.listtotal=1;}
		this.pagetotal = (int)Math.ceil(listtotal/(double)onepagelist);
		
		this.bottomlist=10;
		
		this.pstartno = pstartno*10;   // 시작번호 넘겨받은 값 limit 0, 10 10,10 20,10
		
		// 	   1(0)      2(10)  3(20)  4(30)  5(40)  6  7  8  9 10(90) 다음(100)
		// 이전 11(100)  12     13     14    [15]    16 17 18 19 20     다음
		//현재) pstartno=10이라고 하면 현재페이지 번호는 2
		//현재) pstartno=40이라고 하면 현재페이지 번호는 5
		//                        100/10 = 10+1
		this.current = (this.pstartno/this.onepagelist) +1;     //#6) 현재페이지 번호
		
		//시작)  11  15  20 (20을 11, 15를 11, 11을 11 -> 앞자리는 1 -> 1*10 +1)
		this.start = ((current-1)/bottomlist)*bottomlist +1; //#7) 시작페이지 번호
		
		//끝) 
		this.end = this.start + bottomlist-1; //#8) 끝페이지 번호
		//   13       < 20
		if( pagetotal < end ) { this.end= pagetotal; }
		
	}	
	
}
