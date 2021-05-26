package service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;

public interface ItemService {
	List<ItemDto> getItemsBySaleDate(LocalDate saleDate);
	List<String> getTop3BestSalerItemsInYear(int year);

}
