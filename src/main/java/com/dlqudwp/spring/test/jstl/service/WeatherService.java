package com.dlqudwp.spring.test.jstl.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlqudwp.spring.test.jstl.domain.Weather;
import com.dlqudwp.spring.test.jstl.repository.WeatherRepository;

@Service
public class WeatherService {
	
	@Autowired
	private WeatherRepository weatherRepository;
	
	public List<Weather> getWeatherHistory() {
		List<Weather> weatherhistory = weatherRepository.selectWeatherHistory();
		
		return weatherhistory;
	}
	
	public int addWeather(
			Date date
			, String weather
			, double temperatures
			, double precipitation
			, String microDust
			, double windSpeed) {
		
		int count = weatherRepository.insertWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
		
		return count;
	}
	
	public int addWeatherByObject(Weather weather) {
		int count = weatherRepository.insertWeatherByObject(weather);
		
		return count;
	}
	
}
