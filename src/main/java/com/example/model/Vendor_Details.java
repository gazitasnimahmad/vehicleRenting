package com.example.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vendor_Details")
public class Vendor_Details {

	public Vendor_Details() {}

	public Vendor_Details(String vendor_name,String vendor_email,String vendor_phone,String password) {
		this.vendor_name=vendor_name;
		this.vendor_email=vendor_email;
		this.vendor_phone=vendor_phone;
		this.password=password;
	}
	
	

	public int getvendor_id() {
		return vendor_id;
	}

	public void setvendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getvendor_name() {
		return vendor_name;
	}

	public void setvendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getvendor_email() {
		return vendor_email;
	}

	public void setvendor_email(String vendor_email) {
		this.vendor_email = vendor_email;
	}

	public String getvendor_phone() {
		return vendor_phone;
	}

	public void setvendor_phone(String vendor_phone) {
		this.vendor_phone = vendor_phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vendor_id;
	
	private String vendor_name;
	private String vendor_email;
	private String vendor_phone;
	private String password;
	private int vehicle_id;
	
}
