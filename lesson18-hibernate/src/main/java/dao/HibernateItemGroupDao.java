package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao {
	@Override
	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		String sql = "SELECT * FROM LoaiHang";
		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		
		return query.getResultList();
	}

}
