package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao{
	private static String SQL_ITEMS_BY_REMAIN = "select lh.MaLoai as " + ItemGroupDto.ID + ",\r\n" + 
			"lh.TenLoai as " + ItemGroupDto.NAME + ",\r\n" + 
			"sum(kcmh.soluong) as " + ItemGroupDto.QUANTITY + "\r\n" + 
			" from loaihang lh\r\n" + 
			"join mathang mh\r\n" + 
			"on lh.MaLoai = mh.MaLoai\r\n" + 
			"join kichcomathang kcmh\r\n" + 
			"on kcmh.MaMH = mh.MaMH\r\n" + 
			"group by lh.MaLoai;";
	
	@Override
	public List<ItemGroupDto> getItemGroupByRemain() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(SQL_ITEMS_BY_REMAIN);
		
		query.addScalar("id", StandardBasicTypes.INTEGER)
			 .addScalar("name", StandardBasicTypes.STRING)
			 .addScalar("quantity", StandardBasicTypes.INTEGER)
			 .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(query);
	}

	@Override
	public List<ItemGroup> getAllItemGroupDetail() {
		Session session = openSession();
		// native query
		String sql = "SELECT * FROM LoaiHang"; //MaLoai, TenLoai
		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		return query.getResultList();
	}

}
