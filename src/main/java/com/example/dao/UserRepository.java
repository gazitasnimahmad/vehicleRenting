package com.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.User_Details;

@CrossOrigin(origins = "http://localhost:4200")
public interface UserRepository extends JpaRepository<User_Details, Integer> {
	
	
	@Query(value="SELECT * From User_Details p where p.user_name = ?1 and p.password = ?2",nativeQuery=true)
	User_Details userLogin(String user_name,String password);
	
}
