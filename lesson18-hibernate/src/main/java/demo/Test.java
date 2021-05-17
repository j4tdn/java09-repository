package demo;

import dao.HibernateItemDao;

public class Test {
	private static HibernateItemDao itemDao;
	
	static {
		itemDao = new HibernateItemDao();
	}
	
	public static void main(String[] args) {
		System.out.println("s1: " + itemDao.openSession());
		System.out.println("s2: " + itemDao.openSession());
		System.out.println("s3: " + itemDao.getCurrentSession());
		System.out.println("s4: " + itemDao.getCurrentSession());
	}
}
