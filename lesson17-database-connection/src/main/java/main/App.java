package main;

import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;

public class App {
	private static ItemGroupDao itemGroupDao = new ItemGroupDao();
	public static void main(String[] args) {
		System.out.println("1");
		List<ItemGroup> itemGroups = itemGroupDao.getAll();
		show(itemGroups);
	}
	
	private static <E> void show(List<E> elements) {
		for(E e : elements) {
			System.out.println(e);
		}
	}
}
