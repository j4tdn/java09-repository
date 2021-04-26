package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistence.Item;
import utils.HibernateUtils;

public class HibernateItemDao implements ItemDao {

	@Override
	public List<Item> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		String sql = "SELECT * FROM MatHang mh\n"
				+ "JOIN LoaiHang lh ON mh.MaLoai = lh.MaLoai \n";
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		
		return query.getResultList();
	}

	@Override
	public Item get(int id) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		return session.get(Item.class, id);
	}

}
