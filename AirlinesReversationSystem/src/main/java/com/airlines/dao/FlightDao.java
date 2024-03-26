package com.airlines.dao;

import java.util.List;

import com.airlines.entities.Flights;

public interface FlightDao {
	Flights getFlightById(int flightid);
	void addFlight(Flights flight);
	void updateFlight(Flights flight);
	List<Flights> getAllFlights();
	void deleteFlight(int flightid);
	void getFlight() ;
}
