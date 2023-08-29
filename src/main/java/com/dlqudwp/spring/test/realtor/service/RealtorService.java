package com.dlqudwp.spring.test.realtor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlqudwp.spring.test.realtor.repository.RealtorRepository;

@Service
public class RealtorService {

	@Autowired
	private RealtorRepository relatorRepository;
	
	public int addRealtor(String office, String phoneNumber, String address, String grade) {
		
		int count = relatorRepository.insertRealtor(office, phoneNumber, address, grade);
		
		return count;
	}
	
}
