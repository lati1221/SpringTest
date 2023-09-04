package com.dlqudwp.spring.test.jstl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dlqudwp.spring.test.jstl.domain.Weather;
import com.dlqudwp.spring.test.jstl.service.WeatherService;



@Controller
public class WeatherControll {

	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/jstl/alltest01")
	public String weatherList(Model model) {
		
		List<Weather> weatherhistory = weatherService.getWeatherHistory();
		
		model.addAttribute("weatherhistory", weatherhistory);
	
		return "jstl/alltest01";
		
		
	}
	
}
