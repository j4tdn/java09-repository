package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;
import persistence.ItemGroup;
import persistence.Items;
import utils.HibernateUtils;
import org.hibernate.transform.Transformers;

public class HibarnateItemDao implements ItemDao {
	
	private static final String Q_ITEMS_QTY = "SELECT lh.MaLoai AS " + "igrId" + ",\n" + 
			"		lh.TenLoai " + "igrName" + ",\n" + 
			"		sum(kcmh.SoLuong) " + "nofItems" + "\n" + 
			"FROM LoaiHang lh\n" + 
			"JOIN mathang mh\n" + 
			"	ON lh.MaLoai = mh.MaLoai\n" + 
			"JOIN KichCoMatHang kcmh\n" + 
			"	ON kcmh.MaMH = mh.MaMH\n" + 
			"GROUP BY lh.MaLoai;";

	public List<Items> getAll() {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session=sessionFactory.openSession();
		sessionFactory.getCurrentSession();
		String sql="Select * from mathang";
		NativeQuery<Items> query=session.createNativeQuery(sql, Items.class);
		return query.getResultList();
		
	}

	@Override
	public Items get(int id) {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session=sessionFactory.openSession();
		return session.get(Items.class,id);
	}

	@Override
	public List<ItemDto> getItemDtos() {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		NativeQuery<?> query=session.createNativeQuery(Q_ITEMS_QTY);
		query.addScalar("igrId",StandardBasicTypes.INTEGER);
		query.addScalar("igrName",StandardBasicTypes.STRING);
		query.addScalar("nofItems",StandardBasicTypes.INTEGER);
		query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		
		
		List<ItemDto> result=(List<ItemDto>) query.list();
		
		return result;
	}

	@Override
	public void save(Items item) {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction= session.beginTransaction();
		try {
			session.saveOrUpdate(item);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	
	}

}
