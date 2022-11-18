package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserRegistration;
import com.example.demo.service.RegistrationServices;





@RestController
public class UserController {
	
	
	@Autowired
	private RegistrationServices RService;
	
	
	
	
	
	@PostMapping("/postdata")
	public UserRegistration insertData(@RequestBody UserRegistration registration)
	{
		System.out.println("From Controller");
		return RService.inserDate(registration);
	}
	
	@GetMapping("/getData")
	public List<UserRegistration> getAlldata(){
		
		
		return RService.getAlldata();
	}
	
	@GetMapping("/getalldata/{id}")
	public UserRegistration getonerec(@PathVariable("id") Long id)
	{
		return RService.getoneRec(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteData(@PathVariable("id") Long id)
	{
		 RService.delete(id);
	}
	
	@PutMapping("/modify/{id}")
	public UserRegistration updateData(@PathVariable("id") Long id, @RequestBody UserRegistration userreg)
	{
		return RService.update(id, userreg);
	}
	
	

}
