package services;

import java.util.List;

import dao.HibernateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao ;
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return itemDao.getAll();
	}

}
