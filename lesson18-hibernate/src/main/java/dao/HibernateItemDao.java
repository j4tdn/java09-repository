package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemDetail;
import persistence.ItemDto;

public class HibernateItemDao extends EntityDao implements ItemDao {

	private static final String Q_GET_ITEMS_BY_IGR = "SELECT lh.MaLoai AS " + ItemDto.IGR_ID + ",\n"
			+ "		lh.TenLoai AS " + ItemDto.IGR_NAME + ",\n" + "        SUM(kcmh.SoLuong) AS " + ItemDto.NOF_ITEMS
			+ "\n" + "FROM loaihang lh\n" + "JOIN mathang mh ON lh.MaLoai = mh.MaLoai\n"
			+ "JOIN kichcomathang kcmh ON kcmh.MaMH = mh.MaMH\n" + "GROUP BY lh.MaLoai";

	@Override
	public List<Item> getAll() {
		Session session = openSession();
		String sql = "SELECT * FROM MatHang";
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		return query.getResultList();
	}

	@Override
	public Item get(int id) {
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
	public List<Item> getByBuyPrice(int buyPrice) {
		String sql = "SELECT * FROM mathang WHERE GiaBan = :buyPrice";
		Session session = openSession();
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		query.setParameter("buyPrice", buyPrice);
		return query.getResultList();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<ItemDto> getItemDtos() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(Q_GET_ITEMS_BY_IGR);
		query.addScalar(ItemDto.IGR_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.IGR_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDto.NOF_ITEMS, StandardBasicTypes.LONG);
		query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));

		return safeList(query);
	}

	// getCurrentSession : require transaction (exception when there is not
	// transaction)
	// openSession : non-require transaction,but there must be a transaction for
	// save method to work
	@Override
	public void save(Item item) {
		Session session = getCurrentSession();
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
		Item item = null;
		Session session = getCurrentSession();

		Transaction transaction = session.beginTransaction();

		try {
			Item i1 = session.get(Item.class, id);
			System.out.println("i1:" + i1);
			Item i2 = session.get(Item.class, id);
			System.out.println("i2:" + i2);
			Item i3 = session.get(Item.class, 2);
			System.out.println("i3:" + i3);
		} catch (Exception e) {
			transaction.rollback();
		}

		return item;
	}

	@Override
	public Item getFirstLevelCacheInTwoSessions(int id) {
		Item item = null;
		Session session1 = openSession();
		Session session2 = openSession();

		Item i1 = session1.get(Item.class, id);
		System.out.println("i1:" + i1);

//		session1.evict(i1);
//		session1.clear();
		// check whether is object in persistance state
		// session1.contains(i1);

		Item i2 = session1.get(Item.class, id);
		System.out.println("i2:" + i2);

		Item i3 = session2.get(Item.class, id);
		System.out.println("i3:" + i3);

		// if use getCurrentSession() , both two sessions are one

		return item;
	}

	@Override
	public Item getSecondLevelCache(int id) {
		Item item = null;
		Session session1 = getCurrentSession();
		Session session2 = getCurrentSession();
		Transaction transaction = session1.beginTransaction();

		try {
			Item i1 = session1.get(Item.class, id);
			System.out.println("i1:" + i1);

			Item i2 = session1.get(Item.class, id);
			System.out.println("i2:" + i2);

			Item i3 = session2.get(Item.class, id);
			System.out.println("i3:" + i3);

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

		return item;
	}
}
