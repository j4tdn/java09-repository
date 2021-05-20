package dao;

import java.util.List;

import dto.ItemWithDate;
import dto.RemainItem;

public interface ItemDao {
	List<ItemWithDate> getItemWithDate();
	List<RemainItem> getRemainItems();
	List<String> getSaleItems(int year);
}
