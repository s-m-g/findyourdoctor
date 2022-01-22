package com.finddoc.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.finddoc.dto.UserDto;
import com.finddoc.entity.User;
import com.finddoc.repo.UserRepo;

@Service
//@Component
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public Long userRegister(UserDto userDto) throws Exception {
		User user = new User();
		user = UserDto.prepareEntity(userDto);
		
//		User user1 = new User();
		
		User local = this.userRepo.findByUsername(user.getUsername());
		
		if(local !=null) {
			System.out.println("User is already present !!!");
			throw new Exception("User User already present!!");
		}
		else {
			local = userRepo.saveAndFlush(user);
		}
		
		return local.getId();
		
	}
	
	
	public Long userLogin(UserDto obj) {
		
		String userData = obj.getUsername();
		String userPassword = obj.getPassword();
		
		List<User> list = userRepo.findAll();
		for(User user : list) {
			if(user.getUsername().equals(userData)) {
				if(user.getPassword().equals(userPassword)) {
					return user.getId();
				}
			}	
		}

		return -1L;
		
		}
//	
	
	
	
	
	
	
	
	public UserDto getUser(String username) {
		
		User user = new User();
		UserDto userDto = new UserDto();
		user = UserDto.prepareEntity(userDto);
		user = userRepo.findByUsername(username);
		
		
		return UserDto.prepareDto(user);
		
	}
	
	public String deleteUser(Long id) {
		userRepo.deleteById(id);
		return "Successfully Deleted!!!";
	}
	
	
	
	
	
	
	
}
