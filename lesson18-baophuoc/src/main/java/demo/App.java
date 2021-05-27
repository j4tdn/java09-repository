package demo;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroup;
import persistence.ItemWithDate;

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

////		-------------------CAU 1---------------------
//		LocalDate NgayBanPara = LocalDate.now();
//		NgayBanPara = NgayBanPara.withDayOfMonth(18);
//		NgayBanPara = NgayBanPara.withMonth(12);
//		NgayBanPara = NgayBanPara.withYear(2020);
//		List<ItemWithDate> it=itemService.getItemWithDate(NgayBanPara);
//		it.forEach(System.out::println);
//		
////		-------------------CAU 2---------------------
//		List<ItemDto> ig= itemService.getItemDtos();
//		ig.forEach(System.out::println);
//		
//		-------------------CAU 3---------------------
//		List<ItemDto> kq= itemService.getNumberItem(2020);
//		kq.forEach(kq1 -> {
//			System.out.println( kq1.getIgrName());
//	});
//		-------------------CAU 4---------------------
		List<ItemWithSizeDto> rs = itemService.getItemWithSize();
		System.out.println("size: " + rs.size());
		rs.forEach(System.out::println);
	}
}
