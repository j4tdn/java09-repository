package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;

public class ItemServiceImpl implements ItemService{

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	private HibernateItemDao itemDao;
	public List<Item> getAll() {
		
		return itemDao.getAll();
	}

}
