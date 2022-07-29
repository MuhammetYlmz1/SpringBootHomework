package com.muhammet.springbootdemo.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<String> login(@Valid   UserLoginDto userLoginDto) {
		 authService.login(userLoginDto);
		 return new ResponseEntity<String>("Giriş Başarılı",HttpStatus.ACCEPTED);
	}

}
