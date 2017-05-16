package com.pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorkController {

	
	@RequestMapping("/helloword")
	public String hello() {
		System.out.println("进入后台控制类!!!");
		return "success";
	}
	
	@RequestMapping("/testPath/{id}")
	public String testPath(@PathVariable(value="id") Integer id) {
		System.out.println("请求ID为："+id);
		return "success";
	}
	
	@RequestMapping("/requestParams")
	public String testRequestParam(@RequestParam(value="username") String username,
			@RequestParam(value="age",required=false,defaultValue="0") Integer age) {
		
		System.out.println("用户姓名为："+username+"年龄："+age);
		return "success";
	}
}
