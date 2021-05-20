package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemDto;
import utils.HibernateUtils;

public class HibernateItemDao extends EntityDao implements ItemDao{
	
	private static final String Q_GET_ITEMS_BY_IGR = "SELECT lh.MaLoai AS "+ItemDto.IGR_ID+",\n"
			+ "	   lh.TenLoai AS "+ItemDto.IGR_NAME+",\n"
			+ "    SUM(kcmh.SoLuong) AS "+ItemDto.NOF_ITEMS+"\n"
			+ "FROM loaihang lh\n"
			+ "JOIN mathang mh\n"
			+ "ON lh.MaLoai=mh.MaLoai\n"
			+ "JOIN kichcomathang kcmh\n"
			+ "ON kcmh.MaMH=mh.MaMH\n"
			+ "GROUP BY lh.MaLoai";
	private static final String Q_GET_NUMBER_IT ="SELECT mh.MaMH AS "+ItemDto.IGR_ID+",\n"
			+ "	   mh.TenMH AS "+ItemDto.IGR_NAME+",\n"
			+ "       SUM(ctdh.SoLuong) AS "+ItemDto.NOF_ITEMS+"\n"
			+ " FROM mathang mh\n"
			
			+ "JOIN chitietdonhang ctdh ON mh.MaMH=ctdh.MaMH\n"
			+ "JOIN donhang dh ON ctdh.MaDH=dh.MaDH\n"
			+ "WHERE cast(dh.NgayTao AS YEAR) ='2020' \n"
			+ "GROUP BY mh.MaMH\n"
			+ "ORDER BY "+ItemDto.NOF_ITEMS+" DESC\n"
			+ "LIMIT 3";
	public List<Item> getAll() {
		Session session= openSession();
		
		String sql="SELECT * FROM MatHang";
		NativeQuery<Item> query= session.createNativeQuery(sql, Item.class);
		return query.getResultList();
	}
	public List<ItemDto> getItemDtos() {
		Session session=openSession();
		NativeQuery<?> query= session.createNativeQuery(Q_GET_ITEMS_BY_IGR);
		query.addScalar(ItemDto.IGR_ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemDto.IGR_NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemDto.NOF_ITEMS, StandardBasicTypes.LONG);
		query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		return safeList(query) ;
	}
	@Override
	public List<ItemDto> getNumberItem() {
		Session session=openSession();
		NativeQuery<?> query= session.createNativeQuery(Q_GET_NUMBER_IT);
		query.addScalar(ItemDto.IGR_ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemDto.IGR_NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemDto.NOF_ITEMS, StandardBasicTypes.LONG);
		query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		return safeList(query) ;
	}
}



