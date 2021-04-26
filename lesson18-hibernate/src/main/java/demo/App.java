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
		itemGroupService=new ItemGroupServiceImpl();
		itemService=new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
//		List<ItemGroup> igrList=itemGroupService.getAll();
//		System.out.println("size=  "+igrList.size());
//		
//		igrList.forEach(igr->{
//			System.out.println("igl size="+igr.getItem().size());
//		});
//		
//		igrList.forEach(System.out::println);
//
//		System.out.println("=====");
//		List<Item> itemList=itemService.getAll();
//		System.out.println("size=  "+itemList.size());
//		itemList.forEach(System.out::println);
		
		System.out.println("=====");
		Item item =itemService.get(2);
		System.out.println(item);
	}
}
