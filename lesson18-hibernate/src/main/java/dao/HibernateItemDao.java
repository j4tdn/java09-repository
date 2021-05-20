package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemDto;

public class HibernateItemDao extends EntityDao implements ItemDao {

	private static final String Q_GET_ITEMS_BY_IGR = "select lh.MaLoai AS " + ItemDto.IGR_ID + ",\n"
			+ "		lh.TenLoai AS " + ItemDto.IGR_NAME + ",\n" + "        sum(kcmh.SoLuong) " + ItemDto.NOF_ITEMS
			+ " \n" + "from loaihang lh\n" + "join mathang mh\n" + "on lh.maloai=mh.maloai\n"
			+ "join kichcomathang kcmh\n" + "on kcmh.mamh=mh.mamh\n" + "group by lh.maloai";

	@Override
	public List<Item> getAll() {
		Session session = openSession();
		String sql = "select * from MatHang";
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);

		return query.getResultList();
	}

	@Override
	public Item get(int id) {

		return openSession().get(Item.class, id);
	}

	@Override
	public List<ItemDto> getItemDto() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(Q_GET_ITEMS_BY_IGR, ItemDto.class);

		query.addScalar(ItemDto.IGR_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.IGR_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDto.NOF_ITEMS, StandardBasicTypes.LONG)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));

		return safeList(query);
	}

	@Override
	public void save(Item item) {
		Session session = openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
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
			System.out.println("i1" + i1);

			Item i2 = session.get(Item.class, id);
			System.out.println("i2" + i2);
			
			Item i3 = session.get(Item.class, id);
			System.out.println("i3" + i3);

		} catch (Exception e) {
			e.printStackTrace();
		}
		

		return item;
	}
	
	@Override
	public Item getFirstLevelCacheInTwoSessions(int id) {
		
		Item item=null;
		
		Session session1 = openSession();
		Session session2 = openSession();
		
		Item i1=session1.get(Item.class,id);
		System.out.println("i1" + i1);
		session1.evict(i1);
		
		session1.contains(i1);
		
		Item i2=session1.get(Item.class,id);
		System.out.println("i1" + i2);
		
		Item i3=session2.get(Item.class,id);
		System.out.println("i1" + i3);

		return item;
	}

}
