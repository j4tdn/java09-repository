package service;

import java.util.List;

import persistence.ItemGroupDto;
import persistence.ItemGroup;

public interface ItemGroupService {
	List<ItemGroupDto> getItemGroupDtos();
}
