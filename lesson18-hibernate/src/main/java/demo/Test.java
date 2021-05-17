package demo;

import dao.EntityDao;
import dao.HibernateItemDao;
import dao.ItemDao;

public class Test  {
	private static HibernateItemDao itemDao;
	
	static {
		itemDao = new HibernateItemDao();
		
	}
	
	public static void main(String[] args) {
		//System.out.println("s1: "+itemDao.getCurentSession());	
		System.out.println("s1: "+itemDao.openSession());
		System.out.println("s2: "+itemDao.getCurentSession());
		
		//System.out.println("s1: "+itemDao.openSession());	
		
	}
	
}
