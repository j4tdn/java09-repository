package service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.ItemDto;
import persistence.ItemWithYearDto;

public class ItemServiceImpl implements ItemService{
	
	private static ItemDao itemDao;
	
	static {
		itemDao = new HibernateItemDao();
	}
	
	public List<ItemDto> getItemsByDate(LocalDate date) {
		return itemDao.getItemDtoByDate(date);
	}

	@Override
	public List<String> getItemMostSoldInYear(int year) {
		return itemDao.getItemMostSoldInYear(year).stream()
				.sorted((i1, i2)->((ItemWithYearDto) i2).getQuantity() - ((ItemWithYearDto) i1).getQuantity())
				.map(i->((ItemWithYearDto) i).getName())
				.limit(3)
				.collect(Collectors.toList());
	}

}
