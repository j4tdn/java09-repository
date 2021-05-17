package dao;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persitence.Item;
import persitence.ItemDto;
import persitence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemDao extends EntityDao implements ItemDao {
	
	private static final String Q_ITEMS_BY_QTY = 
			"SELECT lh.MaLoai AS "+ ItemDto.IGR_ID+",\n"  
			+"	   lh.TenLoai AS "+ ItemDto.IGR_NAME+",\n"  
			+"       Sum(kcmh.soluong)AS "+ ItemDto.IGR_ITEMS +" \n"
			+"FROM LoaiHang lh\n"  
			+"Join MatHang mh\n"  
			+"	on lh.maloai = mh.maloai\n"  
			+"Join kichcomathang kcmh \n"  
			+"    on kcmh.mamh = mh.mamh\n"  
			+"Group by lh.maloai"  ;
	public List<Item> getAll() {
		Session session = openSession();
		String sql = "SELECT * FROM MatHang"; // MaLoai, TenLoai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		query.getResultList();
		return query.getResultList();
	}
	@Override
	public Item get(int id) {
		Item item = null;
		
		Session session = getCurrentSession();
		
		return session.get(Item.class, id);
	}
	@Override
	public List<ItemDto> getItemDto() {
		Session session = openSession();
		NativeQuery<?> query =session.createNativeQuery(Q_ITEMS_BY_QTY);
		
		query.addScalar(ItemDto.IGR_ID,StandardBasicTypes.INTEGER)
			.addScalar(ItemDto.IGR_NAME,StandardBasicTypes.STRING)
			.addScalar(ItemDto.IGR_ITEMS,StandardBasicTypes.LONG);
		query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		
		
		return safeList(query);
	}
	@Override
	public void save(Item item) {
		Session session = getCurrentSession();
		session.save(item);
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(item);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		openSession().save(item);
	}
	@Override
	public Item getFirstlevelCache(int id) {
		Item item = null;
		Session session = getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		try {
			Item i1= session.get(Item.class, id);
			System.out.println("i1:" + i1);
			
			Item i2= session.get(Item.class, id);
			System.out.println("i2:" +i2);
			
			Item i3= session.get(Item.class, 2);
			System.out.println("i3:" +i3);
		} catch (Exception e) {
			transaction.rollback();
		}
		return item;
	}
	@Override
	public Item getFirstlevelCacheTwoSessions(int id) {
		Item item = null;
		//session = single thread
		Session session1 = openSession();
		Session session2 = openSession();
		
		
		Item i1 = openSession().get(Item.class, id);
		System.out.println("i1:" + i1);
		
		session1.evict(i1);
		session1.clear();
		session1.contains(i1);
		
		Item i2 = openSession().get(Item.class, id);
		System.out.println("i2:" + i2);
		
		Item i3 = openSession().get(Item.class, id);
		System.out.println("i3:" + i3);
		return item;
	}
		@Override
		public Item getSecondlevelCache(int id) {
			Item item = null;
			//session = single thread
			Session session1 = getCurrentSession();
			Session session2 = getCurrentSession();
			
			Transaction transaction = session1.beginTransaction();
			try {
				Item i1 = session1.get(Item.class, id);
				System.out.println("i1:" + i1);
				
				
				sleep(5);
				Item i2 = session2.get(Item.class, id);
				System.out.println("i2:" + i2);

				Item i3 = session2.get(Item.class, 2);
				System.out.println("i3:" + i3);
				
				transaction.commit();
				
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
