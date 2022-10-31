package com.spring.web.mvc.AirlineProjectJava20.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "airline")
public class Flightbean {
	 @Column(name="from")
		private String from;
	@Column(name="to")
		private String to;
	@Column(name="date")
		private String date;
	@Column(name="ticketnum")
	private int ticketnum;
	@Column(name="time")
	private String time;
		public String getFrom() {
			return from;
		}
		public String setFrom(String from) {
			return from;
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
