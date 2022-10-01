package com.masai.bean;

public class Admin {
	
	private String username;
	private String name;
	private String password;
	
	
	public Admin(String username, String name, String password) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Admin [username=" + username + ", name=" + name + ", password=" + password + "]";
	}
	
	public Admin()
	{
		
	}
	
	

}
