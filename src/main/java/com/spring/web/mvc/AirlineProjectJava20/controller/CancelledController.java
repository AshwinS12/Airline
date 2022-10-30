package com.spring.web.mvc.AirlineProjectJava20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CancelledController {
	@RequestMapping(value = "deletingcustomer")
	public String OpenDeletionPage() {
		String views = "NewFile";
	
		return views;
	}
	@RequestMapping(value ="Canceledticket")
	public String OpenCanceledPage() {
		String views = "NewFile";
		return views;
		
	}
}
