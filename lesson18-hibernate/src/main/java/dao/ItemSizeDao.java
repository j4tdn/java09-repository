package dao;

import persistence.ItemSize;
import persistence.ItemSize.Id;

public interface ItemSizeDao {
	ItemSize get(Id id);
	void save(ItemSize itemSize);
}
