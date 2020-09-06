package com.example.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.dao.UserRepository;
import com.example.model.User_Details;
import com.example.model.Vendor_Details;

import RequestModel.LoginModel;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo; 
	
	  public List<User_Details> getAllUsers(){  
		  List<User_Details> usersList = new ArrayList<>(); 
			userRepo.findAll().forEach(usersList::add);
			return usersList; 
	    }  
//	  public User_Details userLogin(User_Details user){  
//	        return userRepo.findByUser_name(user.getUser_name());  
//	    }  
//	 
	  public void addUser(User_Details userRequest){  
		  User_Details user = new User_Details();
		  user.setUser_name(userRequest.getUser_name());
		  user.setUser_email(userRequest.getUser_email());
		  user.setUser_phone(userRequest.getUser_phone());
		  user.setPassword(userRequest.getPassword());
			 userRepo.save(user); 
	    }  
//	  public void delete(Integer id){  
//	        userRepository.deleteById(id);  
//	    }  
	  
	  public User_Details userLogin(LoginModel loginModel) {
		  LoginModel reqModel = new LoginModel();
			reqModel.setUser_name(loginModel.getUser_name());
			reqModel.setPassword(loginModel.getPassword());
		  return userRepo.userLogin(reqModel.getUser_name(),reqModel.getPassword());
	  }
	  
	

}
