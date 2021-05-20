package demo;

import java.util.List;

import dto.ItemWithDate;
import dto.RemainItem;
import persistance.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	private static ItemService itemService = new ItemServiceImpl();
	private static ItemGroupService itemGroupService = new ItemGroupServiceImpl();
	
	public static void main(String[] args) {
		List<ItemWithDate> result = itemService.getItemWithDate();
		result.forEach(System.out::println);
		
		
		System.out.println("==============");

		List<RemainItem> remainItems = itemService.getRemainItems();
		remainItems.forEach(System.out::println);

		System.out.println("==============");

		List<String> top3SaleItems = itemService.getSaleItems(2020);
		top3SaleItems.forEach(System.out::println);

		System.out.println("==============");

		List<ItemGroup> itemGroup = itemGroupService.getItemByItemGroup();
		itemGroup.forEach(ig -> {
			ig.getItems().forEach(System.out::println);
		});
	}
}
