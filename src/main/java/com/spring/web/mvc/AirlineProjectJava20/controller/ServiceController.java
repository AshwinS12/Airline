package com.spring.web.mvc.AirlineProjectJava20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;

@Controller
public class ServiceController {
@RequestMapping(value = "UserLoginRequest",method = RequestMethod.POST)
public ModelAndView readLogin(@ModelAttribute("UserObj")Loginbean lb) {
	int result = 0;
	ModelAndView mav = new ModelAndView();
	//result = daoclass . insertstatement(lb);
	mav.setViewName("home");
	mav.addObject("insertresponsevalue",result);
	
	//2
	return mav;
	
}
}
