package com.masai.bean;

public class Ticket {
	
	private String busNum;
	private String stPoint;
	private String endPoint;
	private String cusName;
	private int cusAge;
	private String gender;
	public String getBusNum() {
		return busNum;
	}
	public void setBusNum(String busNum) {
		this.busNum = busNum;
	}
	public String getStPoint() {
		return stPoint;
	}
	public void setStPoint(String stPoint) {
		this.stPoint = stPoint;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public int getCusAge() {
		return cusAge;
	}
	public void setCusAge(int cusAge) {
		this.cusAge = cusAge;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Ticket [busNum=" + busNum + ", stPoint=" + stPoint + ", endPoint=" + endPoint + ", cusName=" + cusName
				+ ", cusAge=" + cusAge + ", gender=" + gender + "]";
	}
	
	
	public Ticket(String busNum, String stPoint, String endPoint, String cusName, int cusAge, String gender) {
		super();
		this.busNum = busNum;
		this.stPoint = stPoint;
		this.endPoint = endPoint;
		this.cusName = cusName;
		this.cusAge = cusAge;
		this.gender = gender;
	}
	
	public Ticket() {
		
	}
	
	
	
	

}
