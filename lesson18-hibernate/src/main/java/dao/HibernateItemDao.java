package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistence.Item;
import utils.HibernateUtils;

public class HibernateItemDao implements ItemDao {

	public List<Item> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXml();
		Session session = sessionFactory.openSession();
		// sessionFactory.getCurrentSession();

		// native query
		String sql = "SELECT * FROM MatHang"; // MaLoai, TenLoai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		return query.getResultList();
	}
	
	@Override
	public Item get(int id) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXml();
		Session session = sessionFactory.openSession();
		return session.get(Item.class, id);
	}

}
