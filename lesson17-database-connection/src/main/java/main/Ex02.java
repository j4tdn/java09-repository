package main;

import java.util.List;

import dao.ItemDao;
import persistence.Item;

public class Ex02 {
	private static ItemDao itemDao = new ItemDao();
	public static void main(String[] args) {
		System.out.println("====");
//		List<Item> items = itemDao.getItems(2, 100, 500);
		List<Item> items = itemDao.getItemsByName("Áo");
		show(items);
	}
	
	private static <E> void show(List<E> elements) {
		for(E e : elements) {
			System.out.println(e);
		}
	}
}
