package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import persistence.ItemGroup;
import util.HibernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao {
	
	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory= HibernateUtils.getSessionFactoryXml();
		Session session= sessionFactory.openSession();
//		String sql="select * from LoaiHang";
//	 	NativeQuery<ItemGroup> query= session.createNativeQuery(sql, ItemGroup.class);
		
//		
//		String hql="select ig from ItemGroup ig where ig.igId=2";
//		TypedQuery<ItemGroup> query=session.createQuery(hql, ItemGroup.class);
	 	
		Query<ItemGroup> query= session.createNamedQuery(ItemGroup.SELECT_ALL_NATIVE, ItemGroup.class);
		return query.getResultList();
	}
	

}
