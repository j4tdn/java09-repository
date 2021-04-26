 package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import persistence.Item;
import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao{
	public List<ItemGroup> getAll() {
		HibernateUtils.getSessionFactoryXML();
		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXML();
		 Session session = sessionFactory.openSession();
		 /*//native query
		 String sql = "SELECT * FROM LoaiHang"; //ma loai. ten loai
		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		*/
		 
		 /*session.createNamedQuery(name, ItemGroup.class);
		 
		 String hql = "SELECT ig FROM ItemGroup ig WHERE ig.igId =2";
		 TypedQuery<ItemGroup> query = session.createQuery(hql, ItemGroup.class);
		*/
		/* Query<ItemGroup> query = session.createNamedQuery("SELECT_ALL", ItemGroup.class);
		 return query.getResultList(); */
		 Query<ItemGroup> query = session.createNamedQuery(ItemGroup.SELECT_ALL_HQL, ItemGroup.class);
		 return query.getResultList();
		 
		 
		
	}
	

}
