package com.dlqudwp.spring.test.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dlqudwp.spring.test.jpa.domain.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

	public List<Job> findById(int id);
	
	
}
