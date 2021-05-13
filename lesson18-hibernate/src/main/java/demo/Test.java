package demo;

import dao.HibernateItemDao;
import dao.ItemDao;

public class Test {
	private static HibernateItemDao itemDao;
	
	static {
		itemDao = new HibernateItemDao();
	}
	
	public static void main(String[] args) {
		System.out.println(itemDao.getCurrentSession());
	}
}
