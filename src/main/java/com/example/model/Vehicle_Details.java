package com.example.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle_Details")
public class Vehicle_Details {

	public Vehicle_Details() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle_Details(String vehicle_name,String booking_status,int vehicle_avg,int booking_price,String vehicle_category,int vendor_id) {
		super();
		this.vehicle_name=vehicle_name;
		this.booking_status=booking_status;
		this.vehicle_avg=vehicle_avg;
		this.booking_price=booking_price;
		this.vehicle_category=vehicle_category;
		this.vendor_id=vendor_id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicle_id;
	
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public String getBooking_status() {
		return booking_status;
	}
	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}
	public int getVehicle_avg() {
		return vehicle_avg;
	}
	public void setVehicle_avg(int vehicle_avg) {
		this.vehicle_avg = vehicle_avg;
	}
	public int getBooking_price() {
		return booking_price;
	}
	public void setBooking_price(int booking_price) {
		this.booking_price = booking_price;
	}
	public String getVehicle_category() {
		return vehicle_category;
	}
	public void setVehicle_category(String vehicle_category) {
		this.vehicle_category = vehicle_category;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	private String vehicle_name;
	private String booking_status;
	private int vehicle_avg;
	private int booking_price;
	private String vehicle_category;
	private int user_id;
	private int vendor_id;

}
