package com.airlines.dao;

import java.util.List;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.airlines.entities.Registeration;

public class RegisterationDaoImlp implements RegisterationDao {
	private Session session;
	
	public RegisterationDaoImlp(Session session) {
		super();
		this.session = session;
	}
	
	public List<Registeration> select()
	 {
		 Transaction tx=session.beginTransaction();
		 Query qobj=session.createQuery("select robj from Registeration robj" );
		 @SuppressWarnings("unchecked")
		 List<Registeration> list=(List<Registeration>)qobj.getResultList();
		 tx.commit();
		 return list;
	 }


	public void update(Registeration robj) {
		// TODO Auto-generated method stub
		
	}


	public void addRegisteration(Registeration robj) {
		System.out.println(robj);
		  try {
			  Transaction tx= null;
			   tx=session.beginTransaction();
			  session.save(robj);
		      tx.commit();
		      
		      System.out.println(robj);
		      System.out.println("Record inserted into Reg table");		
		  }catch(Exception e) {
			  e.printStackTrace();
			  }
		}
		
	}


