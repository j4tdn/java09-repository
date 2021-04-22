package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImp;
import service.ItemService;
import service.ItemServiceImp;

public class App {
	
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	
	static {
		itemGroupService = new ItemGroupServiceImp();
		itemService = new ItemServiceImp();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> igrList = itemGroupService.getAll();
		System.out.println("size: " + igrList.size());
		igrList.forEach(System.out::println);
		
		System.out.println("=================");
		
		List<Item> itemList = itemService.getAll();
		System.out.println("size: " + itemList.size());
		itemList.forEach(System.out::println);
	}
}
