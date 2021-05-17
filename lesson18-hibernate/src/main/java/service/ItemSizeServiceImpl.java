package service;

import dao.HibernateItemSizeDao;
import dao.ItemSizeDao;
import persistence.ItemSize;
import persistence.ItemSize.Id;

public class ItemSizeServiceImpl implements ItemSizeService {
	
	private ItemSizeDao itemSizeDao;
	
	public ItemSizeServiceImpl() {
		itemSizeDao = new HibernateItemSizeDao();
	}
	
	@Override
	public ItemSize get(Id id) {
		return itemSizeDao.get(id);
	}
	
	@Override
	public void save(ItemSize itemSize) {
		itemSizeDao.save(itemSize);
	}
}
