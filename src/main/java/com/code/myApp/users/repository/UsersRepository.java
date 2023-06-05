package com.code.myApp.users.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.myApp.users.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	
	List<Users> findTopByUserId(Long userId);
	
	List<Users> findAll();

}
