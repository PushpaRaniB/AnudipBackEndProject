package com.airlines.dao;

import java.util.List;
import com.airlines.entities.Registeration;

public interface RegisterationDao {
	void update(Registeration robj);
	List<Registeration> select();
	  void addRegisteration(Registeration robj);
			
}
