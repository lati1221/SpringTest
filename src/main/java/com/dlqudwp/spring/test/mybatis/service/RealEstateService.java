package com.dlqudwp.spring.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlqudwp.spring.test.mybatis.domain.RealEstate;
import com.dlqudwp.spring.test.mybatis.repository.RealEstaterepository;

@Service
public class RealEstateService {
	
	@Autowired
	private RealEstaterepository realEstateRepository;
	
	public RealEstate getRealEstate(int id) {
		RealEstate realestate = realEstateRepository.selectRealEstate(id);
		
		return realestate;
	}
	
	// 전달받은 월세보다 낮은 매물정보 돌려주는 기능
	public List<RealEstate> getRealEstateByRentPrice(int rentPrice) {
		List<RealEstate> realEstateList = realEstateRepository.selectRealEstateByRentPrice(rentPrice);
		
		
		return realEstateList;
		
	}
	
	
	

}
