package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persitence.Item;
import persitence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemDao implements ItemDao {
	public List<Item> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactorXml();
		Session session = sessionFactory.openSession();
		String sql = "SELECT * FROM MatHang"; // MaLoai, TenLoai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		query.getResultList();
		return query.getResultList();
	}
}
