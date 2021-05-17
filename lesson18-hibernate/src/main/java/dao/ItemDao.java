package dao;

import java.util.List;

import persistence.Item;
import persistence.ItemDetail;
import persistence.ItemDto;

public interface ItemDao {
	List<Item> getAll ();
	Item get(int id);
	List<Item> getByBuyPrice(int buyPrice);
	List<ItemDto> getItemDtos(); 
	void save(Item item);
	
	Item getFirstLevelCache(int id) ;
	Item getFirstLevelCacheInTwoSessions(int id) ;
	Item getSecondLevelCache(int id) ;
}
