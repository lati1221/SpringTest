package com.dlqudwp.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlqudwp.spring.test.mybatis.domain.RealEstate;
import com.dlqudwp.spring.test.mybatis.service.RealEstateService;

@Controller
public class RealEstateController {

	@Autowired
	private RealEstateService realestateService;
	
	@RequestMapping("/mybatis/realestate")
	@ResponseBody
	public RealEstate realestate(@RequestParam("id") int id) {
		
		RealEstate realestate = realestateService.getRealEstate(id);
		
		return realestate;
			
	}
	
	
	@RequestMapping("/mybatis/realestate/2")
	@ResponseBody
	public List<RealEstate> realEstateByRentPrice(@RequestParam("rent") int rentPrice) {
		
		List<RealEstate> realEstateList = realestateService.getRealEstateByRentPrice(rentPrice);
		
		return realEstateList;
	}
	
	@RequestMapping("/mybatis/realestate/3")
	@ResponseBody
	public List<RealEstate> realEstateByAreaAndPrice(
			@RequestParam("area") int area, 
			@RequestParam("price") int price) {
		
		List<RealEstate> realEstateList = realestateService.getRealEstateByAreaAndPrice(area, price);
		
		return realEstateList;
		
		
	}
	
	@RequestMapping("/mybatis/realestate/insert")
	@ResponseBody
	public String createRealEstateByObject() {
		
		RealEstate realEstate = new RealEstate();
		
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int count = realestateService.addRealEstateByObject(realEstate);
		
		return "수행 결과 : " + count;
		
	}
	
	@RequestMapping("/mybatis/realestate/insert/2")
	@ResponseBody
	public String createRealEstate(@RequestParam("realtorId") int realtorId) {
		
		int count = realestateService.addRealEstate(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		
		return "수행결과 : " + count;
		
		
		
		
	}
	
	
	
	
}
