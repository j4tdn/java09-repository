package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao{
	public List<ItemGroup> getAll() {
		Session session= openSession();
		
		//native query
		String sql=" SELECT * FROM LoaiHang"; //Maloai,TenLoai
		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		return query.getResultList();
	}

	@Override
	public void save(ItemGroup itemGroup) {
		Session session=getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			session.save(itemGroup);
			transaction.commit();
			System.out.println("Save : "+ itemGroup.getIgName()+ " successful !");
		} catch (Exception e) {
			transaction.rollback();
		}
	}
}
