package com.dlqudwp.spring.test.mybatis.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	// 넓이와 가격 조건에 따른 매물정보 돌려주는 기능
	public List<RealEstate> getRealEstateByAreaAndPrice(int area, int price) {
		
		List<RealEstate> realEstateList = realEstateRepository.selectRealEstateByAreaAndPrice(area, price);
		
		return realEstateList;
		
	}
	
	
	public int addRealEstateByObject(RealEstate realEstate) {
		
		int count = realEstateRepository.insertRealEstateByObject(realEstate);
		
		return count;
		
	}
	
	public int addRealEstate(
			int realtorId, 
			String address, 
			int area, String type, 
			int price, 
			int rentPrice) {
		
		int count = realEstateRepository.insertRealEstate(realtorId, address, area, type, price, rentPrice);
		
		return count;
	}
	
	// 전달받은 id 와 일치하는 매물 정보를 전달 받은 type과 price로 수정한다.
	public int updateRealEstate(int id, String type, int price) {
		int count = realEstateRepository.updateRealEstate(id, type, price);
		
		return count;
		
	}
	
	public int deleteRealEstate(int id) {
		
		int count = realEstateRepository.deleteRealEstate(id);
		
		return count;
	}

}
