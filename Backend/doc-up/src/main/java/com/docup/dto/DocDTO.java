package com.docup.dto;

import com.docup.entity.Doc;

public class DocDTO {

	private Long id;
	private String username;
	private String password;
	private String email;
	private String phone;
	private String speciality;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public static DocDTO prepareDTO(Doc obj) {
		DocDTO dto = new DocDTO();
		
		dto.setEmail(obj.getEmail());
		dto.setId(obj.getId());
		dto.setPassword(obj.getPassword());
		dto.setPhone(obj.getPhone());
		dto.setSpeciality(obj.getSpeciality());
		dto.setUsername(obj.getUsername());
		
		return dto;
	}
	
	public static Doc prepareEntity(DocDTO dto) {
		Doc obj = new Doc();
		
		obj.setEmail(dto.getEmail());
		obj.setId(dto.getId());
		obj.setPassword(dto.getPassword());
		obj.setPhone(dto.getPhone());
		obj.setSpeciality(dto.getSpeciality());
		obj.setUsername(dto.getUsername());
		
		return obj;
	}
	
	
}
