package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroupDto;

public class ItemGroupServiceImp implements ItemGroupService {

	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImp() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		return itemGroupDao.getItemGroupDtos();
	}
}
