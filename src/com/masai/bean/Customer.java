package com.masai.bean;

public class Customer {
	
	private String useranme;
	private String name;
	private int age;
	private String gender;
	private String password;
	
	
	
	public Customer(String useranme, String name, int age, String gender, String password) {
		super();
		this.useranme = useranme;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}
	
	
	public String getUseranme() {
		return useranme;
	}
	public void setUseranme(String useranme) {
		this.useranme = useranme;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Customer [useranme=" + useranme + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", password=" + password + "]";
	}
	
	
	public Customer() {
		
	}
	
	
	
	
	
	
	
	
	

}
