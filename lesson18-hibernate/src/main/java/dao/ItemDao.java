package dao;

import java.util.List;

import persitence.Item;
import persitence.ItemDto;
import persitence.ItemGroup;

public interface ItemDao {
	List<Item> getAll();
	Item get(int id);
	List<ItemDto> getItemDto();
	void save(Item item);
	
	//demo first level cache
		Item getFirstlevelCache(int id);
		
		Item getFirstlevelCacheTwoSessions(int id);
		Item getSecondlevelCache(int id);
}
