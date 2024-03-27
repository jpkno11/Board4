package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// http://localhost:8080 -> / (root)
	@RequestMapping("/")
	public String  home() {
		// coding ...
		return  "home";
		//return "/WEB-INF/views/home.jsp";    // home.jsp
	}
}











