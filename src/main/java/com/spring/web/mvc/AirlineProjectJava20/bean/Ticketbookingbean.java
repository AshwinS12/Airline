package com.spring.web.mvc.AirlineProjectJava20.bean;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "Ticketbooking")

	public class Ticketbookingbean {
		
	@Id
	@GeneratedValue
	@Column (name = "TicketNumber")
	private int Ticketnumber;
	
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
	private boolean TicketStatus;
	
	@Column (name = "Gender")
	private boolean Gender;
	
	@Column (name = "Location")
	private String Location;
	
	public int getTicketnumber() {
		return Ticketnumber;
	}
	public void setTicketnumber(int ticketnumber) {
		Ticketnumber = ticketnumber;
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
	public boolean isTicketStatus() {
		return TicketStatus;
	}
	public void setTicketStatus(boolean ticketStatus) {
		TicketStatus = ticketStatus;
	}
	public boolean isGender() {
		return Gender;
	}
	public void setGender(boolean gender) {
		Gender = gender;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}

}

