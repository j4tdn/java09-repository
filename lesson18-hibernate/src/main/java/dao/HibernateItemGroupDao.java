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

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

	@Override
	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXml();
		Session session = sessionFactory.openSession();
		
		// native query
//		String sql = "SELECT * FROM LoaiHang"; //MaLoai, TenLoai
//		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		
//		String hql = "SELECT ig FROM ItemGroup ig WHERE ig.igId = 2";
//		TypedQuery<ItemGroup> query = session.createQuery(hql, ItemGroup.class);
		
		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.SELECT_ALL_NATIVE, ItemGroup.class);
		return query.getResultList();
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(itemGroup);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
	}
	
}
