package com.dlqudwp.spring.test.jstl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlqudwp.spring.test.jstl.domain.Weather;
import com.dlqudwp.spring.test.jstl.repository.WeatherRepository;

@Service
public class WeatherService {
	
	@Autowired
	private WeatherRepository weatherRepository;
	
	public Weather selectWeatherList() {
		
		Weather weather = weatherRepository.selectWeatherList();
		
		return weather;
	}
	

}
