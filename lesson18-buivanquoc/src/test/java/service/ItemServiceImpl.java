package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;
import persistence.ItemCau1;
import persistence.ItemCau4;



public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}


public List<ItemCau1> getItemdao() {
		// TODO Auto-generated method stub
		return itemDao.getItemDao();
	}

public List<ItemCau4> getAll() {
		return itemDao.getAll();
	}
	

	


	

}
