package service;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroup;

public interface ItemService {

	List<Item> getAll();
	
	Item get (int id);
	List<ItemDto> getItemDtos();
	void save(Item item);
}
