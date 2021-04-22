package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;
import util.HibernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao {
	
	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory= HibernateUtils.getSessionFactoryXml();
		Session session= sessionFactory.openSession();
		String sql="select * from LoaiHang";
	 	NativeQuery<ItemGroup> query= session.createNativeQuery(sql, ItemGroup.class);
		
	 	return query.getResultList();
	}

}
