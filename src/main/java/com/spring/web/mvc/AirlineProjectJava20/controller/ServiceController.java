package com.spring.web.mvc.AirlineProjectJava20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.mvc.AirlineProjectJava20.DAO.DAO;
import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;

@Controller
public class ServiceController {
	 // @Autowired
	DAO dao;
@RequestMapping(value = "UserLoginRequest",method = RequestMethod.POST)
public ModelAndView readLogin(@ModelAttribute("UserObj")Loginbean lb) {
	
	String result = null;
	ModelAndView mav = new ModelAndView();
	String name = lb.getName();
	String password = lb.getPassword();
	boolean flag = dao.logindetails(name,password);
	if(flag) {
		mav.setViewName("home");
		mav.addObject("insertresponsevalue",result);
	}
	return mav;
}
}
