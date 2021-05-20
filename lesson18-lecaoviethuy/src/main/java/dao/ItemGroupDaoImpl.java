package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistance.ItemGroup;
import utils.HibernateUtils;

public class ItemGroupDaoImpl implements ItemGroupDao {

	@Override
	public List<ItemGroup> getItemByItemGroup() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		String sql = "SELECT * FROM LoaiHang lh\n"
				+ "JOIN MatHang mh ON mh.MaLoai = lh.MaLoai \n";
		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		
		return query.getResultList();
	}

}
