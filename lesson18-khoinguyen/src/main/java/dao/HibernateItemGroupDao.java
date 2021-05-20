package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;
import utils.HirbernateUtils;

public class HibernateItemGroupDao implements ItemGroupDao {
	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory = HirbernateUtils.getSessionFactorXml();
		Session session = sessionFactory.openSession();
		String sql = "SELECT lh.MaLoai,\n" + 
				"	   lh.TenLoai,\n" + 
				"       ctdh.SoLuong\n" + 
				"FROM LoaiHang lh\n" + 
				"JOIN mathang mh on mh.MaLoai = lh.MaLoai\n" + 
				"JOIN chitietdonhang ctdh on ctdh.MaMH = mh.MaMH";
		NativeQuery<ItemGroup> query = session.createNativeQuery(sql,ItemGroup.class);
		return query.getResultList();
	}

}
