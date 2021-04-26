package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persitence.Item;
import persitence.ItemGroup;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;
	public ItemServiceImpl() {
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
