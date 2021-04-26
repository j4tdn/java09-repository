package service;

import java.util.List;

import dao.HibarnateItemDao;
import dao.ItemDao;
import persistence.Items;

public class ItemServiceImpl implements ItemService{
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao=new HibarnateItemDao();
	}
	
	public List<Items> getAll() {
		
		return itemDao.getAll();
	}

	@Override
	public Items get(int id) {
		
		return itemDao.get(id);
	}

}
