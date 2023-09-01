package com.dlqudwp.spring.test.jstl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class WeatherControll {

	@GetMapping("/jstl/alltest01")
	public String alltest01() {
		
		
		
		
		
		return "jstl/alltest01";
		
		
	}
	
}
