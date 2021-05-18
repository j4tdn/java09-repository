package service;

import java.util.List;

import persistence.ItemDto;
import persistence.Items;

public interface ItemService {
	List<Items> getAll();
	Items get(int id);
	List<ItemDto> getItemDtos();
	void save(Items item);
}
