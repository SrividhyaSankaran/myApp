package com.code.myApp.users.service;

import java.util.List;

import com.code.myApp.users.entity.Users;
import com.code.myApp.users.requestDto.UserSaveRequestDto;

public interface UsersService {

	List<Users> getAllUsers();
	
	Users save(UserSaveRequestDto userDto);
}
