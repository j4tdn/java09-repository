package service;

import java.util.List;

import dao.ItemDao;
import dao.ItemDaoImpl;
import dto.ItemWithDate;
import dto.RemainItem;

public class ItemServiceImpl implements ItemService {
	private static ItemDao itemDao = new ItemDaoImpl();

	@Override
	public List<ItemWithDate> getItemWithDate() {
		return itemDao.getItemWithDate();
	}

	@Override
	public List<RemainItem> getRemainItems() {
		return itemDao.getRemainItems();
	}

	@Override
	public List<String> getSaleItems(int year) {
		return itemDao.getSaleItems(year);
	}

}
