package com.dlqudwp.spring.test.realtor.repository;

import org.springframework.stereotype.Repository;

import com.dlqudwp.spring.test.realtor.domain.Realtor;

@Repository
public interface RealtorRepository {
	
	public int insertRealtor(Realtor realtor);

}
