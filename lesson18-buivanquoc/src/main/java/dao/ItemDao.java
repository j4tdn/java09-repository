package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;

public interface ItemDao {
	List<Item> getItem();

	List<String> getTop3items(int year);

	List<ItemDto> getItemsSaleDate(LocalDate saleDate);

}
