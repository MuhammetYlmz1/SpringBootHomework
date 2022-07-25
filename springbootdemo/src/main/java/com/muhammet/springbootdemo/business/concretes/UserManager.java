package com.muhammet.springbootdemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muhammet.springbootdemo.business.abstracts.UserService;
import com.muhammet.springbootdemo.dataAccess.abstracts.UserDao;
import com.muhammet.springbootdemo.entities.abstracts.UserLoginDto;
import com.muhammet.springbootdemo.entities.concrete.User;


@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.findAll();
	}

	@Override
	public User getByEmailAdressAndPassword(String email, String password) {
		
		return userDao.getByEmailAdressAndPassword(email,password);
	}

	/*@Override
	public User getById(int id) {
		
		return this.userDao.getById(id);
	}*/

}
