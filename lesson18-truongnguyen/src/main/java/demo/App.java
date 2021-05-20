package demo;


import java.util.List;

import persistence.Item;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	
	
	private static ItemService itemService;

	static {
		
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		
		//c1
		List<Item> item= itemService.getItemDtos();
		
		item.forEach(System.out::println);
		//c2
		List<Item> item2= itemService.getItemDtos2();
		item2.forEach(System.out::println);
	}
}
