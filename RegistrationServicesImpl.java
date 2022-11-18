package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserRegistration;
import com.example.demo.repository.RegRepository;

@Service
public class RegistrationServicesImpl implements RegistrationServices{
	
	@Autowired
	private RegRepository repository;

	@Override
	public UserRegistration inserDate(UserRegistration userreg) {
		// TODO Auto-generated method stub
		//insert into user_registration (user_address, user_name, userid) values (?, ?, ?)
		return repository.save(userreg);
	}
	//get all records
	@Override
	public List<UserRegistration> getAlldata() {
		// TODO Auto-generated method stub
		//select * from student
		return repository.findAll();
	}
	//get particular
	@Override
	public UserRegistration getoneRec(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();		
		
	}
	//delete method
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	
	//update method
	@Override
	public UserRegistration update(Long id, UserRegistration userreg) {		// TODO Auto-generated method stub
		
		UserRegistration userid= repository.findById(id).get();
		userid.setUserName(userreg.getUserName());
		userid.setUserAddress(userreg.getUserAddress());		
		return repository.save(userid);
		
		
	}

	

	
	

	
	
}
