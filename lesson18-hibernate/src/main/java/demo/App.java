package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroup;
import service.ItemService;
import service.ItemServiceImpl;


public class App {
	
	private static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		ItemGroup ig = new ItemGroup(1,"Áo");
		Item item = new Item(11,"Áo khoác", "Đen", "Vải", 200d , 100d, ig );
		itemService.save(item);
	}
}
