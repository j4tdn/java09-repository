package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	
	static {
		itemGroupService=new ItemGroupServiceImpl();
		itemService=new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		ItemGroup iga=new ItemGroup(14, "túi xách");
//		itemGroupService.save(iga);
		
		
		ItemGroup itemGroup=new ItemGroup(20, "tất");
		Item item=new Item(16, "tất dài", "đen","vải",200d, 100d, "image", itemGroup);
		itemService.save(item);
	}
}
