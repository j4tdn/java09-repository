package main;

import java.util.List;

import dao.itemGroupDao;
import persistence.ItemGroup;

public class App {
	private static itemGroupDao itemGroupDao ;
	static{
		itemGroupDao = new itemGroupDao();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> itemGrAll =  itemGroupDao.getAll();
		show(itemGrAll);
	}
	
	private static <E> void show (List<E> es) {
		for(E e:es) {
			System.out.println(e);
		}
	}
}
