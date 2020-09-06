package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.example.dao.UserRepository;
import com.example.model.User_Details;
import com.example.model.Vehicle_Details;
import com.example.model.Vendor_Details;
import com.example.service.UserService;
import com.example.service.VendorService;

import RequestModel.LoginModel;
import RequestModel.VendorLogin;
import RequestModel.bookVehicle;

import com.example.service.VehicleService;

import java.util.*;



 
@RestController
//@RequestMapping("/users") 
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {
	
	@Autowired  
	 private UserService userService; 
	
	@Autowired
	private VendorService vendorService;
	
	@Autowired
	private VehicleService vehicleService;
	
	
	@GetMapping(value="getUsers" , produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User_Details> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping(value="saveUser",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	 public void  saveNewContact(@RequestBody User_Details newUser) {
		 userService.addUser(newUser);
		 
    }
	
	@PostMapping(value="userLogin" ,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User_Details userLogin(@RequestBody LoginModel loginModel) {
		return userService.userLogin(loginModel);
	}
	
	
	
	@PostMapping(value="saveVendor",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	 public void  saveNewVendor(@RequestBody Vendor_Details newVendor) {
		vendorService.saveNewVendor(newVendor); 
   }
	
	@PostMapping(value="vendorLogin" ,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Vendor_Details vendorLogin(@RequestBody VendorLogin vendorLogin) {
		return vendorService.vendorLogin(vendorLogin);
	}
	
	@DeleteMapping(value="deleteVehicle")
	public void deleteVehicle(@RequestBody int vehicle_id) {
		vehicleService.deleteVehicle(vehicle_id);
	}
	
	
	@PostMapping(value="/saveVehicle",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	 public void  saveNewVehicle(@RequestBody Vehicle_Details newVehicle) {
		vehicleService.saveNewVehicle(newVehicle); 
  }
	
	@GetMapping(value="get2Wheelers" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vehicle_Details> get2Wheelers() {
		return vehicleService.get2Wheelers();
	}
	
	@GetMapping(value="get4Wheelers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vehicle_Details> get4Wheelers() {
		return vehicleService.get4Wheelers();
	}
	
	@PostMapping(value="bookVehicle" ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void bookVehicle1(@RequestBody bookVehicle vehicle) {
		 vehicleService.bookVehicle1(vehicle);
	}
	
	
}
