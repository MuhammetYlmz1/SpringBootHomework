package com.muhammet.springbootdemo.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name="users")
@Data
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int id;
	
	@NotNull
	@Email(message="Geçerli Email Adresi Giriniz")
	@Column(name="email_adress")
	private String emailAdress;
	
	@NotNull
	@Column(name="full_name")
	private String fullName;
	
	@NotNull
	@Column(name="password")
	private String password;
	
	@Column(name="title")
	private String title;
	
	public User() {};

}
