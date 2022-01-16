package com.finddoc.dto;

import com.finddoc.entity.User;

public class UserDto {
	
	private Long id;
	private String username;
	private String password;
	private String email;
	private String phone;
	
	public UserDto() {
		
		// TODO Auto-generated constructor stub
	}
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
	
//	private boolean enabled = true;
//	private String profile;  create getter setter for this too
	
	
	public static User prepareEntity(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		user.setEmail(userDto.getEmail());
		user.setPhone(userDto.getPhone());
		
		return user;
	}
	
	public static UserDto prepareDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setUsername(user.getUsername());
		userDto.setPassword(user.getPassword());
		userDto.setEmail(user.getEmail());
		userDto.setPhone(user.getPhone());
		
		return userDto;
	}
	
	
}
