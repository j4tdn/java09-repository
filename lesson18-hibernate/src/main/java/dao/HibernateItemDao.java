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
import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemDao extends EntityDao implements ItemDao {

	private static final String Q_GET_ITEMS_BY_IGR = "SELECT lh.MaLoai AS " + ItemDto.IGR_ID +",\r\n" + 
			"		lh.TenLoai AS " + ItemDto.IGR_NAME +",\r\n" + 
			"        SUM(kcmh.SoLuong) AS " + ItemDto.IGR_ITEMS +"\r\n" + 
			"FROM loaihang lh\r\n" + 
			"JOIN mathang mh ON lh.MaLoai = mh.MaLoai\r\n" + 
			"JOIN kichcomathang kcmh ON kcmh.MaMH = mh.MaMH\r\n" + 
			"GROUP BY lh.MaLoai";
	
	@Override
	public List<Item> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXml();
		Session session = sessionFactory.openSession();
		
		// native query
		String sql = "SELECT * FROM MatHang"; //MaLoai, TenLoai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		return query.getResultList();
	}
	
	@Override
	public Item get(int id) {
		Item item = null;
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			
		} catch (Exception e) {
		}
		return session.get(Item.class, id);
	}
	
	@Override
	public List<ItemDto> getItemDto() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(Q_GET_ITEMS_BY_IGR);
		
		query.addScalar(ItemDto.IGR_ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemDto.IGR_NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemDto.IGR_ITEMS, StandardBasicTypes.LONG)
			 .setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		
		return safeList(query);
	}
	
	@Override
	public void save(Item item) {
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(item);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
	
	@Override
	public Item getFirstLevelCache(int id) {
		Item item = null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			Item i1 = session.get(Item.class, id);
			session.evict(i1);
			session.clear();
			session.contains(i1);
			System.out.println(i1);
			Item i2 = session.get(Item.class, id);
			System.out.println(i2);
		} catch (Exception e) {
			transaction.rollback();
		}
		return item;
	}
	
	@Override
	public Item getFirstLevelCacheInTwoSession(int id) {
		Item item = null;
		
		Session session1 = openSession();
		Session session2 = openSession();
		return null;
	}
	
	@Override
	public Item getSecondLevelCache(int id) {
		Session session1 = getCurrentSession();
		Session session2 = getCurrentSession();
		
		Transaction transaction = session1.beginTransaction();
		
		try {
			Item i1 = session1.get(Item.class, id);
			System.out.println("i1" + i1);
			Item i2 = session1.get(Item.class, id);
			System.out.println("i2" + i2);
			Item i3 = session1.get(Item.class, id);
			System.out.println("i3" + i3);
		} catch (Exception e) {
		}
		
		return null;
	}
	
}
