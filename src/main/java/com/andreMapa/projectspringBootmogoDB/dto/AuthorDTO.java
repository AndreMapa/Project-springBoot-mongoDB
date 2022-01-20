package com.andreMapa.projectspringBootmogoDB.dto;

import java.io.Serializable;

import com.andreMapa.projectspringBootmogoDB.domain.User;

public class AuthorDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthorDTO() {}
	
	public AuthorDTO(User obj) {
		this.id = obj.getId();
		this.name = obj.getName();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
