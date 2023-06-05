package com.code.myApp.users.service.Impl;

import com.code.myApp.responseDto.*;
import com.code.myApp.users.entity.Users;
import com.code.myApp.users.repository.UsersRepository;
import com.code.myApp.users.requestDto.UserSaveRequestDto;
import com.code.myApp.users.service.UsersService;
import com.code.myApp.utility.*;
import java.lang.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersRepository userRepository;
	
	MapperUtil<UserSaveRequestDto, Users> userMapper = new MapperUtil<>();
	
	
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		List<Users> users = userRepository.findAll();
		return users;
	}
	
	@Override
	@Transactional( propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Users save(UserSaveRequestDto userDto) {
		// TODO Auto-generated method stub
		Users obj = userMapper.transfer(userDto, Users.class);
		userRepository.save(obj);
		return null;
	}
	
	

}
