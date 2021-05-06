package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao {
	public List<ItemGroup> getAll() {
		SessionFactory sesionFactory = HibernateUtils.getSessionFactoryJava();
		Session session = sesionFactory.openSession();
		// sesionFactory.getCurrentSession();

		// native query
//		String sql = "Select * from LoaiHang";// maloai tenloai
//		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
	
		
//		String hql = "SELECT ig FROM ItemGroup ig WHERE	ig.igID = 2";
//		TypedQuery<ItemGroup> query = session.createQuery(hql, ItemGroup.class);

		Query<ItemGroup> query= session.createNamedQuery("SELECT_ALL", ItemGroup.class);
		return query.getResultList();
		
	}

}
