package dao;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemWithSizeDto;

public interface ItemDao {
	List<Item> getAll();
	List<ItemDto> getItemDtos();
	List<ItemDto> getNumberItem();
	List<ItemWithSizeDto> getItemWithSize();
}
