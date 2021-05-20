package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemCau1;
import persistence.ItemCau4;
import utils.HibernateUtil;

public abstract class HibernateItemDao extends EntityDao implements ItemDao {

	private static final String CAU_1 = "SELECT mh.MaMH,ctttdh.ThoiGian\n" + 
			"FROM MatHang mh\n" + 
			"JOIN ChiTietDonHang ctdh ON mh.MaMH=ctdh.MaMH\n" + 
			"JOIN DonHang dh ON dh.MaDH=ctdh.MaDH\n" + 
			"JOIN ChiTietttdh ctttdh ON ctttdh.MaDH=ctdh.MaDH\n" + 
			"WHERE  cast(dh.NgayTao AS DATE)='2020-12-18'";
	
	
	@SuppressWarnings("deprecation")
	public List<ItemCau1> getItemDao() {
		Session session = openSession();
		NativeQuery<?> query = session.createSQLQuery(CAU_1);
		query.addScalar(ItemCau1.ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemCau1.NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemCau1.TIME, StandardBasicTypes.LONG);
		query.setResultTransformer(Transformers.aliasToBean(ItemCau1.class));
		
		return safeList(query);
	}

	@Override
	public List<ItemCau4> getAll() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		// native query
		String sql = "SELECT * FROM MatHang"; //MaLoai, TenLoai
		NativeQuery<ItemCau4> query = session.createNativeQuery(sql, ItemCau4.class);
		return query.getResultList();
	}

	
	
	
}
