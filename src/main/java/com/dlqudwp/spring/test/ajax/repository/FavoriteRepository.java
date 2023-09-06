package com.dlqudwp.spring.test.ajax.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dlqudwp.spring.test.ajax.domain.Favorite;

@Repository
public interface FavoriteRepository {

	public List<Favorite> selectFavoriteList();
	
	public insertFavorite(
			@Param("name") String name
			, @Param("url") String url);
	
	
	
	
	
	
}
