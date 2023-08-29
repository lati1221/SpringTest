package com.dlqudwp.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlqudwp.spring.test.jsp.domain.Seller;
import com.dlqudwp.spring.test.jsp.service.SellerService;

@RequestMapping("/jsp/seller")
@Controller
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@PostMapping("/create")
	@ResponseBody
	public String addSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("profileImage") String profileImage
			, @RequestParam("temperature") double temperature) {
		
		int count = sellerService.addSeller(nickname, profileImage, temperature);
		
		return "수행 결과 : " + count;
	
	}
	
	@GetMapping("/input")
	public String sellerInput() {
		
		return "jsp/sellerinsert";
		
	}
	
	@GetMapping("/last")
	public String lastSeller(Model model) {
		
		Seller seller = sellerService.getLastSeller();
		model.addAttribute("seller", seller);
		
		return "jsp/sellerinfo";
		
	}
	
	@GetMapping("/info")
	public String sellerInfo(@RequestParam(value="id", required=false) Integer id
			, Model model) {
		Seller seller = null;
		// id 파라미터가 있으면, id와 일치하는 판매자 정보
		if(id != null) {
			 seller = sellerService.getSeller(id);
			
		} else { // id 파라미터가 없으면, 최근 등록된 판매자 정보
			 seller = sellerService.getLastSeller();
			
		}
		model.addAttribute("seller", seller);
		return "jsp/sellerinfo";
	}
	

}
