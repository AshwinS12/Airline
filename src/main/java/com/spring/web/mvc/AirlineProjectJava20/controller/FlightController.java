package com.spring.web.mvc.AirlineProjectJava20.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FlightController {

	@RequestMapping(value="flightinformation")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("NewFile1.jsp");
	}
}
