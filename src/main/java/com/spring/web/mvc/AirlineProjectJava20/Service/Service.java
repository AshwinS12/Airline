package com.spring.web.mvc.AirlineProjectJava20.Service;

import com.hrm.springmvc.entity.bean.Loginbean;

public interface Service  {
	
	public String SignUp(Loginbean loginbean);
	
	public boolean Logindetails(String name , String password);

}
