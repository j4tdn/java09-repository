package service;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;

public interface ItemService {
	List<Item> getAll();
	Item get(int id);
	List<ItemDto> getItemDtos();
	void save(Item item);
	
	Item getFirstLevelCache(int id);	
	Item getFirstLevelCacheIn2Session(int id);
	
	Item getSecondLevelCache(int id);
}
