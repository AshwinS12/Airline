package com.spring.web.mvc.AirlineProjectJava20.bean;

	import javax.persistence.Column;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "Tickets")

	public class Ticketbookingbean {
		
	@Id
	@GeneratedValue
	@Column (name = "TicketNumber")
	private int TicketNumber;
	
	@Column (name = "Name")
	private String Name;
	
	@Column (name = "Date")
	private String Date;
	
	@Column (name = "EmailId")
	private String Emailid;
	
	@Column (name = "ContactNumber")
	private Long Contactnumber;
	
	@Column (name = "DateOfBirth")
	private String Dateofbirth;
	
	@Column (name = "IdProof")
	private String Idproof;
	
	@Column (name = "Time")
	private String Time;
	
	@Column (name = "TicketStatus")
	private String TicketStatus;
	
	@Column (name = "Gender")
	private String Gender;
	
	@Column (name = "Location")
	private String Location;
	
	public int getTicketnumber() {
		return TicketNumber;
	}
	public void setTicketnumber(int ticketnumber) {
		TicketNumber = ticketnumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public Long getContactnumber() {
		return Contactnumber;
	}
	public void setContactnumber(Long contactnumber) {
		Contactnumber = contactnumber;
	}
	public String getDateofbirth() {
		return Dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		Dateofbirth = dateofbirth;
	}
	public String getIdproof() {
		return Idproof;
	}
	public void setIdproof(String idproof) {
		Idproof = idproof;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getTicketNumber() {
		return TicketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		TicketNumber = ticketNumber;
	}
	public String getTicketStatus() {
		return TicketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		TicketStatus = ticketStatus;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	

}

