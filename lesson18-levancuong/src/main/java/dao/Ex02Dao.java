package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.QueryProducer;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;
import utils.HibernateUtils;

public class Ex02Dao {
	
	private static final String Q_ITEMS_QTY = "SELECT lh.MaLoai AS " + "igrId" + ",\n" + 
			"		lh.TenLoai " + "igrName" + ",\n" + 
			"		sum(kcmh.SoLuong) " + "nofItems" + "\n" + 
			"FROM LoaiHang lh\n" + 
			"JOIN mathang mh\n" + 
			"	ON lh.MaLoai = mh.MaLoai\n" + 
			"JOIN KichCoMatHang kcmh\n" + 
			"	ON kcmh.MaMH = mh.MaMH\n" + 
			"GROUP BY lh.MaLoai;";




	public List<ItemDto> getItemDtos() {
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		NativeQuery<?> query= session.createNativeQuery(Q_ITEMS_QTY);
		query.addScalar("igrId",StandardBasicTypes.INTEGER);
		query.addScalar("igrName",StandardBasicTypes.STRING);
		query.addScalar("nofItems",StandardBasicTypes.INTEGER);
		query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		List<ItemDto> result=(List<ItemDto>) query.list();
		return result;
	}



}
