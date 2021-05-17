package demo;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemService;
import service.ItemServiceImpl;

public class App {

	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		ItemGroup igB = new ItemGroup(19, "Tất");
		Item itB2 = new Item(16, "itB2", "Đỏ", "Da", 480d, 2200d, igB);
		itemService.save(itB2);
	}
}
