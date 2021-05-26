package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;

public interface ItemDao {
	List<ItemDto> getItemsBySaleDate(LocalDate saleDate);
	List<String> getTop3BestSalerItemsInYear(int year);
}
