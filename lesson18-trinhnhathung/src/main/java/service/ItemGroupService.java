package service;

import java.util.List;

import dto.ItemGroupDto;
import dto.ItemsOfItemGroupDto;

public interface ItemGroupService {
	List<ItemGroupDto> getItemGroupDtos();
	List<ItemsOfItemGroupDto> getItemsOfItemGroupDtos();
}
