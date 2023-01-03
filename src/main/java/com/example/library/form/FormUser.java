package com.example.library.form;

import com.example.library.model.User;

public class FormUser {

	private long id;
	
	private String name;
	
	private String surname;

	
	public FormUser() {
		
	}
	
	public User getUser() {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setSurname(surname);
		
		return user;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
