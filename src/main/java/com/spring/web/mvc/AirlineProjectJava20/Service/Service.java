package com.spring.web.mvc.AirlineProjectJava20.Service;

import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;

public interface Service {

	public String SignUp(Loginbean loginbean);
	
	public boolean Logindetails(String name , String password);

    public String Searchticket(Loginbean LB);
	
	public String Cancelticket(String ticketnumber);
}

