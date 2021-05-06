package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import utils.HibernateUtils;

public class EntityDao {
	public static Session openSession() {
		return HibernateUtils.getSessionFactoryXml().openSession();
	}
	
	@SuppressWarnings("unchecked")
	<E> List<E> safeList(NativeQuery<?> query ){
		
		return (List<E>) query.list();
	}
}
