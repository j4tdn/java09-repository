package dao;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.transform.Transformer;

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

	private static final String Q_ITEMS_QTY_BY_GROUP = 
			"SELECT lh.MaLoai AS " + ItemDto.IGR_ID + ",\n" 
			+ "	   lh.TenLoai AS "+ ItemDto.IGR_NAME +",\n"  
			+ "       SUM(kcmh.SoLuong) AS "+ ItemDto.NOF_ITEMS +"\n"  
			+ "FROM LoaiHang lh\n" 
			+ "JOIN MatHang mh\n"  
			+ "	ON lh.MaLoai = mh.MaLoai\n"  
			+ "JOIN kichcomathang kcmh\n" 
			+ "	ON kcmh.MaMH = mh.MaMH\n" 
			+ "GROUP BY lh.MaLoai";
	
	public List<Item> getAll() {
		Session session = openSession();
		
		//native query 
		String sql = "SELECT * FROM MatHang"; //MaLoai, TenLoai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		return query.getResultList();
	}
	
	@Override
	public Item get(int id) {
		//demo proxy
		
		Item item = null;
		Session session = getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		try {
			item = session.get(Item.class, id);
			System.out.println("item: " + item);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		
		return item;
	}

	@Override
	public List<ItemDto> getItemDtos() {
		Session session = openSession();
		NativeQuery<ItemDto> query = session.createNativeQuery(Q_ITEMS_QTY_BY_GROUP);
		
		query.addScalar(ItemDto.IGR_ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemDto.IGR_NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemDto.NOF_ITEMS, StandardBasicTypes.LONG);
		
		query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		return safeList(query);
	}

	@Override
	public void save(Item item) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			// not exist: save
			// exist: update
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
		System.out.println("i1: " + i1);
		
		Item i2 = session.get(Item.class, id);
		System.out.println("i2" + i2);
		
		Item i3 = session.get(Item.class, 2);
		System.out.println("i3: " + i3);
		} catch (Exception e) {
			transaction.rollback();
		}
		
		return item;
	}

	@Override
	public Item getFirstLevelCacheInTwoSessions(int id) {
		Item item = null;
		
		//session = single thread
		Session session1 = openSession();
		Session session2 = openSession();
		
		Item i1 = session1.get(Item.class, id);
		System.out.println("i1: " + i1);
		
		//clear cache
		session1.evict(i1);
		
		Item i2 = session1.get(Item.class, id);
		System.out.println("i2" + i2);
		
		Item i3 = session2.get(Item.class, 2);
		System.out.println("i3: " + i3);
		
		return item;
	}

	@Override
	public Item getSecondLevelCache(int id) {
		Item item = null;
		
		//session = single thread
		Session session1 = getCurrentSession();
		Session session2 = getCurrentSession();
		
		Transaction transaction = session1.beginTransaction();
		try {
			Item i1 = session1.get(Item.class, id);
			System.out.println("i1: " + i1);
			
			Item i2 = session1.get(Item.class, id);
			System.out.println("i2" + i2);
			
			Item i3 = session2.get(Item.class, 2);
			System.out.println("i3: " + i3);
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} 
		
		return item;
	}

	private void sleep(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
