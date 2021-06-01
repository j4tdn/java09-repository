package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import dto.ItemGroupDto;
import dto.ItemsOfItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		return itemGroupDao.getItemGroupDtos();
	}
	
	@Override
	public List<ItemsOfItemGroupDto> getItemsOfItemGroupDtos() {
		return itemGroupDao.getItemsOfItemGroupDtos();
	}
}
