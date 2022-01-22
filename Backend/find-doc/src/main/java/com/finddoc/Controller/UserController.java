package com.finddoc.Controller;

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

import com.finddoc.dto.UserDto;
import com.finddoc.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping(value="/")
	public ResponseEntity<Long> userRegister(@RequestBody UserDto userDto ) throws Exception{
		return ResponseEntity.ok(service.userRegister(userDto));
		
	}
	
	
	@PostMapping(value="/login")
	public ResponseEntity<Long> userLogin(@RequestBody UserDto objDTO){
		return ResponseEntity.ok(
				service.userLogin(objDTO)
				);
	}

	
	@GetMapping("/{username}")
	public UserDto getUser(@PathVariable String username) {
		
		return this.service.getUser(username);
		
	}
	
//	@DeleteMapping("/{userId}")
//	public ResponseEntity<String> deleteUser(@PathVariable ("userId") Long usreId) {
//		
//		return ResponseEntity<String>;
//		

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id){
		String uS= service.deleteUser(id);
		return ResponseEntity.ok(uS);
	}
}
