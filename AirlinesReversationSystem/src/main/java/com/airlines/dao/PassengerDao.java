package com.airlines.dao;

import com.airlines.entities.Passenger;

public interface PassengerDao {
	Passenger getPassengerById(int passengerId);
	void addPassenger(Passenger pobj);
	void deletePassenger(int passengerId);
	void updatePassenger(Passenger pobj);
}
