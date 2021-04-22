package utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory = null;

	private HibernateUtils() {
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration conf = new Configuration();
			sessionFactory = conf.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		
		return sessionFactory;
	}
	
	public static void main(String[] args) {
//		SessionFactory sf = getSessionFactory();
//		System.out.println("sf: " + sf.openSession());
		System.out.println(getSessionFactoryJava());
	}
	
	// java - configuration
	public static SessionFactory getSessionFactoryJava() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			
			Properties props = new Properties();
			props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			props.put(Environment.URL, "jdbc:mysql://localhost:3306/java09_shopping?useSSL=false");
			props.put(Environment.USER, "root");
			props.put(Environment.PASS, "lttsm42000");
			props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			props.put(Environment.SHOW_SQL, "true");
//			props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			// props.put(Environment.HBM2DDL_AUTO, "create-drop");
			
			cfg.setProperties(props);
//			cfg.addAnnotatedClass(Student.class);
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}
