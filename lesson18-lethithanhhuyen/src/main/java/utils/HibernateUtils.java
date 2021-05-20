package utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import persistence.Item;

public class HibernateUtils {
	private static SessionFactory sessionFactory;

	private HibernateUtils() {

	}

	// xml - configuration
	public static SessionFactory getSessionFactoryXml() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}
	
	public static void main(String[] args) {
		// System.out.println(getSessionFactoryXml());
		System.out.println(getSessionFactoryXml());
	}
}