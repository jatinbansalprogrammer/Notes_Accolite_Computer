package com.Entity;

import org.springframework.stereotype.Component;

@Component
public class School {
	
	private String schoolname;
	private String address;
	
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
