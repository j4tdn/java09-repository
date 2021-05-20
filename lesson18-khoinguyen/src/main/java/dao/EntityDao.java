package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import utils.HirbernateUtils;

public class EntityDao {
	public Session openSession() {
		return HirbernateUtils.getSessionFactorXml().openSession();
	}
	public Session getCurrentSession() {
		return HirbernateUtils.getSessionFactorXml().getCurrentSession();
	}
	@SuppressWarnings("unchecked")
	<E> List<E> safeList(NativeQuery<?> query){
		return (List<E>)query.list();
	}
}