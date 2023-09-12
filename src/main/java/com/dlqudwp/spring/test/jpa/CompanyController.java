package com.dlqudwp.spring.test.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlqudwp.spring.test.jpa.domain.Company;
import com.dlqudwp.spring.test.jpa.service.CompanyService;

@RequestMapping("/jpa/company")
@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/create")
	@ResponseBody
	public List<Company> createCompany() {
		
		
		List<Company> companyList = new ArrayList<>();
		
		Company company = companyService.addCompany("넥손", "컨텐츠 게임", "대기업", 3585);
		companyList.add(company);
		
		company = companyService.addCompany("버플팡", "연신 금융업", "대기업", 6834);
		companyList.add(company);
		
		return companyList;
		
	}
	
	
	@GetMapping("/update")
	@ResponseBody
	public Company updateCompany() {
		
		Company company = companyService.updateCompany(9, "중소기업", 34);
		
		return company;
	}
	
//	@GetMapping("/delete")
//	public deleteCompany() {
//		
//		
//	}
//	

}
