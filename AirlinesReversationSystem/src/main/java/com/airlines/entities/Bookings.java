package com.airlines.entities;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Bookings {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookingid;
	private int numofTickets;
	private String bookingDate;
	private String bookingFlightType;
	public String getBookingFlightType() {
		return bookingFlightType;
	}

	public void setBookingFlightType(String bookingFlightType) {
		this.bookingFlightType = bookingFlightType;
	}

	public Passenger getPobj() {
		return pobj;
	}

	public void setPobj(Passenger pobj) {
		this.pobj = pobj;
	}

	private String bookingtime;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passengerid")
	private Passenger pobj;

	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name="flightid") 
	private Flights fobj;

	public Flights getFobj() {
		return fobj;
	}

	public void setFobj(Flights fobj) {
		this.fobj = fobj;
	}

	public Bookings() {
		super();
		
	}

	public Bookings(int bookingid2, Date bookingDate2, String booking_flight_type, Time bookingTime2, int total_price,
			String booking_status, int num_of_tickets) {
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public int getNumofTickets() {
		return numofTickets;
	}

	public void setNumofTickets(int numofTickets) {
		this.numofTickets = numofTickets;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingtime() {
		return bookingtime;
	}

	public void setBookingtime(String bookingtime) {
		this.bookingtime = bookingtime;
	}


	@Override
	public String toString() {
		return "Bookings [bookingid=" + bookingid + ", numofTickets=" + numofTickets + ", bookingDate=" + bookingDate + ", bookingFlightType=" + bookingFlightType + ", bookingtime="
				+ bookingtime + ", pobj=" + pobj + ",  fobj=" + fobj + "]";
	}

	public void getFlight(Flights selectedflight) {
		
	}

	public Registeration getRegisteration() {
		return null;
	}

	public void setFlightid(int flightid) {
		
	}


}