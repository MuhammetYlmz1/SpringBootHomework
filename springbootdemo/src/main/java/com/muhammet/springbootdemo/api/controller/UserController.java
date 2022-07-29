package com.muhammet.springbootdemo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muhammet.springbootdemo.business.abstracts.UserService;
import com.muhammet.springbootdemo.entities.concrete.User;


@RestController
@RequestMapping("/api/users")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public List<User> getAll(){
		return this.userService.getAll();
	}
	/*@GetMapping("/login")
	public List<User> getByEmailAndPassword(String email,String password){
		return userService.getByEmailAndPassword(email, password);
	}*/
	
	@GetMapping("/getbyid")
	public User getById(int id) {
		return this.getById(id);
	}
	
}
