package demo;

import java.util.List;

import dao.HibernateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemDao;
import dao.ItemGroupDao;
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
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
//		Item item = itemService.get(1);
//		System.out.println(item);
//		
		// open  session
		//get => no transaction =>no execute
		//  	yes transaction => execute query
		// transaction 
		ItemGroup ig = new ItemGroup(1, "ao");
		Item item = new Item(11, "ao", "den", "vai", 200d, 100d, ig);
		itemService.save(item);
		
//		List<ItemDto> itemDao = itemService.getItemDtos();
//		
//		itemDao.forEach(System.out::println);
		
		System.out.println("=============================");
//		List<ItemGroup> igrList = itemGroupService.getAll();
//		System.out.println("igl: size"+igrList.size());
//			System.out.println("=============================");
//		//System.out.println(igrList.get(0).getItems());
//		igrList.forEach(igr->{
//			System.out.println("igr: " + igr.getItems().size());
//		});
		System.out.println("=============================");
		
		//igrList.forEach(System.out::println);
		
		
//		List<Item> iList = itemService.getAll();
//		// System.out.println("size: " + igrList);
//		iList.forEach(System.out::println);
	}
}

