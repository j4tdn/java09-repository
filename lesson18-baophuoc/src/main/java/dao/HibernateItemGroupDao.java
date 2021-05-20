package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao {
	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXML();
		Session session = sessionFactory.openSession();
		String sql = "SELECT * FROM MatHang";
		Query<ItemGroup>query= session.createNativeQuery(sql, ItemGroup.class);
		return query.getResultList();
	}
}
