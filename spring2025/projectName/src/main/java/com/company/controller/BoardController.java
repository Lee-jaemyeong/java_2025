package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.dto.BoardDto;
import com.company.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired BoardService service;
	
	// 전체리스트가져오기 : 전체데이터가져오기  (selectAll())  + view (board/list)
	@RequestMapping(value="/list" , method=RequestMethod.GET)
	public String list( Model model ) { 
		model.addAttribute("list" , service.selectAll());
		return "board/list";
	}
	
	// 글 쓰기화면 :       X          +  view (board/write)
	@RequestMapping(value="/write" , method=RequestMethod.GET)
	public String write() {return "board/write";}
	
	// 글 쓰기기능 : insert(BoardDto dto)  +  board/list (새로 갱신된 list)
	@RequestMapping(value="/write" , method=RequestMethod.POST)
	public String write_post( BoardDto dto , RedirectAttributes rttr ) {
		String result="fail";
		if(dto != null && service.insert(dto) > 0 ) { result="success"; }  // 글쓰기
		rttr.addFlashAttribute("result" , result);
		return "redirect:/board/list";
	}
	// RedirectAttributes rttr
	// : view페이지에 redirect한 결과를 넘겨주는 방법
	// board/list.jsp 파일에서 result한 결과를 알림창 1번만 처리
	// refresh(새로고침) result가 유지안됨.
	
	// 글 상세보기 : detail(int bno) + view (board/detail)
	@RequestMapping(value="/detail" , method=RequestMethod.GET)
	public String detail(Model model , int bno) {
		model.addAttribute("dto" , service.detail(bno));
		return "board/detail";
	}
	
	// 글 수정하기 폼 : updateForm(int bno) + view (board/update)
	@RequestMapping(value="/update" , method=RequestMethod.GET)
	public String update(Model model , int bno) {
		model.addAttribute("dto" , service.updateForm(bno));
		return "board/update";
	}
	
	// 글 수정기능 : update(BoardDto dto) + board/detail
	@RequestMapping(value="/update" , method=RequestMethod.POST)
	public String update_post(BoardDto dto) {
		if(dto != null) { service.update(dto); }
		return "redirect:/board/detail?bno=" + dto.getBno();
	}
	
	// 글 삭제폼 :     X    , view (board/delete)
	@RequestMapping(value="/delete" , method=RequestMethod.GET)
	public String delete() {return "board/delete";}
	
	// 글 삭제기능 : delete(BoardDto dto) + 갱신된 리스트 - board/list
	@RequestMapping(value="/delete" , method=RequestMethod.POST)
	public String delete_post(BoardDto dto) {
		if(dto != null) { service.delete(dto); }
		return "redirect:/board/list";
	}
}

/* ver-1
@Controller
public class BoardController {
	@RequestMapping(value="/board/list" , method=RequestMethod.GET)
	public String list() { return "board/list"; }
	
	@RequestMapping(value="/board/write" , method=RequestMethod.GET)
	public String write() {return "board/write";}
	
	@RequestMapping(value="/board/write" , method=RequestMethod.POST)
	public String write_post() {return "board/write";}
	
	@RequestMapping(value="/board/detail" , method=RequestMethod.GET)
	public String detail() {return "board/detail";}
	
	@RequestMapping(value="/board/update" , method=RequestMethod.GET)
	public String update() {return "board/update";}
	
	@RequestMapping(value="/board/update" , method=RequestMethod.POST)
	public String update_post() {return "board/update";}
	
	@RequestMapping(value="/board/delete" , method=RequestMethod.GET)
	public String delete() {return "board/delete";}
	
	@RequestMapping(value="/board/delete" , method=RequestMethod.POST)
	public String delete_post() {return "board/delete";}
}
*/