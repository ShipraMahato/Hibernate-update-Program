package com.edu;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class MainClass {

		public static void main(String[] args) {
			Employee eob=new Employee();
			eob.setEid(2);
			eob.setEname("Nishant");
			eob.setAddress("Dhanbad");
			
	        Configuration conn=new Configuration().configure().addAnnotatedClass(Employee.class);	
	        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
	        SessionFactory sf=conn.buildSessionFactory(reg);
	        Session sess=sf.openSession();
	       Transaction tx=sess.beginTransaction();
	        
	        sess.save(eob);
	        tx.commit();


	}

}
