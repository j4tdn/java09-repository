package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistence.Item;
import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemDao implements ItemDao {
	
	public List<Item> getAll() {
		SessionFactory sesionFactory = HibernateUtils.getSessionFactoryJava();
		Session session = sesionFactory.openSession();
		// sesionFactory.getCurrentSession();

		// native query
		String sql = "Select * from MatHang";// maloai tenloai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		
		return query.getResultList();
		
	}

}
