package service;

import java.util.List;

import dto.ItemWithDate;
import dto.RemainItem;

public interface ItemService {
	List<ItemWithDate> getItemWithDate();
	List<RemainItem> getRemainItems();
	List<String> getSaleItems(int year);
}
