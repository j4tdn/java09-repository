package service;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;

public interface ItemService {
	List<ItemDto> getItemDtos();
	List<ItemDto> getNumberItem();
	
}
