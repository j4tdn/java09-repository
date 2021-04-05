package main;

import java.util.List;

import dao.ItemDao;
import dao.itemGroupDao;
import persistence.Item;
import persistence.ItemGroup;

public class App {
	private static itemGroupDao itemGroupDao ;
	private static ItemDao itemDao ;
	static{
		itemGroupDao = new itemGroupDao();
		itemDao = new ItemDao();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> itemGrAll =  itemGroupDao.getAll();
		show(itemGrAll);
		System.out.println("============");
		List<Item> items = itemDao.getItems(1, 100, 500);
		show(items);
		System.out.println("============");
		List<Item> itemsByIgrName = itemDao.getItems("Quần");
		show(itemsByIgrName);
	}
	
	private static <E> void show (List<E> es) {
		for(E e:es) {
			System.out.println(e);
		}
	}
}
