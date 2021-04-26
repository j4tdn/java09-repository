package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao {

	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXml();
		Session session = sessionFactory.openSession();
		// sessionFactory.getCurrentSession();

		// native query, JPQL/HQL
//		String nativeSQL = "SELECT * FROM LoaiHang"; //MaLoai, TenLoai
//		NativeQuery<ItemGroup> query = session.createNativeQuery(nativeSQL, ItemGroup.class);

//		//HQL
//		String hql = "SELECT ig FROM ItemGroup ig WHERE ig.igId = 2"; // MaLoai, TenLoai
//		TypedQuery<ItemGroup> query =  session.createQuery(hql, ItemGroup.class);

		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.SELECT_ALL_HQL, ItemGroup.class);

		return query.getResultList(); //query.uniqueResult();
	}
	
	

}
