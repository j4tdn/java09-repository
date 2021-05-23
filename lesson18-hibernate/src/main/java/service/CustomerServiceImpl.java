package service;

import java.util.List;

import dao.CustomerDao;
import dao.HibernateCustomerDao;
import persistence.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	private static CustomerDao customerDao;
	
	static {
		customerDao = new HibernateCustomerDao();
	}
	
	@Override
	public List<Customer> getAll() {
		return customerDao.getAll();
	}

}
