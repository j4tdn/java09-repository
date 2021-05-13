package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import utils.HibernateUtil;

public class EntityDao {
    public Session openSession () {
		return HibernateUtil.getSessionFactory().openSession();
	}
    
    public Session getCurrentSession () {
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}
    
    @SuppressWarnings("unchecked")
	public <E> List<E> safeList (NativeQuery<?> query){
    	return (List<E>) query.list();
    }
}
