package com.spring.web.mvc.AirlineProjectJava20.DAO;

import com.spring.web.mvc.AirlineProjectJava20.bean.Ticketbookingbean;

public interface DAO {

	public String SignUp(Ticketbookingbean tb);
	
	public boolean logindetails(String username, String password);

}
