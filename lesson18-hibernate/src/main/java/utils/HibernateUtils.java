package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sessionFactory = null;
	
	public HibernateUtils() {
	}
	
	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}
	public static void main(String[] args) {
		SessionFactory sf = getSessionFactory();
		System.out.println("sf: " + sf.openSession());
	}
}
