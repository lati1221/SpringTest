package com.dlqudwp.spring.test.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlqudwp.spring.test.jpa.domain.Job;
import com.dlqudwp.spring.test.jpa.repository.JobRepository;

@Controller
public class JobController {
	
	@Autowired
	private JobRepository jobRepository;
	
	
	@GetMapping("/jpa/job/select")
	@ResponseBody
	public List<Job> selectJob() {
		
		List<Job> jobList = jobRepository.findById(8);
		
		
		return jobList;
		
	}
	

}
