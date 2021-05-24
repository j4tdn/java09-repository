package service;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto;

public interface ItemService {
	List<ItemDto> getItemsByDate(LocalDate date);
	public List<String> getItemMostSoldInYear(int year);
}
