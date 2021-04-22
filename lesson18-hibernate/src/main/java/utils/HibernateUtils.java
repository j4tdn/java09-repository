package utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import persistence.Item;
import persistence.ItemGroup;

public class HibernateUtils {
	private static SessionFactory sessionfactory = null;

	private HibernateUtils() {

	}

	public static SessionFactory getSessionFactoryXml() {
		if (sessionfactory == null) {
			Configuration configuration = new Configuration();
			sessionfactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionfactory;
	}

	public static SessionFactory getSessionFactoryJava() {
		if (sessionfactory == null) {
			Configuration cfg = new Configuration();

			Properties props = new Properties();
			props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			props.put(Environment.URL, "jdbc:mysql://localhost:3306/java09_shopping?useSSL=false");
			props.put(Environment.USER, "root");
			props.put(Environment.PASS, "1234");
			props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			props.put(Environment.SHOW_SQL, "true");
			cfg.addAnnotatedClass(ItemGroup.class);
			cfg.addAnnotatedClass(Item.class);
			// props.put(Environment.HBM2DDL_AUTO, "create-drop");

			cfg.setProperties(props);

			sessionfactory = cfg.buildSessionFactory();
		}
		return sessionfactory;
	}

	public static void main(String[] args) {
		SessionFactory sf = getSessionFactoryJava();
		System.out.println("sf: " + sf.openSession());
		// System.out.println(getSessionFactory());
		//System.out.println(getSessionFactoryJava());
		
		
	}
}
