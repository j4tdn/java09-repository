package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;
import persistence.ItemDto;
import persistence.ItemWithDate;
import persistence.ItemWithSizeDto;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao= new HibernateItemDao();
	}

	@Override
	public List<ItemWithDate> getItemWithDate(LocalDate NgayBan) {
		return itemDao.getItemWithDate(NgayBan);
	}
	@Override
	public List<ItemDto> getItemDtos() {
		return itemDao.getItemDtos();
	}
	@Override
	public List<ItemDto> getNumberItem(int year) {
		return itemDao.getNumberItem(year);
	}
	@Override
	public List<ItemWithSizeDto> getItemWithSize() {
		return itemDao.getItemWithSize();
	}
}
