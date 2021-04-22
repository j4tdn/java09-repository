package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibarnateItemGroupDao implements ItemGroupDao {

	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session=sessionFactory.openSession();
//		sessionFactory.getCurrentSession();
		String sql="Select * from loaihang";//maloai ,tenloai
		
		NativeQuery<ItemGroup> query=session.createNativeQuery(sql, ItemGroup.class);
		return query.getResultList();
		
	}

}
