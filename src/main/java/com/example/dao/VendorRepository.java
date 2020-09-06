package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.User_Details;
import com.example.model.Vendor_Details;

@CrossOrigin(origins = "http://localhost:4200")
public interface VendorRepository extends JpaRepository<Vendor_Details, Integer> {

	@Query(value="SELECT * From Vendor_Details p where p.vendor_name = ?1 and p.password = ?2",nativeQuery=true)
	Vendor_Details vendorLogin(String user_name,String password);
}
