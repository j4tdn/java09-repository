package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import dao.HibernateItemDao;
import dao.ItemDao;
import dto.ItemDto;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	@Override
	public List<ItemDto> getItemByBuyDate(LocalDate buyDate) {
		return itemDao.getItemByBuyDate(buyDate);
	}

	@Override
	public List<String> getItemPopulariry(int year) {
		return itemDao.getItemPopulariry(year).stream().map(itemDto -> itemDto.getItemName())
				.collect(Collectors.toList());
	}
}
