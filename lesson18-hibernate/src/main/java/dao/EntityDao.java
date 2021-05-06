package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import utils.HibernateUtil;

public class EntityDao {
    Session openSession () {
		return HibernateUtil.getSessionFactory().openSession();
	}
    
    @SuppressWarnings("unchecked")
	<E> List<E> safeList (NativeQuery<?> query){
    	return (List<E>) query.list();
    }
}
