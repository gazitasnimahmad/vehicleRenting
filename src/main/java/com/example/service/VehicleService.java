package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.VehicleRepository;
import com.example.model.Vehicle_Details;
import com.example.model.Vendor_Details;

import RequestModel.VendorLogin;
import RequestModel.bookVehicle;

@Service
public class VehicleService {

	@Autowired
	VehicleRepository vehicleRepo;

	public void saveNewVehicle(Vehicle_Details newVehicle) {
		Vehicle_Details vehicle = new Vehicle_Details();
		vehicle.setVehicle_name(newVehicle.getVehicle_name());
		vehicle.setBooking_status(newVehicle.getBooking_status());
		vehicle.setVehicle_avg(newVehicle.getVehicle_avg());
		vehicle.setBooking_price(newVehicle.getBooking_price());
		vehicle.setVehicle_category(newVehicle.getVehicle_category());
		vehicle.setVendor_id(newVehicle.getVendor_id());
		vehicleRepo.save(vehicle);
	}

	public List<Vehicle_Details> get2Wheelers() {
		return vehicleRepo.findBy2Wheeler();
	}

	public List<Vehicle_Details> get4Wheelers() {
		return vehicleRepo.findBy4Wheeler();
	}

	public void deleteVehicle(int vehicle_id) {
		vehicleRepo.deleteVehicle(vehicle_id);
		
	}
	
	public void bookVehicle1(bookVehicle vehicle) {
		bookVehicle newVehicle = new bookVehicle();
		newVehicle.setUser_id(vehicle.getUser_id());
		newVehicle.setVehicle_id(vehicle.getVehicle_id());
	    vehicleRepo.bookVehicle1(newVehicle.getUser_id(),newVehicle.getVehicle_id());
		
	}

}
