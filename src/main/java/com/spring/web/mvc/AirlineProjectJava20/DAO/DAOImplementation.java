package com.spring.web.mvc.AirlineProjectJava20.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;

public class DAOImplementation implements DAO {
	@Autowired
	SessionFactory sessionfactory;

	@Override
	
	public boolean logindetails(String name, String password) {
		boolean b1=false;
		Session session =sessionfactory.openSession();
		Query query=session.createQuery("from Loginbean where emp.name='"+name+"' and emp.password="+password);
		Loginbean pass1 = (Loginbean) query.uniqueResult();
		if(pass1 == null) {
			b1 = false;
		}else {
			b1 = true;
		}
		return b1;
	}

	

}
