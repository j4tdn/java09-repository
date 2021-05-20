package demo;

import java.util.Arrays;
import java.util.List;

import persistence.ItemDto;
import persistence.ItemGroup;
import persistence.Items;
import persistence.Size;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService=new ItemServiceImpl();
	}

	public static void main(String[] args) {
//		List<ItemGroup> itemGroupsList = itemGroupService.getAll();
//		System.out.println("size:"+itemGroupsList.size());
//		
//		itemGroupsList.forEach(System.out::println);
		
//		List<Items> itemList = itemService.getAll();
//		System.out.println("size:"+itemList.size());
//		
//		itemList.forEach(System.out::println);
		
//		System.out.println("_____________________");
//		Items items =itemService.get(5);
//		System.out.println(items);
		
//		List<ItemDto> listItemDto = itemService.getItemDtos();
//		listItemDto.forEach(System.out::println);
		
//		Items item=itemService.get(1);
//		System.out.println(item);
		
		ItemGroup ig=new ItemGroup(20,"Tất");
		Items item=new Items(15, "	Tất kaki", "Đen", "Vải", 100d, 200d, ig);
		item.setSizes(Arrays.asList(new Size(6,"size A"),
									new Size(7,"size B")));
		itemService.save(item);
		
//		ItemGroup igA=new ItemGroup(18,"túi xách");
//		itemGroupService.save(igA);
	}
}
