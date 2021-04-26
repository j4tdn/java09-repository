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
		HibernateUtils.getSessionFactoryXML();
		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXML();
		 Session session = sessionFactory.openSession();
		 //native query
		 String sql = "SELECT * FROM Mathang"; //ma loai. ten loai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		return query.getResultList();
	}
	@Override
	public Item get(int id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXML();
		 Session session = sessionFactory.openSession();
		 session.get(Item.class, id);
		return session.get(Item.class, id);
	}
	

}
