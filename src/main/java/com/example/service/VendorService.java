package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.VendorRepository;
import com.example.model.User_Details;
import com.example.model.Vendor_Details;

import RequestModel.LoginModel;
import RequestModel.VendorLogin;

@Service
public class VendorService {

	@Autowired
	VendorRepository vendorRepo;


	  public void saveNewVendor(Vendor_Details newvendor){  
		  Vendor_Details user = new Vendor_Details();
		  user.setvendor_name(newvendor.getvendor_name());
		  user.setvendor_email(newvendor.getvendor_email());
		  user.setvendor_phone(newvendor.getvendor_phone());
		  user.setPassword(newvendor.getPassword());
		  vendorRepo.save(user); 
	    } 
	  
	  public Vendor_Details vendorLogin(VendorLogin vendorLogin) {
		  	VendorLogin reqModel = new VendorLogin();
			reqModel.setVendor_name(vendorLogin.getVendor_name());
			reqModel.setPassword(vendorLogin.getPassword());
		  return vendorRepo.vendorLogin(reqModel.getVendor_name(),reqModel.getPassword());
	  }

}
