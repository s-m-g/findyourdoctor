package com.finddoc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.finddoc.entity.User;

@Repository
//@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);
}
