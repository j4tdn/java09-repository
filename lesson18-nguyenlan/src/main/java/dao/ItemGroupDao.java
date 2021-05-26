package dao;

import java.util.List;

import persistence.ItemGroupDto;
import persistence.ItemGroup;

public interface ItemGroupDao {
	List<ItemGroupDto> getItemGroupDtos();
}
