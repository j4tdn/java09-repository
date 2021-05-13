package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import persistence.ItemGroup;
import util.HibernateUtils;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

	public List<ItemGroup> getAll() {
		Session session = openSession();
//		String sql="select * from LoaiHang";
//	 	NativeQuery<ItemGroup> query= session.createNativeQuery(sql, ItemGroup.class);

//		
//		String hql="select ig from ItemGroup ig where ig.igId=2";
//		TypedQuery<ItemGroup> query=session.createQuery(hql, ItemGroup.class);

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
			System.out.println("save "+itemGroup.getIgName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
