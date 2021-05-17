package service;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroup;

public interface ItemService {

	List<Item> getAll();

	Item get(int id);

	List<ItemDto> getItemDtos();

	void save(Item item);

	//demo first level cache
	Item getFirstLevelCache(int id);
	Item getFirstLevelCacheInTwoSession(int id);
	
	//demo second level cache
	Item getSecondLevelCache(int id);
}
