package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {
	public List<ItemGroup> getAll() {
		Session session = openSession();
		String sql = "SELECT * FROM LoaiHang";
		Query<ItemGroup>query= session.createNativeQuery(sql, ItemGroup.class);
		return query.getResultList();
	}
}
