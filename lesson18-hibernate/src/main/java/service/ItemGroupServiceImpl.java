package service;

import java.util.List;

import dao.HibarnateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService{
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao=new HibarnateItemGroupDao();
	}
	public List<ItemGroup> getAll() {
		
		return itemGroupDao.getAll();
	}
	@Override
	public void save(ItemGroup itemGroup) {
	    itemGroupDao.save(itemGroup);
	}

}
