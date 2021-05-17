package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImp;
import service.ItemService;
import service.ItemServiceImp;

public class App {
	
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	
	static {
		itemGroupService = new ItemGroupServiceImp();
		itemService = new ItemServiceImp();
	}
	
	public static void main(String[] args) {
		//SESSION: openSession
		//GET => No Transaction
		//SAVE + No Transaction => No execution
		//     + YES Transaction => Execute query (error or non)
		//Transaction: contains Sessions: rollback, commit
//		ItemGroup ig = new ItemGroup(1, "Áo");
//		Item item = new Item(12, "Áo khoác", "Đen", "Vải", 200d, 100d, ig);
//		itemService.save(item);
//		
//		ItemGroup itB = new ItemGroup(17, "Tất");
//		Item itA1 = new Item(13, "itA1", "Đỏ", "Da",250d,150d, itB);
//		itemService.save(itA1);
		// insert item => cascade all with ItemSize
		// session.get(ItemSize id)
		// mapping 1-n , n-1 : Item ItemSize Size
		
		itemService.getSecondLevelCache(1);
	}
	
}
