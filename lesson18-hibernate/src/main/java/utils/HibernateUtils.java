package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sessionfactory = null;

	private HibernateUtils() {

	}

	public static SessionFactory getSessionFactory() {
		if (sessionfactory == null) {
			Configuration configuration = new Configuration();
			sessionfactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionfactory;
	}

	public static void main(String[] args) {
		SessionFactory sf = getSessionFactory();
		System.out.println("sf: " + sf.openSession());
	}
}
