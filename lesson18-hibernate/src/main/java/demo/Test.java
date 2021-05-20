package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import utils.HibernateUtils;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
//		Session session1=sessionFactory.openSession();
//		Session session2=sessionFactory.openSession();
		Session session1=sessionFactory.getCurrentSession();
		Session session2=sessionFactory.getCurrentSession();
		System.out.println("s1:"+session1);
		System.out.println("s2:"+session2);
	}

}
