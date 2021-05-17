package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroup;

public class ItemServiceImpl implements ItemService{

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	private HibernateItemDao itemDao;
	public List<Item> getAll() {
		
		return itemDao.getAll();
	}
	@Override
	public Item get(int id) {
		// TODO Auto-generated method stub
		return itemDao.get(id);
	}
	@Override
	public List<ItemDto> getItemDtos() {
		
		return itemDao.getItemDtos();	
		 
	}
	@Override
	public void save(Item item) {
		// TODO Auto-generated method stub
		itemDao.save(item);
	}
	@Override
	public Item getFirstLevelCache(int id) {
		// TODO Auto-generated method stub
		return itemDao.getFirstLevelCache(id)	;
	}
	@Override
	public Item getFirstLevelCacheInTwoSession(int id) {
		// TODO Auto-generated method stub
			
		return itemDao.getFirstLevelCacheInTwoSession(id);
	}
	@Override
	public Item getSecondLevelCache(int id) {
		// TODO Auto-generated method stub
		return itemDao.getSecondLevelCache(id);
	}

}
