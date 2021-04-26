package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;

public class ItemServiceImp implements ItemService {

	private ItemDao itemDao;
	
	public ItemServiceImp() {
		itemDao = new HibernateItemDao();
	}
	
	public List<Item> getAll() {
		return itemDao.getAll();
	}
	
	@Override
	public Item get(int id) {
		return itemDao.get(id);
	}

}
