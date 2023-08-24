package com.dlqudwp.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dlqudwp.spring.test.mybatis.domain.RealEstate;

@Repository
public interface RealEstaterepository {
	
	// id로 realestate 정보 조회
	public RealEstate selectRealEstate(@Param("id") int id);
	
	
	// 전달 받은 월세보다 낮은 매물 정보 행들을 돌려주는 기능
	public List<RealEstate> selectRealEstateByRentPrice(@Param("rentPrice")int rentPrice);

}
	
