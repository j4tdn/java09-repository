package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;
import persistence.ItemDto;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	public List<Item> getAll() {

		return itemDao.getAll();
	}

	@Override
	public List<ItemDto> getItemsDtos() {
		return itemDao.getItemDtos();
	}

}
