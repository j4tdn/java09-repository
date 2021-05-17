package demo;

import java.util.List;

import dao.ItemDao;
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
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
//		List<ItemGroup> igrList = itemGroupService.getAll();
//		System.out.println("igrsSize: " + igrList.size());
//		
//		
//		
//		igrList.forEach(igr -> {
//			System.out.println("igr size: " + igr.getItems().size());
//		});

//		System.out.println("===========================");
//
//		List<Item> itList = itemService.getAll();
//		itList.forEach(System.out::println);
//		
//		ItemGroup ig = itList.get(1).getItemGroup();
//		
//		System.out.println("====================================");
//		
//		Item  item = itemService.get(5);
//		System.out.println("item id = 5: " + item);
		

//		List<ItemDto> result = itemService.getItemsDtos();
//		result.forEach(System.out::println);
		
//		Item item = itemService.get(1);
//		System.out.println(item);
		
		
		//Session: openSession
		//GET => No Transaction
		//SAVE + No Transaction => No execution
		//		+ Yes Transaction => execute query (error or non)
		//Transaction: contains Sessions: rollback, 
//		Item item1 = new Item(101, "Áo", "Trắng", "Vải", 200d, 150d, igrList.get(1));
//		itemService.save(item1);
//		
//		ItemGroup itB = new ItemGroup(17, "Tất");
//		Item itA1 = new Item(13, "itA1", "Đỏ", "Da",250d,150d, itB);
//		itemService.save(itA1);
		// insert item => cascade all with ItemSize
		// session.get(ItemSize id)
		// mapping 1-n , n-1 : Item ItemSize Size 
//		itemService.getFirstLevelCache(1);
//		itemService.getFirstLevelCacheInTwoSession(1);
		
		itemService.getSecondLevelCache(1);
	}
}
