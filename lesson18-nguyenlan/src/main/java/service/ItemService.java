package service;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;

public interface ItemService {
	List<Item> getAll();
	List<ItemDto> getItemsDtos();

}
