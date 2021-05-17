package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Order;


public class HibernateOrderDao extends EntityDao implements OrderDao {

	@Override
	public List<Order> getAll() {
		Session session = openSession();
		String sql = "SELECT * FROM DonHang";
		NativeQuery<Order> orders = session.createNativeQuery(sql, Order.class);
		return orders.getResultList();
	}

}
