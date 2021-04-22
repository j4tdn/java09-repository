package demo;

import java.util.List;

import persistence.ItemGroup;
import persistence.Items;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService=new ItemServiceImpl();
	}

	public static void main(String[] args) {
		List<ItemGroup> itemGroupsList = itemGroupService.getAll();
		System.out.println("size:"+itemGroupsList.size());
		
		itemGroupsList.forEach(System.out::println);
		
		List<Items> itemList = itemService.getAll();
		System.out.println("size:"+itemList.size());
		
		itemList.forEach(System.out::println);

	}
}
