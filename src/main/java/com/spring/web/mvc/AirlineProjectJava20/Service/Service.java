package com.spring.web.mvc.AirlineProjectJava20.Service;

import com.spring.web.mvc.AirlineProjectJava20.bean.Ticketbookingbean;

public interface Service {

	public String SignUp(Ticketbookingbean tb);
	
	public boolean Logindetails(String name , String password);

}

