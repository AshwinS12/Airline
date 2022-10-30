package com.spring.web.mvc.AirlineProjectJava20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketbookingController 
{
@RequestMapping(value = "Ticket")
public String OpenTicketbookingPage()
{
	String views = "NewFile";
	return views;
	
	}
}
