package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;

public interface ItemDao {
	List<ItemDto> getItemDtos(LocalDate dateSale);
	String getItemsByAmount(int year);
	
}
