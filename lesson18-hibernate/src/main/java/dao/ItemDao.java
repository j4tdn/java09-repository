package dao;

import java.util.List;

import persistence.Items;

public interface ItemDao {
	List<Items> getAll();
}
