package com.dlqudwp.spring.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/hello/test")
	public String helloworld() {
		return "Hello World!!";
	}

}
