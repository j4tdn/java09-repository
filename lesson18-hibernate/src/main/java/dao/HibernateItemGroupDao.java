package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao {
	public List<ItemGroup> getAll() {
		SessionFactory sesionFactory = HibernateUtils.getSessionFactoryJava();
		Session session = sesionFactory.openSession();
		// sesionFactory.getCurrentSession();

		// native query
		String sql = "Select * from LoaiHang";// maloai tenloai
		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		
		return query.getResultList();
		
	}

}
