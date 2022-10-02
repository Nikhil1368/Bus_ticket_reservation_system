package com.masai.bean;

public class Bus {
	
	private String busNumber;
	private String busName;
	private int seats;
	private String depTime;
	private String arrTime;
	private String stPoint;
	private String endPoint;
	
	
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
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
	
	
	public Bus(String busNumber, String busName, int seats, String depTime, String arrTime, String stPoint,
			String endPoint) {
		super();
		this.busNumber = busNumber;
		this.busName = busName;
		this.seats = seats;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.stPoint = stPoint;
		this.endPoint = endPoint;
	}
	
	
	
	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", busName=" + busName + ", seats=" + seats + ", depTime=" + depTime
				+ ", arrTime=" + arrTime + ", stPoint=" + stPoint + ", endPoint=" + endPoint + "]";
	}
	
	
	
	
	
	
	
	
	

}
