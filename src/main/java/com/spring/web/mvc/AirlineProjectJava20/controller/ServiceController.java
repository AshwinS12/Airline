package com.spring.web.mvc.AirlineProjectJava20.controller;

import java.util.*;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.mvc.AirlineProjectJava20.DAO.DAO;
import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;
import com.spring.web.mvc.AirlineProjectJava20.bean.Ticketbookingbean;

@Controller
public class ServiceController {
	//@Autowired
	DAO dao;
@RequestMapping(value = "UserLoginRequest",method = RequestMethod.POST)
public ModelAndView readLogin(@ModelAttribute("UserObj")Loginbean lb) {
	
	//String result = null;
	ModelAndView mav = new ModelAndView();
	String name = lb.getName();
	String password = lb.getPassword();
	boolean flag = dao.logindetails(name,password);
	if(flag) {
		mav.setViewName("success");
		mav.addObject("insertresponsevalue",flag);
		
	}
	return mav;
}

@RequestMapping(value = "UserRegisterRequest",method = RequestMethod.GET)
public ModelAndView readRegister(@ModelAttribute("Userregister")Ticketbookingbean tb) {
	
	String result = "";
	ModelAndView mav = new ModelAndView();
	result = dao.SignUp(tb);
	List<Loginbean> al = new ArrayList<Loginbean>();
	if(result!="") {
		mav.setViewName("success");
		mav.addObject("insertregisteration",result);
	}
	return mav;
}
}
