package com.finddoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.finddoc.dto.UserDto;
import com.finddoc.entity.User;
import com.finddoc.service.UserService;

@SpringBootApplication
public class FindDocApplication implements CommandLineRunner{
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(FindDocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello Prarthana");
		
//		
//		UserDto user = new UserDto();
//		user.setUsername("Prarthana");
//		user.setPassword("1234567");
//		user.setEmail("123ray4@gmail.com");
//		user.setPhone("9029663");
//		
//		UserDto user1 = this.userService.userRegister(user);
//		System.out.println(user1.getUsername());
//		System.out.println(user1.getPassword());
//		System.out.println(user1.getEmail());
//		System.out.println(user1.getPhone());
//		
//		
		
	}
	
	

}
