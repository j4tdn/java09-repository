package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemGroupDao;
	
	public ItemServiceImpl() {
		itemGroupDao = new HibernateItemDao();
	}
	
	@Override
	public List<Item> getAll() {
		
		return itemGroupDao.getAll();
	}

	@Override
	public Item get(int id) {
		return itemGroupDao.get(id);
	}

}
