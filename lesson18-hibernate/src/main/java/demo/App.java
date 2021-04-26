package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
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
		List<ItemGroup> igrList = itemGroupService.getAll();
		igrList.forEach(System.out::println);
		
		igrList.forEach(itemGroup -> {
			System.out.println(System.identityHashCode(itemGroup.getItems().size()));
		});
		
		System.out.println("=====================");
		
		Item item = itemService.get(2);
		System.out.println(item);
		
//		List<Item> itemList = itemService.getAll();
//		itemList.forEach(System.out::println);
	}
}
