package com.dlqudwp.spring.test.jstl.repository;

import org.springframework.stereotype.Repository;

import com.dlqudwp.spring.test.jstl.domain.Weather;

@Repository
public interface WeatherRepository {
	
	public Weather selectWeatherList();

}
