package com.appointment.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DocAppointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long appointmentId;
    private String username;
    private long number;
    private LocalDate appdate;
    private String slot;
    private long userId;
    private long docId;
   

    
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
	public long getDocId() {
		return docId;
	}
	public void setDocId(long docId) {
		this.docId = docId;
	}
	
}
