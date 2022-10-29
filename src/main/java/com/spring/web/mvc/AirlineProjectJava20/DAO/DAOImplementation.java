package com.spring.web.mvc.AirlineProjectJava20.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;

@SuppressWarnings("deprecation")
public class DAOImplementation implements DAO {
	@Autowired
	SessionFactory sessionfactory;

	@Override

	public String SignUp(Loginbean loginbean) {
		String result = "";
		Session session = sessionfactory.openSession();
		Object obj = session.save(loginbean);
		Transaction trans = session.beginTransaction();
		trans.commit();
		if (obj != null) {
			result = (String) obj;
		}
		return result;
	}

	public boolean logindetails(String name, String password) {
		boolean bean = false;
		Session session = sessionfactory.openSession();
		@SuppressWarnings("rawtypes")
		Query query = session.createQuery(
				"from airline Loginbean where Loginbean.name='" + name + "' and Loginbean.password=" + password);
		@SuppressWarnings("deprecation")
		Loginbean login = (Loginbean) query.uniqueResult();
		if (login == null) {
			bean = false;
		} else {
			bean = true;
		}
		return bean;
	}

}
