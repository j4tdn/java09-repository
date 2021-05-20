package utils;

import java.awt.HeadlessException;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HirbernateUtils {
	private static SessionFactory sessionFactory = null;

	public HirbernateUtils() {
	}

	public static SessionFactory getSessionFactorXml() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}

	public static void main(String[] args) throws HeadlessException {
		System.out.println(getSessionFactorXml());

	}
}
