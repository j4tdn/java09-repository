package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {
	
	@Override
	public List<ItemGroup> getAll() {
		Session session = openSession();
		/*
		// native query, JPQL/HQL
		String nativeSQL = "SELECT * FROM LoaiHang"; // MaLoai, TenLoai
		NativeQuery<ItemGroup> query = session.createNativeQuery(nativeSQL, ItemGroup.class);
		*/
		/*
		  String hql = "SELECT ig FROM ItemGroup ig WHERE ig.igId = 2";
		  TypedQuery<ItemGroup> query = session.createQuery(hql, ItemGroup.class);
		 */
		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.SELECT_ALL_HQL, ItemGroup.class);
		return query.getResultList();
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(itemGroup);
			transaction.commit();
			System.out.println("Save " + itemGroup.getIgName() + " successful !");
		} catch (Exception e) {
			transaction.rollback();
		}
		  
	}
}
