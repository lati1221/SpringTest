package com.dlqudwp.spring.test.realtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlqudwp.spring.test.realtor.service.RealtorService;

@RequestMapping("/realtor")
@Controller
public class RealtorController {
	
	@Autowired
	private RealtorService realtorService;
	
	@PostMapping("/create")
	@ResponseBody
	public String addRealtor(
			@RequestParam("office") String office
			, @RequestParam("phoneNumber") String phoneNumber
			, @RequestParam("address") String address
			, @RequestParam("grade") String grade) {
		
		int count = realtorService.addRealtor(office, phoneNumber, address, grade);
		
		return "수행결과 : " + count;
	}
	

}
