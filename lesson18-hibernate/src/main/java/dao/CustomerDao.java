package dao;

import java.util.List;

import persistence.Customer;

public interface CustomerDao {
	List<Customer> getAll();
}
