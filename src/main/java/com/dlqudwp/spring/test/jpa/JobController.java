package com.dlqudwp.spring.test.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlqudwp.spring.test.jpa.domain.Job;
import com.dlqudwp.spring.test.jpa.repository.JobRepository;

@RequestMapping("/jpa/job/select")
@Controller
public class JobController {
	
	@Autowired
	private JobRepository jobRepository;
	
	
	@GetMapping("/1")
	@ResponseBody
	public Job selectJob() {
		
		Optional<Job> optionalJob = jobRepository.findById(8);
		Job job = optionalJob.orElse(null);
		
		return job;
		
	}
	
	
	@GetMapping("/2")
	@ResponseBody
	public List<Job> selectJob2(@RequestParam("companyId") int companyId) {
		List<Job> jobList = jobRepository.findByCompanyId(companyId);
		
		return jobList;
	}
	
	@GetMapping("/3")
	@ResponseBody
	public List<Job> selectJob3() {
		
		List<Job> jobList = jobRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
		
		return jobList;
	}
	
	@GetMapping("/4")
	@ResponseBody
	public List<Job> selectJob4() {
		List<Job> jobList = jobRepository.findByTypeOrSalaryGreaterThanEqual("정규직", 9000);
		
		return jobList;
	}
	
	@GetMapping("/5")
	@ResponseBody
	
	public List<Job> selectJob5() {
		
	  List<Job> jobList = jobRepository.findTop3ByTypeOrderBySalaryDesc("계약직");
		
	  return jobList;
	  
	}
	
	@GetMapping("/6")
	@ResponseBody
	public List<Job> selectJob6() {
		
		return jobRepository.findByRegionAndSalaryBetween("성남시 분당구", 7000, 8500);
		
	}
	
	@GetMapping("/7")
	@ResponseBody
	public List<Job> selectJob7() {
		
		return jobRepository.findByNativeQuery("2026-04-10", 8100, "정규직");
		
		
	}
	
	

}
