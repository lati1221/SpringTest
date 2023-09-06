package com.dlqudwp.spring.test.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dlqudwp.spring.test.ajax.domain.Favorite;
import com.dlqudwp.spring.test.ajax.service.FavoriteService;

@Controller
public class FavoriteController {

	@Autowired
	private FavoriteService favoriteService;
	
	@GetMapping("/list")
	public String favoriteList(Model model) {
		List<Favorite> favoriteList = favoriteService.getFavoriteList();
		
		model.addAttribute("favoriteList", favoriteList);
		
		return "ajax/favorite/list";
	}
	
	
	
	@PostMapping("/duplicate-url")
	public isDuplicate
	
	
}


