package dao;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

	private static final String Q_ITEMS_QTY = "SELECT lh.MaLoai AS " + ItemDto.IGR_ID + ",\n" + 
											"		lh.TenLoai " + ItemDto.IGR_NAME + ",\n" + 
											"		sum(kcmh.SoLuong) " + ItemDto.NOF_ITEMS + "\n" + 
											"FROM LoaiHang lh\n" + 
											"JOIN mathang mh\n" + 
											"	ON lh.MaLoai = mh.MaLoai\n" + 
											"JOIN KichCoMatHang kcmh\n" + 
											"	ON kcmh.MaMH = mh.MaMH\n" + 
											"GROUP BY lh.MaLoai;";
	@Override
	public List<Item> getAll() {
		Session session = openSession();
		
		String sql = "SELECT * FROM MatHang mh\n"
				+ "JOIN LoaiHang lh ON mh.MaLoai = lh.MaLoai \n";
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		
		return query.getResultList();
	}

	@Override
	public Item get(int id) {
		// demo proxy
		Item item = null;
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			item = session.get(Item.class, id);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		
		return item;
	}
	
	@Override
	public List<ItemDto> getItemDtos() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(Q_ITEMS_QTY);
		
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
			session.save(item);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
	
	@Override
	public Item getFirstLevelCache(int id) {
		Item i1 = null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		i1 = session.get(Item.class, id);
		System.out.println("i1: " + i1);
		
		Item i2 = session.get(Item.class, id + 1);
		System.out.println("i2: " + i2);
		
		transaction.commit();
		
		return i1;
	}
	
	@Override
	public Item getFirstLevelCacheIn2Session(int id) {
		Item item = null;
		
		Session session1 = openSession();
		Session session2 = openSession();
		
		Item i1 = session1.get(Item.class, id);
		System.out.println("i1: " + i1);

		// delete out 1st level cache
		//session1.evict(i1);
		Item i2 = session1.get(Item.class, id);
		System.out.println("i2: " + i2);
		
		Item i3 = session2.get(Item.class, id);
		System.out.println("i3: " + i3);
		
		return null;
	}
	
	@Override
	public Item getSecondLevelCache(int id) {
		Item item = null;
		
		Session session1 = openSession();
		Session session2 = openSession();
		
//		Transaction transaction1 = session1.beginTransaction();
//		Transaction transaction2 = session2.beginTransaction();
		
		Item i1 = session1.get(Item.class, id);
		System.out.println("i1: " + i1);
		

		// delete out 1st level cache
		//session1.evict(i1);
		Item i2 = session1.get(Item.class, id);
		System.out.println("i2: " + i2);
		
//		sleep(5);
		Item i3 = session2.get(Item.class, id);
		System.out.println("i3: " + i3);
		
//		transaction1.commit();
//		transaction2.commit();
		
		return null;
	}
	
	private void sleep(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
