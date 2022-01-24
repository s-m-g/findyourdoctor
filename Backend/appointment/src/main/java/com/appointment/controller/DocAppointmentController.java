package com.appointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.service.DocAppointmentService;
import com.apppointment.dto.DocAppointmentDTO;

@RestController
@CrossOrigin("*")
@RequestMapping("/appointment")
public class DocAppointmentController {
	
	@Autowired 
	DocAppointmentService service;
	
	//make appointment - post
	@PostMapping(value="/create")
	public ResponseEntity<Long> createAppointment(@RequestBody DocAppointmentDTO dto){
		
		return ResponseEntity.ok(service.createAppointment(dto));
	}
	
	@GetMapping(value="/get/{userId}")
	public ResponseEntity<List<DocAppointmentDTO>> getAppointments(@PathVariable long userId){
		
		return ResponseEntity.ok(service.getAppointments(userId));
	}
	
	@DeleteMapping(value="/delete/{appointmentId}")
	public ResponseEntity<String> deleteAppointment(@PathVariable Long appointmentId){
		String result = service.deleteAppointment(appointmentId);
		return ResponseEntity.ok(result);
	}
	
	

	

	

}
