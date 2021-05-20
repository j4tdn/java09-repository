package service;

import java.util.List;

import dto.ItemGroupDto;
import persistence.ItemGroup;

public interface ItemGroupService {
	List<ItemGroupDto> getItemGroupDtos();
}
