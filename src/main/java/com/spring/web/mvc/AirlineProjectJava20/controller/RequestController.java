package com.spring.web.mvc.AirlineProjectJava20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {
	@RequestMapping(value = "requestcustomer")
	public String OpenRequestpage() {
		String views = "NewFile";
		return views;
	}

}
