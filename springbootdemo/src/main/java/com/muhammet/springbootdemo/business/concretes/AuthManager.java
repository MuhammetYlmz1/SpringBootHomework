package com.muhammet.springbootdemo.business.concretes;

import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muhammet.springbootdemo.business.abstracts.AuthService;
import com.muhammet.springbootdemo.dataAccess.abstracts.UserDao;
import com.muhammet.springbootdemo.entities.abstracts.UserLoginDto;
import com.muhammet.springbootdemo.entities.concrete.User;

@Service
public class AuthManager implements AuthService{

	private UserDao userDao;
	
	
	@Autowired
	public AuthManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

 

	@Override
	public User login(UserLoginDto userLoginDto) {
		return userDao.getByEmailAdressAndPassword(userLoginDto.getEmailAdress(), userLoginDto.getPassword());
		
	}

}
