package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemDto;

public class ItemServiceImp implements ItemService {

	private ItemDao itemDao;
	
	public ItemServiceImp() {
		itemDao = new HibernateItemDao();
	}

	@Override
	public List<ItemDto> getItemDtos(LocalDate dateSale) {
		return itemDao.getItemDtos(dateSale);
	}
	
	@Override
	public String getItemsByAmount(int year) {
		return itemDao.getItemsByAmount(year);
	}
}
