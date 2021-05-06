package dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemDto;
import utils.HibernateUtils;

public class HibernateItemDao extends EntityDao implements ItemDao {

	private static final String Q_ITEMS_BY_IGR = 
			"SELECT lh.MaLoai AS " + ItemDto.IGR_ID +",\n" + 
			"		lh.TenLoai " + ItemDto.IGR_NAME +",\n" + 
			"		sum(kcmh.SoLuong) "+ ItemDto.NOF_ITEMS + "      \n" + 
			"FROM loaihang lh\n" + 
			"JOIN mathang mh \n" + 
			"	ON lh.MaLoai = mh.MaLoai\n" + 
			"JOIN kichcomathang kcmh\n" + 
			"	ON kcmh.MaMH = mh.MaMH\n" + 
			"GROUP BY lh.MaLoai";
	public List<Item> getAll() {
		Session session = openSession();
		// sessionFactory.getCurrentSession();

		// native query
		String sql = "SELECT * FROM MatHang"; // MaLoai, TenLoai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		return query.getResultList();
	}
	
	@Override
	public Item get(int id) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXml();
		Session session = sessionFactory.openSession();
		return session.get(Item.class, id);
	}

	@Override
	public List<ItemDto> getItemDtos() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(Q_ITEMS_BY_IGR);
		
		query.addScalar(ItemDto.IGR_ID, StandardBasicTypes.INTEGER)
			.addScalar(ItemDto.IGR_NAME, StandardBasicTypes.STRING)
			.addScalar(ItemDto.NOF_ITEMS, StandardBasicTypes.LONG)
			.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
	
		return safeList(query);
	}
	@Override
	public void save(Item item) {
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		try {
			//insert or update
			session.saveOrUpdate(item);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}

}
