package com.muhammet.springbootdemo.entities.abstracts;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDto {
	@Email
	@NotBlank(message="Email Kısmı Boş Bırakılamaz")
	private String emailAdress;
	@NotEmpty(message="Password Kısmı Boş Bırakılamaz")
	private String password;
	


}
