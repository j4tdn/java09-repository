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
import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemDao extends EntityDao implements ItemDao {

	private static final String Q__GET_ITEMS_BY_IGR = "	select  lh.maloai as " + ItemDto.IGR_ID + ", \n"
			+ "			lh.tenloai as " + ItemDto.IGR_NAMe + ", \n" + "			sum(kcmh.soluong) " + ItemDto.IGR_ITEMS
			+ " 	 \n" + "	from	loaihang lh \n" + "	join  	Mathang mh \n"
			+ "			on lh.MaLoai = mh.MaLoai \n" + "	join 	kichcomathang kcmh \n"
			+ "			on kcmh.MaMH = mh.mamh \n" + "	GROUP BY lh.MaLoai        ";

	public List<Item> getAll() {
		SessionFactory sesionFactory = HibernateUtils.getSessionFactoryXml();
		Session session = sesionFactory.openSession();
		// sesionFactory.getCurrentSession();

		// native query, JPA/HQL
		String sql = "Select * from mathang";// maloai tenloai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);

		return query.getResultList();

	}

	@Override
	public Item get(int id) {
//		SessionFactory sesionFactory = HibernateUtils.getSessionFactoryJava();
//		Session session = sesionFactory.openSession();
		
		//demo proxy
		Item item=null;
		Session session = getCurentSession();
		Transaction transacsion = session.beginTransaction();
		try {
			item =session.get(Item.class, id);
			System.out.println("Item: "+item);
			transacsion.commit();
		
		} catch (Exception e) {
			// TODO: handle exception
			transacsion.rollback();
		}
		return item;
	}

	@Override
	public List<ItemDto> getItemDtos() {
		Session session = openSession();

		NativeQuery<?> query = session.createNativeQuery(Q__GET_ITEMS_BY_IGR);

		query.addScalar(ItemDto.IGR_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.IGR_NAMe, StandardBasicTypes.STRING)
				.addScalar(ItemDto.IGR_ITEMS, StandardBasicTypes.LONG)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		return safelist(query);

	}

	@Override
	public void save(Item item) {
		Session session = getCurentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(item);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.rollback();
		}
		openSession().save(item);

	}

	@Override
	public Item getFirstLevelCache(int id) {
		// TODO Auto-generated method stub
		Item item = null;
		Session session = getCurentSession();
		
		Transaction transaction = session.beginTransaction();
		try {
			Item i1= session.get(Item.class,id);
			System.out.println("i1"+i1);
			
			Item i2= session.get(Item.class,id);
			System.out.println("i2"+i2);
			
			Item i3= session.get(Item.class,2);
			System.out.println("i3"+i3);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		
		
		return item;
	}

	@Override
	public Item getFirstLevelCacheInTwoSession(int id) {
		Item item = null;
		
		Session session1 = openSession();
		Session session2 = openSession();
		
		Item i1= session1.get(Item.class,id);
		System.out.println("i1"+i1);
		
		//clear cache 
		//session1.evict(i1);session1.clear();
		
		//check whether is object in persistence state 
		session1.contains(i1);
		
		Item i2= session2.get(Item.class,id);
		System.out.println("i2"+i2);
		
		Item i3= session2.get(Item.class,id);
		System.out.println("i3"+i3);
		return item;
	}
	public Item getSecondLevelCache(int id) {
		Item item = null;
		
		Session session1 = getCurentSession();
		Session session2 = getCurentSession();
		Transaction transaction1 = session1.beginTransaction();
		//Transaction transact	ion2 = session2.beginTransaction();
		transaction1.commit();
		//hibernate
		try {
			Item i1= session1.get(Item.class,id);
			System.out.println("i1"+i1);
			
			sleep(5);
			
			Item i2= session1.get(Item.class,id);
			System.out.println("i2"+i2);
			
			Item i3= session2.get(Item.class,id);
			System.out.println("i3"+i3);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction1.rollback();
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
