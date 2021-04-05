package main;

import java.util.List;

import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;

public class App {
	static ItemGroupDao itemGroupDao;
	static ItemDao itemDao;
	static {
		itemGroupDao = new ItemGroupDao();
		itemDao=new ItemDao();
	}

	public static void main(String[] args) {
	// List<ItemGroup> itemGroupAll=itemGroupDao.getAll();
	
//	List<Item> items=itemDao.getItems(1, 100, 300);
	List<Item> item=itemDao.getItem("Áo");
	show(item);
}

	private static <E> void show(List<E> es) {
		for(E e:es) {
			System.out.println(e);
		}
	}
}
