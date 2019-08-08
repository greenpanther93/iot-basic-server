package com.zaragoza.teaching.iotserver;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {

	@Id
	private long id;
	
	@Column(name="student_id")
	private long student_id;
	
	@Column(name="gps_lat")
	private double gps_lat;
	
	@Column(name="gps_long")
	private double gps_long;
	
	@Column(name="student_message")
	private String student_message;
	
	public Message() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public double getGps_lat() {
		return gps_lat;
	}

	public void setGps_lat(double gps_lat) {
		this.gps_lat = gps_lat;
	}

	public double getGps_long() {
		return gps_long;
	}

	public void setGps_long(double gps_long) {
		this.gps_long = gps_long;
	}

	public String getStudent_message() {
		return student_message;
	}

	public void setStudent_message(String student_message) {
		this.student_message = student_message;
	}
	
	
	
	
}
