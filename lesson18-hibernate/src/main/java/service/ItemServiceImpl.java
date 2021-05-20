package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroup;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;
	public ItemServiceImpl() {
		itemDao=new HibernateItemDao();
	}
	
	public List<Item> getAll() {
		return itemDao.getAll();
	}
	@Override
	public Item get(int id) {
		return itemDao.get(id);
	}
	@Override
	public List<ItemDto> getItemDtos() {

		
		return itemDao.getItemDto();
	}
	@Override
	public void save(Item item) {
		itemDao.save(item);
	}
	@Override
	public Item getFirstLevelCache(int id) {
		return itemDao.getFirstLevelCache(id);
	}
	@Override
	public Item getFirstLevelCacheInTwoSessions(int id) {
		
		return itemDao.getFirstLevelCacheInTwoSessions(id);
	}

}
