package com.code.myApp.users.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.myApp.users.entity.Users;
import com.code.myApp.users.service.UsersService;
import com.code.myApp.users.requestDto.UserSaveRequestDto;


@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
	
	@Autowired
	UsersService userService;
	
	@GetMapping("/getAll")
	public List<Users> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/save")
	public Users save(@Valid @RequestBody UserSaveRequestDto userDto) throws Exception{
		return userService.save(userDto);
	}

}
