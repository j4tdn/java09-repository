package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import persistence.Item;
import utils.HibernateUtils;
public class HibernateItemDao extends EntityDao implements ItemDao {
	private static final String Q_ITEMS_QTY_BY_GROUP = 
			"SELECT MH.MaMH AS " + Item.itemId + ",\n"
			+ "FROM MATHANG MH \n "
			+ "JOIN chitietdonhang CTDH \n"
			 + " ON MH.MaMH = CTDH.MaMH \n"
			+ " JOIN  DONHANG DH \n"
			   + "  ON DH.MADH = CTDH.MaDH \n"
			+" WHERE CAST(DH.NGAYTAO AS DATE ) = '2019-11-23' \n ";
	
	public List<Item> getAll() {
		Session session = openSession();
		
		String sql = "SELECT * FROM MatHang"; 
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		return query.getResultList();
	}

	@Override
	public Item get(int id) {
		return openSession().get(Item.class, id);
	}

	@Override
	public List<Item> getItem() {
		Session session = openSession();
		NativeQuery<Item> query = session.createNativeQuery(Q_ITEMS_QTY_BY_GROUP);
		return null;
		
	}
}