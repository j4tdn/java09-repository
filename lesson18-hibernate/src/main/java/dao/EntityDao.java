package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import utils.HibernateUtils;

public class EntityDao {
	public Session openSession() {
		return HibernateUtils.getSessionFactory().openSession();
	}

	public Session getCurrentSession() {
		return HibernateUtils.getSessionFactory().getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	<E> List<E> safeList(NativeQuery<?> query){
		return (List<E>) query.list();
	}
}
