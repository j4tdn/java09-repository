package service;

import java.util.List;

import persitence.Item;
import persitence.ItemDto;
import persitence.ItemGroup;

public interface ItemService {
	List<Item> getAll();
	Item get(int id);
	List<ItemDto> getItemDtos();
	void save(Item item);
}
