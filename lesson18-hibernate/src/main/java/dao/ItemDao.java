package dao;

import java.util.List;

import persistence.ItemDto;
import persistence.Items;

public interface ItemDao {
	List<Items> getAll();
	Items get(int id);
	List<ItemDto> getItemDtos();
	void save(Items item);
}
