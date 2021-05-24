package service;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemWithSizeDto;

public interface ItemService {
	List<ItemDto> getItemDtos();
	List<ItemDto> getNumberItem();
	List<ItemWithSizeDto> getItemWithSize();
	
}
