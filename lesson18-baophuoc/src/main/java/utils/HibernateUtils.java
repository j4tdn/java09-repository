package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sessionFactory=null;
	private HibernateUtils() {
		
	}
	
	public static SessionFactory getSessionFactoryXML() {
		if(sessionFactory==null) {
			Configuration cfg = new Configuration();
			sessionFactory=cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}

	
	
	public static void main(String[] args) {
		System.out.println(getSessionFactoryXML());
		
		
	}
}
