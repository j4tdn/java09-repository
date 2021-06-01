package dao;

import java.time.LocalDate;
import java.util.List;

import dto.ItemDto;

public interface ItemDao {
	List<ItemDto> getItemByBuyDate(LocalDate buyDate);
	List<ItemDto> getItemPopulariry(int year);
}
