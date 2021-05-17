package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;

public class ItemGroupServiceImp implements ItemGroupService {

	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImp() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	@Override
	public void save(ItemGroup itemGroup) {
		itemGroupDao.save(itemGroup);
	}

}
