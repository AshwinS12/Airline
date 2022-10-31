package com.spring.web.mvc.AirlineProjectJava20.Service;

import org.springframework.beans.factory.annotation.Autowired;


import com.spring.web.mvc.AirlineProjectJava20.DAO.DAO;
import com.spring.web.mvc.AirlineProjectJava20.bean.Ticketbookingbean;

public class ServiceImplementation implements Service {

	@Autowired
	DAO dao;

	public String SignUp(Ticketbookingbean tb) {

		return dao.SignUp(tb);
	}

	public boolean Logindetails(String name, String password) {

		return dao.logindetails(name, password);
	}

}
