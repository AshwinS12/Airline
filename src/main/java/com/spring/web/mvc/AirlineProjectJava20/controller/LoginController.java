package com.spring.web.mvc.AirlineProjectJava20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
@RequestMapping(value = "registeringcustomer")
public String OpenRegisterationPage() {
	String views = "Register";
	return views;
}

@RequestMapping(value = "Logincustomer")
public String OpenLoginPage() {
	String views = "Login";
	return views;
}//1
}
