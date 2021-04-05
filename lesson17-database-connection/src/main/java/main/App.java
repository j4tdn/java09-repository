package main;

import java.util.List;

import dao.ItemDao;
import dao.ItemGroupDao;
import persitence.Item;


public class App {
	private static ItemGroupDao itemGroupDao;
	private static ItemDao itemDao;
	static {
		itemGroupDao= new ItemGroupDao();
		itemDao = new ItemDao();
	}
	public static void main(String[] args) {
//		 List<ItemGroup> itemGrAll = itemGroupDao.getAll();
//		 show(itemGrAll);
		System.out.println("============");
		List<Item> itemsByigrName= itemDao.getItems("Áo");
		show(itemsByigrName);
				
	}
	private static <E> void show(List<E> es) {
		for(E e: es) {
			System.out.println(e);
		}
	}
}
