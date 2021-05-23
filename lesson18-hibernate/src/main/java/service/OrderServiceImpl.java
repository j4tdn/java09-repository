package service;

import java.util.List;

import dao.HibernateOrderDao;
import dao.OrderDao;
import persistence.Order;

public class OrderServiceImpl implements OrderService {
	
	private static OrderDao orderDao;
	
	static {
		orderDao =  new HibernateOrderDao();
	}
	
	@Override
	public List<Order> getAll() {
		return orderDao.getAll();
	}
	
}
