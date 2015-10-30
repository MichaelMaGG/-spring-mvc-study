package com.ziroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMVCController {

	@RequestMapping("/mvc")
	public String helloMVC(){
		return "home";
	}
}
