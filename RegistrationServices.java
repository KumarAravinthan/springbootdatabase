package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserRegistration;

public interface RegistrationServices {
	
	public UserRegistration inserDate(UserRegistration userreg);
	
	public List<UserRegistration> getAlldata();
	
	public UserRegistration getoneRec(Long id);
	
	public void delete(Long id);
	
	public UserRegistration update(Long id,UserRegistration userreg);

}
