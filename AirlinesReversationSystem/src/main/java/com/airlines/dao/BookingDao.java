package com.airlines.dao;

import java.sql.Time;
import java.util.List;

import com.airlines.entities.Bookings;

public interface BookingDao {
	Bookings getBookingById(int bookingId);
    void addBooking(Bookings bobj);
    void updateBooking(Bookings bobj);
	List<Bookings> getAllBookings();
	void bookFlight(int bookingid,int numofTickets, int totalprice, String bookingDate, Time bookingtime,String status);
    void bookFlight(Bookings bobj, Object adminlogin) ;

	void deleteBooking(int bookingId);
	void bookFlight(Bookings bobj);
	

	    
}
