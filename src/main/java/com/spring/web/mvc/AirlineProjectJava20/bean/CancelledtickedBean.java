package com.spring.web.mvc.AirlineProjectJava20.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="EmployeeTable")

public class CancelledtickedBean {
	
	@Id @GeneratedValue
	@Column(name = "TicketNumber")
	private int TicketNumber;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Location")
	private String Location;
	@Column(name = "Reason")
	private String Reason;
	@Column(name = "IdProop")
	private String IdProop;
	@Column(name = "Gender")
	private String Gender;
	@Column(name = "ContactNuber")
	private Long ContactNuber;
	@Column(name = "Time")
	private String Time;
	public int getTicketNumber() {
		return TicketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		TicketNumber = ticketNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public String getIdProop() {
		return IdProop;
	}
	public void setIdProop(String idProop) {
		IdProop = idProop;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Long getContactNuber() {
		return ContactNuber;
	}
	public void setContactNuber(Long contactNuber) {
		ContactNuber = contactNuber;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
}
