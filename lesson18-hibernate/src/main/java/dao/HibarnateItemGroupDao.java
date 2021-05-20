package dao;

import java.util.List;


import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibarnateItemGroupDao implements ItemGroupDao {

	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session=sessionFactory.openSession();
//		sessionFactory.getCurrentSession();
//		String sql="Select * from loaihang";//maloai ,tenloai
//		
//		NativeQuery<ItemGroup> query=session.createNativeQuery(sql, ItemGroup.class);
//@@@@
//		String hql="select ig from ItemGroup ig where ig.igId=2";
//		
//		TypedQuery<ItemGroup> query =session.createQuery(hql,ItemGroup.class);
		
//@@@@ SELECT_ALL
		Query<ItemGroup> query=session.createNamedQuery(ItemGroup.SELECT_ALL_NATIVE, ItemGroup.class);
		
		return query.getResultList();
		
	}

	@Override
	public void save(ItemGroup itemGroup) {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		
		Session session= sessionFactory.getCurrentSession();
		
		Transaction transaction= session.beginTransaction();
		
		try {
			session.save(itemGroup);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
	}

}
