package demo;

import java.util.Arrays;
import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import persistence.Size;
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
//		List<ItemGroup> igrList = itemGroupService.getAll();
//		igrList.forEach(System.out::println);
		
//		ItemGroup igA = new ItemGroup(7, "Dep");
//		Item itB1 = new Item(18, "hihi", "yellow", "silk", 20d, 19d, "none", igA);
//		itemService.save(itB1);
		
		itemService.getSecondLevelCache(1);
	}
}
