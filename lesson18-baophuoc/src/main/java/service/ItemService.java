package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemWithDate;
import persistence.ItemWithSizeDto;

public interface ItemService {
	List<ItemWithDate> getItemWithDate(LocalDate NgayBan);
	List<ItemDto> getItemDtos();
	List<ItemDto> getNumberItem(int year);
	List<ItemWithSizeDto> getItemWithSize();
	
	
}
