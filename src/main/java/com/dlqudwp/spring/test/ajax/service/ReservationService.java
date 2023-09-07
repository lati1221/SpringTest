package com.dlqudwp.spring.test.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlqudwp.spring.test.ajax.domain.Reservation;
import com.dlqudwp.spring.test.ajax.repository.ReservationRepository;


@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	public List<Reservation> getReservationList() {
		List<Reservation> reservationList = reservationRepository.selectReservationList();
		
		return reservationList;
	}

}
