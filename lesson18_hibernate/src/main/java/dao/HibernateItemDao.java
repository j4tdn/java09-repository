package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistence.Item;
import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemDao implements ItemDao{
	public List<Item> getAll() {
		SessionFactory sessionFactory= HibernateUtils.getSessionFactoryXML();
		Session session = sessionFactory.openSession();
		
		//native query
		String sql=" SELECT * FROM MatHang"; //Maloai,TenLoai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		return query.getResultList();
	}
}
