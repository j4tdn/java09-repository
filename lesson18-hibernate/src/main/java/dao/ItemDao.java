package dao;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;

public interface ItemDao {
	List<Item> getAll();
	Item get(int id);
}
