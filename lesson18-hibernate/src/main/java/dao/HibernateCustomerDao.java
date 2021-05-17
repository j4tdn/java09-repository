package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Customer;

public class HibernateCustomerDao extends EntityDao implements CustomerDao {

	@Override
	public List<Customer> getAll() {
		Session session = openSession();
		String query = "SELECT * FROM KhachHang";
		NativeQuery<Customer> customers = session.createNativeQuery(query, Customer.class);
		return customers.getResultList();
	}

}
