package service;

import java.util.List;

import dao.ItemGroupDao;
import dao.ItemGroupDaoImpl;
import persistance.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {
	ItemGroupDao itemGroupDao = new ItemGroupDaoImpl();

	@Override
	public List<ItemGroup> getItemByItemGroup() {
		// TODO Auto-generated method stub
		return itemGroupDao.getItemByItemGroup();
	}

}
