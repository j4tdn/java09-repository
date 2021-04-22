package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import services.ItemGroupService;
import services.ItemGroupServiceImpl;
import services.ItemService;
import services.ItemServiceImpl;

public class App {
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
	}
	
	
	public static void main(String[] args) {
		List<ItemGroup> igrList = itemGroupService.getAll();
		System.out.println("size" + igrList.size());
		igrList.forEach(System.out::println);
		System.out.println("===============================");
		List<Item> itemList = itemService.getAll();
		System.out.println("size" + itemList.size());
		itemList.forEach(System.out::println);
	}

}
