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
	
	private static final String Q__GET_ITEMS_BY_IGR =
			"	select  lh.maloai as "	+ ItemDto.IGR_ID + ", \n" + 
			"			lh.tenloai as "	+ ItemDto.IGR_NAMe + ", \n" + 
			"			sum(kcmh.soluong) "	+ ItemDto.IGR_ITEMS + " 	 \n" + 
			"	from	loaihang lh \n" + 
			"	join  	Mathang mh \n" + 
			"			on lh.MaLoai = mh.MaLoai \n" + 
			"	join 	kichcomathang kcmh \n" + 
			"			on kcmh.MaMH = mh.mamh \n" + 
			"	GROUP BY lh.MaLoai        ";
	
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
		return openSession().get(Item.class, id);
	}

	@Override
	public List<ItemDto> getItemDtos() {
		Session session = openSession();
		
		 NativeQuery<?> query = session.createNativeQuery(Q__GET_ITEMS_BY_IGR);
		
		 query.addScalar(ItemDto.IGR_ID,StandardBasicTypes.INTEGER)
		 .addScalar(ItemDto.IGR_NAMe,StandardBasicTypes.STRING)
		 .addScalar(ItemDto.IGR_ITEMS,StandardBasicTypes.LONG).setResultTransformer(Transformers.aliasToBean(ItemDto.class));
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
	

}
