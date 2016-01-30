package com.imooc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//����DispatcherServlet��ص������� ����һ��Controller�� ��������beanŶ
@Controller
//�༶���RequestMapping������DispatcherServlet������ฺ�����Ը�URL��
//HandlerMapping���������ǩ������
@RequestMapping("/hello")
public class HelloMvcController {
	
	//���������RequestMapping�� ���Ʋ���С��URL·��ƥ�䣬ͬ�༶��ı�ǩЭͬ����������ȷ�����ص���URL���Ǹ���������
    // host:port/hello/mvc
	@RequestMapping("/mvc")
	public String hello() {
		
		//host:port/WEB-INF/jsps/home.jsp
		return "home";
	}
	
    @RequestMapping("/index")
    public String index() {
        
        return "index";
    }

}
