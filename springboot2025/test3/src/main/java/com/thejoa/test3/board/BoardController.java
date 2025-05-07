package com.thejoa.test3.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BoardController {
	@Autowired BoardService boardService;
	
	@GetMapping("/board/list")
	public String list(Model model) {
		model.addAttribute("list", boardService.findAll());
		return "board/list";
	}
	
	@GetMapping("/board/detail/{id}")
	public String detail(@PathVariable Long id, Model model) {
		model.addAttribute("dto", boardService.findBoard(id));
		return "board/detail";
	}
	
	@GetMapping("/board/insert")
	public String insert() { return "board/write"; }
	
	@PostMapping("/board/insert")
	public String insert_post(Board board) {
		boardService.insertBoard(board);
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/update/{id}")
	public String update(@PathVariable Long id, Model model) {
		model.addAttribute("dto", boardService.findBoard(id));
		return "board/edit";
	}
	
	@PostMapping("/board/update")
	public String update_post(Board board, RedirectAttributes rttr) {
		String msg = "수정실패";
		if(boardService.updateBoard(board) > 0) { msg = "수정성공"; }
		rttr.addAttribute("msg", msg);
		return "redirect:/board/detail/" + board.getId();
	}
	
	@GetMapping("/board/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		model.addAttribute("id", id);
		return "board/delete";
	}
	
	@PostMapping("/board/delete")
	public String delete_post(Board board, RedirectAttributes rttr) {
		String msg = "삭제실패";
		if(boardService.deleteBoard(board) > 0) { msg = "삭제성공"; }
		rttr.addAttribute("msg", msg);
		boardService.deleteBoard(board);
		return "redirect:/board/list";
	}
}

