package com.spring.web.mvc.AirlineProjectJava20.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.web.mvc.AirlineProjectJava20.DAO.DAO;
import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;

public class ServiceImplementation implements Service {

	@Autowired
	DAO dao;

	public String SignUp(Loginbean loginbean) {

		return dao.SignUp(loginbean);
	}

	public boolean Logindetails(String name, String password) {

		return dao.logindetails(name, password);
	}

	public String Searchticket(Loginbean LB) {
		return dao.Searchticket(LB);
		
	}
	
	public String Cancelticket(String ticketnumber) {
		return dao.Cancelticket(ticketnumber);
		
	}
}
