package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {
	private static final String sql = 
			"SELECT lh.MaLoai AS " + ItemGroupDto.IGR_ID + ",\r\n" +
	        "lh.TenLoai AS "+ ItemGroupDto.IGR_NAME + ",\r\n" + 
			"sum(kcmh.SoLuong) AS " + ItemGroupDto.TOTAL_OFIGR + "\r\n"+ 
	        "FROM MatHang mh\r\n" + 
			"JOIN LoaiHang lh\r\n" + 
	        "ON mh.MaLoai=lh.MaLoai\r\n"+ 
			"JOIN KichCoMatHang kcmh\r\n" + 
	        "ON kcmh.MaMH=mh.MaMH\r\n" + 
			"GROUP BY lh.MaLoai";

	@Override
	public List<ItemGroupDto> getItemGroupDto() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(sql);
		query.addScalar(ItemGroupDto.IGR_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemGroupDto.IGR_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.TOTAL_OFIGR, StandardBasicTypes.DOUBLE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(query);
	}

}
