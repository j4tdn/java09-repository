package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao {
	@Override
	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
//		String sql = "SELECT * FROM LoaiHang";
//		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		
//		String hql = "SELECT ig FROM ItemGroup ig WHERE ig.igId = 2";
//		TypedQuery<ItemGroup> query = session.createQuery(hql, ItemGroup.class);
		
		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.SELECT_ALL_HQL, ItemGroup.class);
		return query.getResultList();
	}

}
