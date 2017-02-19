package com.gy.github;

public class User {

	private String username;
	private String email;
	private Integer id;
	public User() {
	}
	public User(String username, String email, Integer id) {
		this.username = username;
		this.email = email;
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", id=" + id
				+ "]";
	}
	
	
	
	
}
