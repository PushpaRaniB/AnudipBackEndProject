package com.airlines.dao;

import java.util.List;

import com.airlines.entities.Admin;

public interface AdminDao {
	Admin getAdminById(int adminid);
	void addAdmin(Admin aobj);
	void updateAdmin(Admin aobj);
	List<Admin> select();

}
