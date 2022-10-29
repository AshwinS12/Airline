package com.spring.web.mvc.AirlineProjectJava20.DAO;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;


public class DAOImplementation implements DAO {
	@Autowired
	SessionFactory sessionfactory;
//LoginPage
	@Override
	public boolean logindetails(String name, String password) {
		Session session =sessionfactory.openSession();
		Query query=session.createQuery("from airline emp where Loginbean.name='"+name+"' and Loginbean.password="+password);
		boolean login=false;
		Loginbean beanl = (Loginbean) query.uniqueResult();
		if(beanl == null) {
			login = false;
		}else {
			login = true;
		}

		return login;
		
	}
//Registration
	public String SignUp(Loginbean LB) {
		String result="";
		Session session=sessionfactory.openSession();
		
		Object obj=session.save(LB);
		Transaction trans=session.beginTransaction();
		trans.commit();
		if(obj!=null) {
			result=(String) obj;
		}
		return result;
	}
//Search Ticket
	public String Searchticket(Loginbean LB) {
		
		String result="";
		Session session=sessionfactory.openSession();
		Object obj=session.createQuery("from airline TicketBooking where TicketBooking.TicketNumber='"+LB+"'");
		if(obj!=null) {
			result=(String) obj;
		}
		return result;
	}
//Cancel Ticket
	public String Cancelticket(String ticketnumber) {
		String result="";
		Session session=sessionfactory.openSession();
		Object obj = session.createQuery("Upadte airline TicketBooking set TicketBooking.Status=Cancel where TicketBoking.TicketNumber='"+ticketnumber+"'");
		if(obj!=null) {
			result=(String) obj;
		}
		return result;
	}
}


