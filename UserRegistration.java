package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class UserRegistration {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	private String userName;
	private String userAddress;
	
	public UserRegistration() {
		
	}
	public UserRegistration(Long userid, String userName, String userAddress) {
		
		this.userid = userid;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", userAddress=" + userAddress + "]";
	}
	
	
	
	
	

}
