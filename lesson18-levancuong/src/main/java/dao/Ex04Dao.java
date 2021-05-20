package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class Ex04Dao {
	public List<ItemGroup> getAll() {
		String sql="select * from loaihang";
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session=sessionFactory.openSession();
		Query query=session.createNativeQuery(sql, ItemGroup.class);
		return query.getResultList();
		
	}


}
