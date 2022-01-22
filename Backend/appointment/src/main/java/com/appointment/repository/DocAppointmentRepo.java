package com.appointment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointment.entity.DocAppointment;

@Repository
public interface DocAppointmentRepo extends JpaRepository<DocAppointment, Long>{
	public List<DocAppointment> getAllByUserId(long userId);
	

}
