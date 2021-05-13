package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import persitence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {
	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactorXml();
		Session session = sessionFactory.openSession();
		
//		String sql = "SELECT * FROM LoaiHang"; // MaLoai, TenLoai
//		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
//		String hql = "SELECT ig FROM ItemGroup ig ";
//		TypedQuery<ItemGroup> query=session.createQuery(hql,ItemGroup.class);
//		query.getResultList();
	
		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.SELECT_ALL_HQL,ItemGroup.class);
		return query.getResultList();
		//getResultList : get all 
		//unqueResult : get one
	}
	@Override
	public void save(ItemGroup itemGroup) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(itemGroup);
			transaction.commit();
			System.out.println("Save" + itemGroup.getIgName()+ "successfull !");
		} catch (Exception e) {
			transaction.rollback();
		}
	}
}
