package dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.ItemSize;
import persistence.ItemSize.Id;

public class HibernateItemSizeDao extends EntityDao implements ItemSizeDao {
	@Override
	public ItemSize get(Id id) {
		Session session = openSession();
		return session.get(ItemSize.class, id);
	}

	@Override
	public void save(ItemSize itemSize) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(itemSize);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
