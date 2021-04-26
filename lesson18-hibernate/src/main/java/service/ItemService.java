package service;

import java.util.List;

import persistence.Items;

public interface ItemService {
	List<Items> getAll();
	Items get(int id);
}
