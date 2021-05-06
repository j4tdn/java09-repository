package demo;


import java.util.List;

import persitence.Item;
import persitence.ItemDto;
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
		ItemGroup ig = new ItemGroup(1,"Áo");
			Item item = new Item(11, "Áo khoác", "Đen", "Vải", 200d, 100d, ig);
			itemService.save(item);
	}
}
