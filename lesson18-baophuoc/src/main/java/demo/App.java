package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroup;
import persistence.ItemWithSizeDto;
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
//		//CAU 2
//		List<ItemDto> ig= itemService.getItemDtos();
//		ig.forEach(System.out::println);
//		
//		//Cau 3
//		List<ItemDto> kq= itemService.getNumberItem();
//		kq.forEach(kq1 -> {
//			System.out.println( kq1.getIgrName());
//	});
		//Cau 4
		List<ItemWithSizeDto> rs = itemService.getItemWithSize();
		System.out.println("size: " + rs.size());
		rs.forEach(System.out::println);
	}
}
