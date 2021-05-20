package service;

import java.util.List;

import dao.HibernateItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService{
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	private HibernateItemDao itemDao;
	
	public List<Item> getItemDtos() {
		// TODO Auto-generated method stub
		return itemDao.getItemDtos();
	}

	@Override
	public List<Item> getItemDtos2() {
		// TODO Auto-generated method stub
		return  itemDao.getItemDtos2();
	}
	

}
