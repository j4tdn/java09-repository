package dao;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroup;

public interface ItemDao {

	List<Item> getAll();
	
	Item get(int id);
	
	List<ItemDto> getItemDtos();
	void save(Item item);
	Item getFirstLevelCache(int id);
	Item getFirstLevelCacheInTwoSession(int id);
}
