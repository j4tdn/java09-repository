package main;

import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;

public class App {
	private static ItemGroupDao itemGroupDao; 
	static {
		itemGroupDao = new ItemGroupDao();
	}
	public static void main(String[] args) {
		List<ItemGroup> itemGroup =	itemGroupDao.getAll();
		show(itemGroup);
	}
	private static <E> void show(List<E> es) {
		for (E e:es) {
			System.out.println(e);
		}
		
	}
}
