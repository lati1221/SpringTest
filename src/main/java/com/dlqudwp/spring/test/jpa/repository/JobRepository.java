package com.dlqudwp.spring.test.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dlqudwp.spring.test.jpa.domain.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

	// companyId 컬럼이 일치하는 행 조회
	// WHERE `companyId` = ??
	public List<Job> findByCompanyId(int companyId);
	
	// position 컬럼과 type컬럼이 모두 일치하는 행 조회
	// WHERE `position` = ?? AND `type` = ??
	public List<Job> findByPositionAndType(String position, String type);
	
	// type 컬럼이 일치하거나 salary 컬럼의 값이 특정 값보다 이상인 행 조회
	// WHERE `type` = ?? OR `salary` >= ???
	public List<Job> findByTypeOrSalaryGreaterThanEqual(String type, int salary);
	
	
	// type 컬럼이 일치하는 행을 연봉기준으로 내림차순으로 3개 조회
	// WHERE `type` = ?? ORDER BY `salary` DESC LIMIT 3
	public List<Job> findTop3ByTypeOrderBySalaryDesc(String type);
	
	// region 컬럼이 일치하고 salary 컬럼이 특정값 사이의 조건에 대응되는 행 조회
	// WHERE `region` = ?? AND `salary` BETWEEN ?? AND ??
	public List<Job> findByRegionAndSalaryBetween(String region, int salaryStart, int salaryEnd);
	
	// deadline 컬럼이 특정 값보다 크고 salary가 특정 값 보다 크고 type이 일치하는 데이터를 연봉 내림차순으로 조회 
	@Query(value="SELECT * FROM `job` "
			+ "WHERE `deadline` > :deadline "
			+ "AND `salary` >= :salary "
			+ "AND `type` = :type "
			+ "ORDER BY `salary` DESC", nativeQuery=true)
	public List<Job> findByNativeQuery(
			@Param("deadline") String deadline
			, @Param("salary") int salary
			, @Param("type") String type);
	
	
	
	
}
