package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persitence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao {
	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactorXml();
		Session session = sessionFactory.openSession();
		String sql = "SELECT * FROM LoaiHang"; // MaLoai, TenLoai
		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		query.getResultList();
		return query.getResultList();
	}
}
