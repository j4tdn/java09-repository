package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {
	
	@Override
	/*
	 *  quantity of items in stock get from size of items 
	 */
	public List<ItemGroup> get() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		String sql = "SELECT * FROM loaihang";
		List<ItemGroup> itemGroups = new ArrayList<>();
		try {
			NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
			itemGroups = query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return itemGroups;
	}
}
