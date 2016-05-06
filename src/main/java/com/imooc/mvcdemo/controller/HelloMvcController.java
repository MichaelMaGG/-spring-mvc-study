package com.imooc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {
	
	@RequestMapping("/mvc")
	public String hello() {
		return "home";
	}
	
    @RequestMapping("/index")
    public String index() {
        return "success";
    }
    
    @RequestMapping("/smart")
    public String smart() {
        return "smart";
    }

}
