package com.dlqudwp.spring.test.ajax.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dlqudwp.spring.test.ajax.domain.Reservation;

@Repository
public interface ReservationRepository {
	
	public List<Reservation> selectReservationList();

}
