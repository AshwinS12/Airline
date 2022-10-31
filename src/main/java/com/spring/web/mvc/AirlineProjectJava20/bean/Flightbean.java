package com.spring.web.mvc.AirlineProjectJava20.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "Flightbean")
public class Flightbean {
	 @Column(name="fromstation")
		private String fromstation;
	@Column(name="tostation")
		private String tostation;
	@Column(name="date")
		private String date;
	@Column(name="ticketnum")
	private int ticketnum;
	@Column(name="time")
	private String time;
		
		public String getFromstation() {
		return fromstation;
	}
	public void setFromstation(String fromstation) {
		this.fromstation = fromstation;
	}
	public String getTostation() {
		return tostation;
	}
	public void setTostation(String tostation) {
		this.tostation = tostation;
	}
		public String getDate() {
			return date;
		}
		public String setDate(String date) {
			return date;
		}
		public int getTicketnum() {
			return ticketnum;
		}
		public void setTicketnum(int ticketnum) {
			this.ticketnum = ticketnum;
		}
		public String getTime() {
			return time;
		}
		public String setTime(String time) {
			return time;
		}
		
		
		
}
