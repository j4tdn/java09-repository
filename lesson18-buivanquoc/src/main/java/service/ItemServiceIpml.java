package service;

import java.time.LocalDate;
import java.util.List;
import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;
import persistence.ItemDto;

public class ItemServiceIpml implements ItemService {
private ItemDao itemDao;
public ItemServiceIpml()
{
	itemDao= new HibernateItemDao();
}
	public List<Item> getItem() {
		return itemDao.getItem();
	}
	@Override
	public List<String> getTop3Items(int year) {
		return itemDao.getTop3items(year);
	}
	@Override
	public List<ItemDto> getitemsSaleDate(LocalDate saleDate) {
	
		return itemDao.getItemsSaleDate(saleDate);
	}
	
}
