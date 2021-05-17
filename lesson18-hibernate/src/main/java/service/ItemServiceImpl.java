package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persitence.Item;
import persitence.ItemDto;
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
	@Override
	public List<ItemDto> getItemDtos() {
		return itemDao.getItemDto();
	}
	@Override
	public void save(Item item) {
		itemDao.save(item);
	}
	@Override
	public Item getFirstlevelCache(int id) {
		return itemDao.getFirstlevelCache(id);
	}
	@Override
	public Item getFirstlevelCacheTwoSessions(int id) {
		return itemDao.getFirstlevelCacheTwoSessions(id);
	}
	@Override
	public Item getSecondlevelCache(int id) {
		return itemDao.getSecondlevelCache(id);
	}
}
