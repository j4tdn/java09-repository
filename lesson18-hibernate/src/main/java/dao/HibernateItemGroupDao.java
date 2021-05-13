package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import persistence.ItemGroup;
import utils.HibernateUtil;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

	@Override
	public List<ItemGroup> getAll() {
		Session session = openSession();
//		String sql = "SELECT * FROM LoaiHang";
//		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		
//		String hql = "SELECT ig FROM ItemGroup ig WHERE ig.id =2";
//		TypedQuery<ItemGroup> query = session.createQuery(hql,ItemGroup.class);
		
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
			System.out.println("Save " + itemGroup.getName() + " successful");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
