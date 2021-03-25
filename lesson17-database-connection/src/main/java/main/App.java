package main;

import java.util.List;

import dao.ItemGroupDao;
import persitence.ItemGroup;

public class App {
	private static ItemGroupDao itemGroupDao;
	
	static {
		itemGroupDao= new ItemGroupDao();
	}
	public static void main(String[] args) {
		List<ItemGroup> itemGrAll = itemGroupDao.getAll();
		show(itemGrAll);
				
				
	}
	private static <E> void show(List<E> es) {
		for(E e: es) {
			System.out.println(e);
		}
	}
}
