package com.dlqudwp.spring.test.test01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01Controller {
	
	
	@RequestMapping("/test/test01/1")
	@ResponseBody
	public Map<String, Integer> mapResponse() {
		
		
		Map<String, Integer> subjectMap = new HashMap<>();
		
		subjectMap.put("국어", 80);
		subjectMap.put("수학", 90);
		subjectMap.put("영어", 85);
		
		return subjectMap;
		
	}
	
	@RequestMapping("/test/test01/2")
	@ResponseBody
	public String stringResponse() {
		
		return "<h1>테스트 프로젝트 완성</h1> <h3>해당 프로젝트를 통해서 문제 풀이를 진행 합니다</h3>";
		
	}
	
	
	
	

}
