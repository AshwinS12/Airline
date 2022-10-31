package com.spring.web.mvc.AirlineProjectJava20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
@RequestMapping(value="homepageopening")
public String OpenHomepage() {
	String views = "home";
	return views;
	//1
}
}
