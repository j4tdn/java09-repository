package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao{
	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory= HibernateUtils.getSessionFactoryXML();
		Session session = sessionFactory.openSession();
		
		//native query
		String sql=" SELECT * FROM LoaiHang"; //Maloai,TenLoai
		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		return query.getResultList();
	}
}
