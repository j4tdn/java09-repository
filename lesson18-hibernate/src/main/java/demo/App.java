package demo;

import java.util.List;

import persistence.ItemDto;
import persistence.ItemGroup;
import persistence.Items;
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
		
		ItemGroup ig=new ItemGroup(1,"Aó");
		Items item=new Items(11, "Aó khoác kaki", "Đen", "Vải", 100d, 200d, ig);
		itemService.save(item);
	}
}
