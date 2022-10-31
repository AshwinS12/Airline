package com.spring.web.mvc.AirlineProjectJava20.DAO;

import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;

public interface DAO {

	public String SignUp(Loginbean loginbean);
	
	public boolean logindetails(String username, String password);
	
	public String Searchticket(Loginbean LB);
	
	public String Cancelticket(String ticketnumber);

}
