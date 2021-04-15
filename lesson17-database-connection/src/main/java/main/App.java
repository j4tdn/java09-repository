package main;

import java.util.List;

import dao.ItemGroupDao;
import dto.ItemGroupDto;

public class App {
	private static ItemGroupDao itemGroupDao = new ItemGroupDao();
	public static void main(String[] args) {
//		System.out.println("===========================");
//		List<ItemGroup> itemGroups = itemGroupDao.getAll();
//		show(itemGroups);
//		System.out.println("===========================");
//		List<ItemGroup> itemGroupsById = itemGroupDao.getAllById();
//		show(itemGroupsById);
//		System.out.println("===========================");
//		List<ItemGroup> itemGroupsByName = itemGroupDao.getAllByName();
//		show(itemGroupsByName);
		System.out.println("===========================");
		List<ItemGroupDto> itemGroups = itemGroupDao.getItems();
		show(itemGroups);
	}
	
	private static <E> void show(List<E> elements) {
		for(E e : elements) {
			System.out.println(e);
		}
	}
}
