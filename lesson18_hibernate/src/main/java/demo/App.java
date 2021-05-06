package demo;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;

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
		itemGroupService=new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		Item item =itemService.get(1);
		System.out.println(item);
}
}
