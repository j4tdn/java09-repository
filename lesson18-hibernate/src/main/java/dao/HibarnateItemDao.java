package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;
import persistence.Items;
import utils.HibernateUtils;

public class HibarnateItemDao implements ItemDao {

	public List<Items> getAll() {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session=sessionFactory.openSession();
		sessionFactory.getCurrentSession();
		String sql="Select * from mathang";
		NativeQuery<Items> query=session.createNativeQuery(sql, Items.class);
		return query.getResultList();
		
	}

	@Override
	public Items get(int id) {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session=sessionFactory.openSession();
		return session.get(Items.class,id);
	}

}
