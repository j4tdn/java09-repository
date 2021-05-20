package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{
	
	private static ItemGroupDao itemGroupDao;
	
	static {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupByRemain() {
		return itemGroupDao.getItemGroupByRemain();
	}

	@Override
	public List<ItemGroup> getAllItemGroupDetail() {
		// TODO Auto-generated method stub
		return itemGroupDao.getAllItemGroupDetail();
	}

}
