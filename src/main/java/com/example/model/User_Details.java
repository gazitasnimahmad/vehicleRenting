package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Details")
public class User_Details {

	public User_Details() {}
	
	public User_Details(String user_name,String user_email,String user_phone,String password ) {
		super();
		this.user_name=user_name;
		this.user_email=user_email;
		this.user_phone = user_phone;
		this.password=password;
	}
	

//	public User_Details(String user_name,String user_email,String user_phone,String password, String feedback,int vehicle_id ) {
//		super();
//		this.user_name=user_name;
//		this.user_email=user_email;
//		this.user_phone = user_phone;
//		this.password=password;
//		this.feedback = feedback;
//		this.vehicle_id =vehicle_id;
//	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
//	public int getVehicle_id() {
//		return vehicle_id;
//	}
//	public void setVehicle_id(int vehicle_id) {
//		this.vehicle_id = vehicle_id;
//	}

	private String user_name;
	private String user_email;
	private String user_phone;
	private String password;
	private String feedback;
	
//	@Column(nullable=true)
//	private int vehicle_id;
//	

}
