package com.oocl.web.sampleWebApp.model;

public class User {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "{\"username\":\"\"}";
	}
	
}
