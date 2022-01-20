package com.andreMapa.projectspringBootmogoDB.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO author;
	
	public CommentDTO(){}

	public CommentDTO(String text, Date date, AuthorDTO author) {
		super();
		this.text = text;
		this.date = date;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public Date getDate() {
		return date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}
}
