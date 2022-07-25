package com.muhammet.springbootdemo.business.abstracts;

import com.muhammet.springbootdemo.entities.abstracts.UserLoginDto;
import com.muhammet.springbootdemo.entities.concrete.User;

public interface AuthService {
	User login(UserLoginDto userLoginDto);

}
