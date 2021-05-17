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

	private static final String Q_ITEMS_BY_IGR = "SELECT lh.MaLoai AS " + ItemDto.IGR_ID + ",\n" + "		lh.TenLoai "
			+ ItemDto.IGR_NAME + ",\n" + "		sum(kcmh.SoLuong) " + ItemDto.NOF_ITEMS + "      \n"
			+ "FROM loaihang lh\n" + "JOIN mathang mh \n" + "	ON lh.MaLoai = mh.MaLoai\n"
			+ "JOIN kichcomathang kcmh\n" + "	ON kcmh.MaMH = mh.MaMH\n" + "GROUP BY lh.MaLoai";

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
//		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXml();
//		Session session = sessionFactory.openSession();
		
		//demo proxy
		Item item = null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			item = session.get(Item.class, id);
			System.out.println("item: " + item);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
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
//		Session session = openSession();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			// not exist: save
			// exist: update
			// insert or update
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
			Item it1 = session.get(Item.class, id);
			System.out.println(it1);
			Item it2 = session.get(Item.class, id);
			System.out.println(it1);

			Item it3 = session.get(Item.class, 2);
			System.out.println("it3: " + it3);
		} catch (Exception e) {
			transaction.rollback();
		}
		return item;
	}

	@Override
	public Item getFirstLevelCacheInTwoSession(int id) {
		Item item = null;

		// session = single thead
		Session session1 = openSession();
		Session session2 = openSession();

		Item i1 = session1.get(Item.class, id);
		System.out.println("i1: " + i1);

		// clear cache
		session1.evict(i1);// clear one
		session1.clear(); // clear all

		// check wheter is object int persistance state
		session1.contains(i1);

		Item i2 = session1.get(Item.class, id);
		System.out.println("i2: " + i2);

		Item i3 = session2.get(Item.class, id);
		System.out.println("i3: " + i3);
		return item;
	}

	@Override
	public Item getSecondLevelCache(int id) {
		Item item = null;

		// session = single thead
		Session session1 = getCurrentSession();
		Session session2 = getCurrentSession();
		Transaction transaction = session1.beginTransaction();

		try {
			Item i1 = session1.get(Item.class, id);
			System.out.println("i1: " + i1);
			sleep(5);
			Item i2 = session1.get(Item.class, id);
			System.out.println("i2: " + i2);

			Item i3 = session2.get(Item.class, id);
			System.out.println("i3: " + i3);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return item;
	}

	private void sleep(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
