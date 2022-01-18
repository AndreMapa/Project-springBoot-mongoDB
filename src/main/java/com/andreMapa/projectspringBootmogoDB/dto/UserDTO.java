package com.andreMapa.projectspringBootmogoDB.dto;

import java.io.Serializable;

import com.andreMapa.projectspringBootmogoDB.domain.User;

public class UserDTO implements Serializable {

	private String id;
	private String name;
	private String email;
	
	public UserDTO() {}
	
	public UserDTO(User obj) {
		this.id = obj.getId();
		this.name = obj.getName();
		this.email = obj.getEmail();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
}
