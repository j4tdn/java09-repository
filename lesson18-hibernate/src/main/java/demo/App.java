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
		Item item = new Item(1, "Áo", "Đen", "Vải", 200d, 100d, ig);
	}
}
