package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {
	@RequestMapping(value="/list" , method=RequestMethod.GET)
	public String list() { return "board/list"; }
	
	@RequestMapping(value="/write" , method=RequestMethod.GET)
	public String write() {return "board/write";}
	
	@RequestMapping(value="/write" , method=RequestMethod.POST)
	public String write_post() {return "board/write";}
	
	@RequestMapping(value="/detail" , method=RequestMethod.GET)
	public String detail() {return "board/detail";}
	
	@RequestMapping(value="/update" , method=RequestMethod.GET)
	public String update() {return "board/update";}
	
	@RequestMapping(value="/update" , method=RequestMethod.POST)
	public String update_post() {return "board/update";}
	
	@RequestMapping(value="/delete" , method=RequestMethod.GET)
	public String delete() {return "board/delete";}
	
	@RequestMapping(value="/delete" , method=RequestMethod.POST)
	public String delete_post() {return "board/delete";}
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