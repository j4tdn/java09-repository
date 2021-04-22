package dao;

import java.util.List;

import persitence.Item;
import persitence.ItemGroup;

public interface ItemDao {
	List<Item> getAll();
}
