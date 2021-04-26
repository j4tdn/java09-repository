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
//		List<ItemGroup> igrList = itemGroupService.getAll();
//		igrList.forEach(System.out::println);
//		
//		igrList.forEach(igr ->{System.out.println("igr" +igr.getItems().size());
//			});
		
		System.out.println("=======");
		Item item = itemService.get(5);
		System.out.println("item :" + item);
		
//		List<Item> itList = itemService.getAll();
//		itList.forEach(System.out::println);

}
}
