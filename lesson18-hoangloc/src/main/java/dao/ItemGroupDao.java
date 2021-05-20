package dao;

import java.util.List;

import persistence.ItemDto;
import persistence.ItemGroup;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	List<ItemDto> getItemAndToTal();

}
