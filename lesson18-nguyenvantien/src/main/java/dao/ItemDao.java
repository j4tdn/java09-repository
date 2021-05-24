package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto;
import persistence.ItemWithYearDto;

public interface ItemDao {
	public List<ItemDto> getItemDtoByDate(LocalDate date);
	public List<ItemWithYearDto> getItemMostSoldInYear(int year);
}
