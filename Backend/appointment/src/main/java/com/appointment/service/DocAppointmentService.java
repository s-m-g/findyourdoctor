package com.appointment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.entity.DocAppointment;
import com.appointment.repository.DocAppointmentRepo;
import com.apppointment.dto.DocAppointmentDTO;

@Service
public class DocAppointmentService {
	
	@Autowired
	DocAppointmentRepo repo;
	
	public long createAppointment(DocAppointmentDTO dto) {
		
		DocAppointment app = DocAppointmentDTO.prepareEntity(dto);
		app = repo.saveAndFlush(app);
		return app.getAppointmentId();
	}
	
	public List<DocAppointmentDTO> getAppointments(long userId){
		
		List<DocAppointmentDTO> listOfAppointmentDTO = new ArrayList<>();
		List<DocAppointment> list = repo.getAllByUserId(userId);
		for(DocAppointment app : list) {
			listOfAppointmentDTO.add(DocAppointmentDTO.prepareDTO(app));
		}
		
		return listOfAppointmentDTO;
	}
	
	//To delete
	
	public String deleteAppointment(Long appointmentId) {
		repo.deleteById(appointmentId);
		return "Deleted Successfullly";
	}

}
