package service;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;

public interface ItemService {
	List<Item> getAll();
	Item get(int id);
	List<ItemDto> getItemsDtos();
	void save(Item item);
}
