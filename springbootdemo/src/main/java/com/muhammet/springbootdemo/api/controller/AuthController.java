package com.muhammet.springbootdemo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muhammet.springbootdemo.business.abstracts.AuthService;
import com.muhammet.springbootdemo.entities.abstracts.UserLoginDto;
import com.muhammet.springbootdemo.entities.concrete.User;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	private AuthService authService;
	@Autowired
	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@GetMapping("/login")
	public User login(UserLoginDto userLoginDto) {
		return authService.login(userLoginDto);
	}

}
