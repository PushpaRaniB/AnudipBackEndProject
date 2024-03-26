package com.airlines.dao;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.airlines.entities.Flights;


public class FlightDaoImpl implements FlightDao {

	private final Session session;

	public FlightDaoImpl(Session session2) {
		this.session = (Session) session2;
	}

	public Flights getFlightById(int flightid) {
		return session.get(Flights.class, flightid);
	}
	public void addFlight(Flights fobj) {
		System.out.println(fobj);
		try {

			Transaction tx=session.beginTransaction();
			session.save(fobj);
			tx.commit();

			System.out.println(fobj);
			System.out.println("Record inserted into flight table");		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void updateFlight(Flights fobj) {
		Transaction transaction = session.beginTransaction();
		try {
			session.update(fobj);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	public List<Flights> getAllFlights() {

		Transaction tx=session.beginTransaction();
		Query qobj=session.createQuery("select aobj from Flights aobj" );
		@SuppressWarnings("unchecked")
		List<Flights> list=(List<Flights>)qobj.getResultList();
		tx.commit();
		return list;


	}

	@Override
	public void deleteFlight(int flightid) {

	}

	@Override
	public void getFlight() {

	}

}
