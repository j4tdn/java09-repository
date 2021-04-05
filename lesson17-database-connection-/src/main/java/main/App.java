package main;

import java.util.List;

import dao.ItemDao;
import dao.ItemGroupDao;
import dto.ItemGroupDto;
import persistence.Item;
import persistence.ItemGroup;

public class App {
	
	private static ItemGroupDao itemGroupDao;
	private static ItemDao itemDao;
	static {
		itemGroupDao = new ItemGroupDao();
		itemDao = new ItemDao();
	}
	public static void main(String[] args) {
		List<ItemGroup> itemGrpAll = itemGroupDao.getAll();
		List<Item>  items = itemDao.getItem(2, 100, 500);
		show(items);
		
		System.out.println("=========================");
		List<Item> itemsByIgrName = itemDao.getItemByName("Quần");
		show(itemsByIgrName);
		
		System.out.println("=========================");
		List<ItemGroupDto> itemGroupDtos = itemGroupDao.getItemGroupDto();
		show(itemGroupDtos);
	}
	
	private static <E> void show (List<E> elements) {
		for (E e : elements) {
			System.out.println(e);
		}
	}
}
