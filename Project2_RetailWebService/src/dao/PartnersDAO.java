package dao;



import model.partner.Partners;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class PartnersDAO {
	public void addPartner(Partners partner) {
		 try
		    {
		Configuration configuration = new Configuration().configure();
	    configuration.configure("hibernate.cfg.xml");
	    configuration.addAnnotatedClass(Partners.class);
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    System.out.println("Hibernate Configuration loaded");
	    
	    
		// opens a new session from the session factory
   Session session = sessionFactory.openSession();
   org.hibernate.Transaction t =  session.beginTransaction();
	 
	        session.save(partner);                              
	        session.save(partner);
	 
	      session.flush(); // stmt.executeBatch()
	      t.commit(); // con.commit();
	      System.out.println("Records inserted");
	    

	}catch (Throwable ex) {
// Make sure you log the exception, as it might be swallowed
System.err.println("Initial SessionFactory creation failed." + ex);
throw new ExceptionInInitializerError(ex);
}
	}
	
}
