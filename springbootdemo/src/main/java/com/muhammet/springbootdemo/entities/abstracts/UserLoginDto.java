package com.muhammet.springbootdemo.entities.abstracts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class UserLoginDto {
	private String emailAdress;
	private String password;
	
	public UserLoginDto() {
		
	}

}
