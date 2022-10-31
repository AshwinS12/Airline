package com.spring.web.mvc.AirlineProjectJava20.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value="loginpageopening")
	public String openLoginPage() {
	String views="Login";
	return views;
	}
	@RequestMapping(value="bookingpageopening")
	public String openBookingPage() {
	String views="Booking";
	return views;
	}
	@RequestMapping(value="registerpageopening")
	public String openRegisterPage() {
	String views="Register";
	return views;
	}
	
	@RequestMapping(value="aboutuspageopening")
	public String openAboutPage() {
	String views="AboutUs";
	return views;
	}
	@RequestMapping(value="offerspageopening")
	public String openOffersPage() {
	String views="Offers";
	return views;
	}
	@RequestMapping(value="membershippageopening")
	public String openMembershipPage() {
	String views="Membership";
	return views;
	}
	@RequestMapping(value="adminloginpageopening")
	public String openAdminLoginPage() {
	String views="AdminLogin";
	return views;
	}

}
