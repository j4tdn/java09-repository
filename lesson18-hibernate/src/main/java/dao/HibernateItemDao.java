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
		Session session = openSession();
		
		return session.get(Item.class, id);
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
}
