package com.spring.web.mvc.AirlineProjectJava20.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Requestbean")
public class Requestbean {
	@Id@Column(name="SNo")
	private int SNo;
	@Column(name="welcome")
	private String welcome;
	@Column(name="TicketNumber")
	private int TicketNumber;
	@Column(name="ThankYou")
	private String ThankYou;
	@Column(name="MoreInfo")
	private String MoreInfo;
	@Column(name="ContactNumber")
	private long ContactNumber;
	@Column(name="Time")
	private String Time;
	public int getSNo() {
		return SNo;
	}
	public void setSNo(int sNo) {
		SNo = sNo;
	}
	public String getWelcome() {
		return welcome;
	}
	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}
	public int getTicketNumber() {
		return TicketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		TicketNumber = ticketNumber;
	}
	public String getThankYou() {
		return ThankYou;
	}
	public void setThankYou(String thankYou) {
		ThankYou = thankYou;
	}
	public String getMoreInfo() {
		return MoreInfo;
	}
	public void setMoreInfo(String moreInfo) {
		MoreInfo = moreInfo;
	}
	public long getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(long contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	
}
