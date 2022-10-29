package com.spring.web.mvc.AirlineProjectJava20.DAO;

import com.hrm.springmvc.entity.bean.Loginbean;

public interface DAO {
	public String SignUp(Loginbean loginbean);
	
	public boolean logindetails(String username, String password);
		
	
}
