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
	public RealEstate RealEstateByRentPrice(@RequestParam("rent")int rentPrice) {
		
		List<RealEstate> realEstateService.getRealEstateByRentPrice(rentPrice);
		
		return realEstateList;
	}
	
	
}
