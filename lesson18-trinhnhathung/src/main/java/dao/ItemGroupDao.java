package dao;

import java.util.List;

import dto.ItemGroupDto;
import dto.ItemsOfItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroupDto> getItemGroupDtos();
	List<ItemsOfItemGroupDto> getItemsOfItemGroupDtos();
}
