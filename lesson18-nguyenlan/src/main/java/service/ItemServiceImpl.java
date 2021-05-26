package service;

import java.time.LocalDate;
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

	@Override
	public List<ItemDto> getItemsBySaleDate(LocalDate saleDate) {
		return itemDao.getItemsBySaleDate(saleDate);
	}
	
	@Override
	public List<String> getTop3BestSalerItemsInYear(int year) {
		return itemDao.getTop3BestSalerItemsInYear(year);
	}
}
