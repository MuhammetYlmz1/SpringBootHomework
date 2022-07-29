package com.muhammet.springbootdemo.business.abstracts;

import java.util.List;

import com.muhammet.springbootdemo.entities.abstracts.UserLoginDto;
import com.muhammet.springbootdemo.entities.concrete.User;


public interface UserService {
	public List<User> getAll();
	public User getByEmailAdressAndPassword(String email,String password);
	public User getById(int id);
}
