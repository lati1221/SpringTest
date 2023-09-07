package com.dlqudwp.spring.test.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dlqudwp.spring.test.ajax.domain.Reservation;
import com.dlqudwp.spring.test.ajax.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/reservation/list")
	public String reservationList(Model model) {
		
		List<Reservation> reservationList = reservationService.getReservationList();
		
		model.addAttribute("reservationList", reservationList);
		
		return "ajax/reservation/list";
	}

}
