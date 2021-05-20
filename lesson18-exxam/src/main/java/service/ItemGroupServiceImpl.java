package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemDto;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDao itemGroupDao;

	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	public List<ItemGroup> getAll() {

		return itemGroupDao.getAll();
	}

	public List<ItemDto> getItemAndToTal() {

		
		return itemGroupDao.getItemAndToTal();
	}

}
