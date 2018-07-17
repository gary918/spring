package com.gary.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class WebController {
	
	//@Autowired
	//ConfigBean configBean;

	@GetMapping("/")
	public String search(Model model) {

		return "index";
	}
}

