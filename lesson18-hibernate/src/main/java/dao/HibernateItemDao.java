package dao;

import java.util.List;

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
		Session session = openSession();
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
}
