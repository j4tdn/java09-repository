package demo;


import java.util.List;

import persitence.Item;
import persitence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
public class App {
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl(); 
	}
	public static void main(String[] args) {
	//	List<ItemGroup> igrList = itemGroupService.getAll();
	//	igrList.forEach(System.out::println);
		List<Item> igrList = itemService.getAll();
		igrList.forEach(System.out::println);
	}
}
