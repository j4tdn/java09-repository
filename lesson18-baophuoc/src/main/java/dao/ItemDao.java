package dao;

import java.util.List;

import persistence.ItemDto;

public interface ItemDao {
	List<ItemDto> getItemDtos();
	List<ItemDto> getNumberItem();
}
