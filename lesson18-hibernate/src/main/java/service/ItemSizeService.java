package service;


import persistence.ItemSize;
import persistence.ItemSize.Id;

public interface ItemSizeService {
	ItemSize get(Id id);
	void save(ItemSize itemSize);
}
