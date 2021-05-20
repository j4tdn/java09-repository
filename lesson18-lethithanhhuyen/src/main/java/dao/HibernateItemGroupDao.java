package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;
import persistence.ItemGroupDto;
import utils.HibernateUtils;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

	public List<ItemGroupDto> getItemGroupDtos() {
		Session session = openSession();

		final String IGR_BY_AMOUNT_STOCK = 
				"select lh.MaLoai AS "+ ItemGroupDto.IGR_ID + ",\n" 
				+ "	   lh.TenLoai AS "+ ItemGroupDto.IGR_NAME + ",\n"  
				+ "       sum(kcmh.SoLuong) AS "+ ItemGroupDto.AMOUNT_STOCK + "\n"  
				+ "from mathang mh\n" 
				+ "join kichcomathang kcmh\n"  
				+ "	on mh.MaMH = kcmh.MaMH\n"  
				+ "join loaihang lh\n" 
				+ "	on lh.MaLoai = mh.MaLoai\n"  
				+ "group by lh.MaLoai";
		
		NativeQuery<ItemDto> query = session.createNativeQuery(IGR_BY_AMOUNT_STOCK);
		
		query.addScalar(ItemGroupDto.IGR_ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemGroupDto.IGR_NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemGroupDto.AMOUNT_STOCK, StandardBasicTypes.LONG);
		
		query.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(query);
	}
}
