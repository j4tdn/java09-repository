package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;
import persistence.ItemDto;
import persistence.ItemWithSizeDto;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao= new HibernateItemDao();
	}


	public List<ItemDto> getItemDtos() {
		return itemDao.getItemDtos();
	}
	@Override
	public List<ItemDto> getNumberItem() {
		return itemDao.getNumberItem();
	}
	@Override
	public List<ItemWithSizeDto> getItemWithSize() {
		return itemDao.getItemWithSize();
	}
	
}
