package demo;

import dao.HibernateItemDao;
import dao.ItemDao;

public class Test {
	private static HibernateItemDao itemDao = new HibernateItemDao();
	
	public static void main(String[] args) {
		System.out.println(itemDao.openSession());
		System.out.println(itemDao.getCurrentSession());
	}
}
