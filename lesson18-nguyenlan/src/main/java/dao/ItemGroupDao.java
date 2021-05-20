package dao;

import java.util.List;

import dto.ItemGroupDto;
import persistence.ItemGroup;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	void save(ItemGroup itemGroup);
	List<ItemGroupDto> getItemGroupDtos();
}
