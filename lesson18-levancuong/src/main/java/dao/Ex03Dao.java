package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.QueryProducer;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Ex03Dto;
import persistence.ItemDto;
import utils.HibernateUtils;

public class Ex03Dao {
	


	private static final String sql="SELECT mh.MaMH as "+ "igrId" +", mh.TenMH as "+ "igrName" +", sum(ctdh.SoLuong) as "+ " nofItems"
			+ " from mathang mh \r\n"
			+ "join loaihang lh on mh.MaLoai=lh.MaLoai \r\n"
			+ "join chitietdonhang ctdh on mh.MaMH = ctdh.MaMH\r\n"
			+ "group by mh.MaMH\r\n"
			+ "ORDER by ctdh.SoLuong DESC\r\n"
			+ "LIMIT 3;\r\n"
			+ "";

	public List<Ex03Dto> getTop3Dtos() {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		NativeQuery<?> query= session.createNativeQuery(sql);
		query.addScalar("igrId",StandardBasicTypes.INTEGER);
		query.addScalar("igrName",StandardBasicTypes.STRING);
		query.addScalar("nofItems",StandardBasicTypes.INTEGER);
		query.setResultTransformer(Transformers.aliasToBean(Ex03Dto.class));
		List<Ex03Dto> result=(List<Ex03Dto>) query.list();
		return result;
	}
}



