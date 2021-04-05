package main;

import java.util.Collections;
import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;

public class Ex01 {
	private static ItemGroupDao itemGroupDao = new ItemGroupDao();
	public static void main(String[] args) {
		List<ItemGroup> itemGroups = itemGroupDao.getAll();
		Collections.sort(itemGroups, (o1, o2) -> o1.getId().compareTo(o2.getId()));
		show(itemGroups);
	}
	
	private static <E> void show(List<E> elements) {
		for(E e : elements) {
			System.out.println(e);
		}
	}
}
