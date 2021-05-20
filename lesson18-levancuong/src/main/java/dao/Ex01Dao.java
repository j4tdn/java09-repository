package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.QueryProducer;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Ex01Dto;
import persistence.ItemDto;
import utils.HibernateUtils;

public class Ex01Dao {
	
	private static final String sql = "";


	public List<Ex01Dto> getItemDtos() {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		NativeQuery<?> query= session.createNativeQuery(sql);
		query.addScalar("igrId",StandardBasicTypes.INTEGER);
		query.addScalar("igrName",StandardBasicTypes.STRING);
		query.addScalar("nofItems",StandardBasicTypes.INTEGER);
		query.setResultTransformer(Transformers.aliasToBean(Ex01Dto.class));
		List<Ex01Dto> result=(List<Ex01Dto>) query.list();
		return result;
	}



}
