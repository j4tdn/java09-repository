package demo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.engine.jdbc.Size;

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
//
//		ItemGroup igA = new ItemGroup(18,"tui xach");
//		itemGroupService.save(igA);
		
		ItemGroup igB=new ItemGroup(19, "tat");
		Item ita1=new Item(16, "itb2", "do", "da", 480d, 250d, igB);

		//		 ita1.setSizes(Arrays.asList(
//				 new persistence.Size(6,"size a"),
//				 new persistence.Size(7, "size b")));
//		 itemService.save(ita1); 
			
		
		
		//		Item item = itemService.get(1);
//		System.out.println(item);
		System.out.println("=======================");
		// open session
		// get => no transaction =>no execute
		// yes transaction => execute query
		// transaction

//		ItemGroup ig = new ItemGroup(1, "ao");
//		Item item = new Item(11, "ao", "den", "vai", 200d, 100d, ig);
//		itemService.save(item);
		System.out.println("=======================");
//		List<ItemDto> itemDao = itemService.getItemDtos();
//		
//		itemDao.forEach(System.out::println);

//		System.out.println("=============================");
//
		
		
//		System.out.println("igl: size"+igrList.size());
//		System.out.println("=============================");
//		System.out.println(igrList.get(0).getItems());
//		List<ItemGroup> igrList = itemGroupService.getAll();
//		igrList.forEach(igr -> {
//			System.out.println("igr: " + igr.getItems().size());
//		});
//		System.out.println("=============================");

		// igrList.forEach(System.out::println);

//		List<Item> iList = itemService.getAll();
//		// System.out.println("size: " + igrList);
//		iList.forEach(System.out::println);
	}
}
