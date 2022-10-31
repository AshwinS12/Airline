package com.spring.web.mvc.AirlineProjectJava20.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Cancelledtickets")

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
	@Column(name = "IdProof")
	private String IdProof;
	@Column(name = "Gender")
	private String Gender;
	@Column(name = "ContactNumber")
	private Long ContactNumber;
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
	public String getIdProof() {
		return IdProof;
	}
	public void setIdProof(String idProof) {
		IdProof = idProof;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Long getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
}
