package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import persistence.Customer;

public class CustomerDAO {
	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
			.buildSessionFactory();

	// thêm 1 đối tượng customer vào bảng customer
	void insert(Customer customer) {
		Session session = sessionFactory.openSession();

		try {
			// bắt đầu 1 giao dịch
			session.beginTransaction();

			// thực thi câu query dạng hql
			session.save(customer);

			// kết thúc 1 giao dịch
			session.getTransaction().commit();

			System.out.println("insert success!");
		} catch (RuntimeException e) {

			// nếu có lỗi thì trở về trạng thái lúc chưa bắt đầu giao dịch.
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

	// hiển thị tất cả các đối tượng customer có trong bảng customer
	void showAll() {
		Session session = sessionFactory.openSession();
		try {
			// bắt đầu 1 transaction (giao dịch)
			session.beginTransaction();

			// thực thi câu query dạng hql
			List<Customer> list = session.createQuery("from Customer").list();
			for (Customer customer : list) {
				System.out.println(customer.getIdcustomer() + "  "
						+ customer.getName() + "   " + customer.getAddress());
			}
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

	//sửa tên của customer có id =id
	void updateName(int id, String name) {
		Session session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			String hqlUpdate = "update Customer u set u.name = :newName where u.idcustomer = :oldId";
			session.createQuery(hqlUpdate).setString("newName", name)
					.setInteger("oldId", id).executeUpdate();

			session.getTransaction().commit();
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

	//sửa thông tin của customer
	void updateAll(Customer customer) {
		Session session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.update(customer);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

	
	//xóa 1 customer khỏi bảng customer
	void delete(Customer Customer) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();

			session.delete(Customer);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

	
	//tìm tất cả các customer có chứa từ cần tìm kiếm
	void searchByName(String name) {
		Session session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			List<Customer> list = session
					.createQuery("from Customer where name like :name")
					.setParameter("name", "%" + name + "%").list();
			for (Customer customer : list) {
				System.out.println(customer);
			}
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

}
