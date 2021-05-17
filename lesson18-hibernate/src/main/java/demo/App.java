package demo;


import java.util.Arrays;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;
import persistence.ItemDetail;
import persistence.ItemGroup;
import persistence.ItemSize;
import persistence.ItemSize.Id;
import persistence.Size;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
import service.ItemSizeService;
import service.ItemSizeServiceImpl;


public class App {
	
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	private static ItemSizeService itemSizeService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
		itemSizeService = new ItemSizeServiceImpl();
	}
	public static void main(String[] args) {
//		ItemGroup igA = new ItemGroup(16, "Túi xách");
//		itemGroupService.save(igA);
		
//		ItemGroup itB = new ItemGroup(17,"Tất");
//		List<E>
//		Item itA1 = new Item(14, "itA1", "Đỏ", "Da",250d,150d, itB);
//		itemService.save(itA1);
		
//		ItemSize itemSize = itemSizeService.get(new Id(1, 1));
//		System.out.println(itemSize);
		
		ItemGroup itC = new ItemGroup(1,"Áo");
//		Item item = new Item(1, "Áo sơ mi nam","Trắng", "UD", 90d, 160d, itC);
//		Size size = new Size(4, "a"); 
//		ItemSize itemSize = new ItemSize(new Id(item.getItemId(),size.getId()),2,item, size);
//		itemSizeService.save(itemSize);
		
		
		Item item = new Item(17, "Áo chống nắng","Xanh đen", "UD", 90d, 160d, itC);
		
		List<ItemSize> itemSizes = Arrays.asList(
				new ItemSize(new Id(16,1),2,item, new Size(1, "L")),
				new ItemSize(new Id(16,3),4,item, new Size(6,"XXL"))
		);
		
		item.setItemSizes(itemSizes);
		
//		ItemDetail itemDetail = new ItemDetail(11, "NSX11", "TT11");
//		itemDetail.setItem(new Item(15, "Áo chống nắng","Xanh", "UD", 90d, 160d, itC));
//		item.setItemDetail(itemDetail);
		itemService.save(item);
		
		
		
		
//		itemService.getFirstLevelCacheInTwoSessions(1);
		
		// insert item => cascade all with ItemSize
		// session.get(ItemSize id)
		// mapping 1-n , n-1 : Item ItemSize Size
	}
}