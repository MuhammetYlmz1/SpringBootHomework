package com.muhammet.springbootdemo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muhammet.springbootdemo.entities.concrete.User;


public interface UserDao extends JpaRepository<User, Integer>{
	
     public User getByEmailAdressAndPassword(String email,String password);
     
     
	
}
