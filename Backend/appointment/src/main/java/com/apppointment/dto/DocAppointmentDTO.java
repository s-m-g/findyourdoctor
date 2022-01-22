package com.apppointment.dto;

import java.time.LocalDate;

import com.appointment.entity.DocAppointment;

public class DocAppointmentDTO {
	
	private long appointmentId;
    private String username;
    private long number;
    private LocalDate appdate;
    private String slot;
    private long userId;
    private long docId;

    
	public long getDocId() {
		return docId;
	}
	public void setDocId(long docId) {
		this.docId = docId;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public LocalDate getAppdate() {
		return appdate;
	}
	public void setAppdate(LocalDate appdate) {
		this.appdate = appdate;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
    
    public static DocAppointmentDTO prepareDTO(DocAppointment obj) {
    	
    	DocAppointmentDTO dto = new DocAppointmentDTO();
    	
    	dto.setAppdate(obj.getAppdate());
    	dto.setAppointmentId(obj.getAppointmentId());
    	dto.setNumber(obj.getNumber());
    	dto.setSlot(obj.getSlot());
    	dto.setUserId(obj.getUserId());
    	dto.setUsername(null);
    	dto.setDocId(obj.getDocId());
    	dto.setUsername(obj.getUsername());
    	return dto;
    }
    
    
    public static DocAppointment prepareEntity(DocAppointmentDTO dto) {
    	
    	DocAppointment obj = new DocAppointment();
    	
    	obj.setAppdate(dto.getAppdate());
    	obj.setAppointmentId(dto.getAppointmentId());
    	obj.setDocId(dto.getDocId());
    	obj.setNumber(dto.getNumber());
    	obj.setSlot(dto.getSlot());
    	obj.setUserId(dto.getUserId());
    	obj.setUsername(dto.getUsername());
    	
    	return obj;
    }

}
