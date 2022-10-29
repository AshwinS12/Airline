package com.spring.web.mvc.AirlineProjectJava20.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hrm.springmvc.entity.bean.Loginbean;
import com.spring.web.mvc.AirlineProjectJava20.DAO.DAO;

public class ServiceImplementation implements Service{
	
	@Autowired
	DAO dao;
	
	public String SignUp(Loginbean loginbean) {
		
		return dao.SignUp(loginbean);
	}
	
	public boolean Logindetails(String name , String password) {
		
		return dao.logindetails(name, password);
	}

}
