package service;
import java.time.LocalDate;
import java.util.List;
import persistence.Item;
import persistence.ItemDto;

public interface ItemService {
List<Item> getItem();
List<String> getTop3Items(int year);
List<ItemDto> getitemsSaleDate(LocalDate saleDate);
}
