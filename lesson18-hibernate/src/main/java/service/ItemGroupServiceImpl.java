package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService{

	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	private ItemGroupDao itemGroupDao;
	public List<ItemGroup> getAll() {
		
		return itemGroupDao.getAll();
	}

}
