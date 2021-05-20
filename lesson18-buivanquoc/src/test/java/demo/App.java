package demo;
import java.util.List;

import persistence.ItemCau1;
import persistence.ItemCau4;
import service.ItemService;
import service.ItemServiceImpl;





public class App {
	
	private static ItemService itemService;
			static {
			
			itemService = new ItemServiceImpl();
			
			
	}
	public static void main(String[] args) {
		ItemCau1 itex1= new ItemCau1();
		
		List<ItemCau4> itemList = itemService.getAll();
		itemList.forEach(System.out::println);
	
	}
}
