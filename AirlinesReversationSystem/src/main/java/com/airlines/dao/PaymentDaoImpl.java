package com.airlines.dao;


import java.util.List;

//import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
//import com.airlines.entities.Bookings;

import com.airlines.entities.Payments;

public class PaymentDaoImpl implements PaymentDao {
	private final Session session;

    public PaymentDaoImpl(Session session) {
        this.session = session;
    }

    @Override
    public Payments getPaymentById(int payid) {
        return session.get(Payments.class, payid);
    }

    public void addPayment(Payments pobj1) {
        
    System.out.println(pobj1);
	  try {
		  Transaction tx= null;
		   tx=session.beginTransaction();
		  session.save(pobj1);
	      tx.commit();
	      
	      System.out.println(pobj1);
	      System.out.println("Record inserted into payment table");		
	  }catch(Exception e) {
		  e.printStackTrace();
		  }
	}

    @Override
    public void updatePayment(Payments pobj1) {
        Transaction transaction = session.beginTransaction();
        try {
            session.update(pobj1);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void deletePayment(int payid) {
        Transaction transaction = session.beginTransaction();
        try {
            Payments pobj1 = session.get(Payments.class, payid);
            if (pobj1 != null) {
                session.delete(pobj1);
            }
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    public List<Payments> getAllPayments() {
    
        return session.createQuery("FROM Payment", Payments.class).list();
    }
}
