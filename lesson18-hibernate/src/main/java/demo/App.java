package demo;


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
//		ItemGroup igA = new ItemGroup(16, "Túi xách");
//		itemGroupService.save(igA);
		
		ItemGroup itB = new ItemGroup(17,"Tất");
		Item itA1 = new Item(13, "itA1", "Đỏ", "Da",250d,150d, itB);
		itemService.save(itA1);
		
		// insert item => cascade all with ItemSize
		// session.get(ItemSize id)
		// mapping 1-n , n-1 : Item ItemSize Size
	}
}