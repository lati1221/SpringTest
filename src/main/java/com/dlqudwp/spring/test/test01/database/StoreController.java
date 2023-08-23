package com.dlqudwp.spring.test.test01.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlqudwp.spring.test.test01.database.domain.Store;
import com.dlqudwp.spring.test.test01.database.service.StoreService;

@Controller
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	@RequestMapping("/db/store/list")
	@ResponseBody
	public List<Store> getStoreList() {
		
		List<Store> storeList = storeService.getStoreList();
		return storeList;
		
	}
	
	

}
