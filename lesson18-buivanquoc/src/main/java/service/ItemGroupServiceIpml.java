package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.ItemGroupDto;

public class ItemGroupServiceIpml implements ItemGroupService{
private static ItemGroupDao itemGroupDao;
static {
	itemGroupDao= new HibernateItemGroupDao();
	}
	@Override
	public List<ItemGroupDto> getItemGroupDto() {
		return itemGroupDao.getItemGroupDto();
	}


}
