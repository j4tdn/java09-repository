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
//		List<ItemGroup> igrList = itemGroupService.getAll();
//		igrList.forEach(igr -> {
//			System.out.println("igr: " + igr.getItems().size());
//		});
//		
//		System.out.println("=============");
//		
//		List<Item> itemList = itemService.getAll();
//		itemList.forEach(System.out::println);
//		System.out.println("=============");
//		System.out.println(itemService.get(5));
//		System.out.println(itemService.getItemDtos());
		ItemGroup ig = new ItemGroup(1, "Áo");
		Item item = new Item(11, "Áo Khoác", "Xanh", "Vải", 200d, 100d, ig);
		itemService.save(item);
	}
}
