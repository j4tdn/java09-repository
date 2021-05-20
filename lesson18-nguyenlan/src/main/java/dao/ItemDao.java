package dao;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;

public interface ItemDao {
	List<Item> getAll();
	List<ItemDto> getItemDtos();
}
