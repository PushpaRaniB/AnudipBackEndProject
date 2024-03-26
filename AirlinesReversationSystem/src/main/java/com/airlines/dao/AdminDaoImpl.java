package com.airlines.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.airlines.entities.Admin;

public class AdminDaoImpl implements AdminDao {


	private final Session session;

    public AdminDaoImpl(Session session) {
        this.session = session;
    }

    @Override
    public Admin getAdminById(int adminId) {
        return session.get(Admin.class, adminId);
    }

    @Override
    public void addAdmin(Admin aobj) {
		  try {
			  
			  Transaction tx=session.beginTransaction();
			  session.save(aobj);
		      tx.commit();
		      
		      System.out.println(aobj);
		      System.out.println("Record inserted into admin table");		
		  }catch(Exception e) {
			  e.printStackTrace();
			  }}
    
    @Override
    public void updateAdmin(Admin aobj) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(aobj);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

	@Override
	public List<Admin> select() {
		Transaction tx=session.beginTransaction();
		Query qobj=session.createQuery("select aobj from Admin aobj" );
		 @SuppressWarnings("unchecked")
		 List<Admin> list=(List<Admin>)qobj.getResultList();
		 tx.commit();
		 return list;
	}

   
}

