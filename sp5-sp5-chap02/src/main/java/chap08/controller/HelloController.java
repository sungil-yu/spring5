package chap08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloController {
	
	@GetMapping("/hello")
	public String hello(Model model,
			 @RequestParam(value = "name", required = false)String name) {
		
		model.addAttribute("greeting","안녕하세요, " + name);
		//이전에는 HttpRequest객체에 담아서 줬다. 하지만 스프링mvc가 변환을 해준다.
		return "Hello";
	}
}
