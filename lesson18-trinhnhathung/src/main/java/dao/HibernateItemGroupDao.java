package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dto.ItemGroupDto;
import dto.ItemsOfItemGroupDto;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		Session session = openSession();
		String sql = "SELECT lh.MaLoai AS " + ItemGroupDto.IGR_ID
				+ ", lh.TenLoai AS " + ItemGroupDto.IGR_NAME
				+ ", SUM(kcmh.SoLuong) AS " + ItemGroupDto.IGR_QUANTITY + "\n"
				+ "FROM loaihang lh\n" + 
				"JOIN mathang mh ON lh.MaLoai = mh.MaLoai\n" + 
				"JOIN kichcomathang kcmh ON mh.MaMH = kcmh.MaMH\n" + 
				"GROUP BY lh.MaLoai";
		NativeQuery<?> query = session.createNativeQuery(sql);
		query.addScalar(ItemGroupDto.IGR_ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemGroupDto.IGR_NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemGroupDto.IGR_QUANTITY, StandardBasicTypes.INTEGER);
		query.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(query);
	}

	@Override

	public List<ItemsOfItemGroupDto> getItemsOfItemGroupDtos() {
		Session session = openSession();
		String sql = "SELECT lh.MaLoai AS " + ItemsOfItemGroupDto.IGR_ID + ", lh.TenLoai AS "
				+ ItemsOfItemGroupDto.IGR_NAME + ", mh.MaMH AS " + ItemsOfItemGroupDto.ITEM_ID + ", mh.TenMH AS "
				+ ItemsOfItemGroupDto.ITEM_NAME + ",mh.GiaBan AS " + ItemsOfItemGroupDto.SALE_PRICE + ", mh.GiaMua AS "
				+ ItemsOfItemGroupDto.BUY_PRICE + ", SUM(kcmh.SoLuong) AS " + ItemsOfItemGroupDto.QUANTITY + "\n"
				+ "FROM loaihang lh\n" + "JOIN mathang mh ON lh.MaLoai = mh.MaLoai\n"
				+ "JOIN kichcomathang kcmh ON mh.MaMH = kcmh.MaMH\n" + "GROUP BY mh.MaMH";
		NativeQuery<?> query = session.createNativeQuery(sql);

		query.addScalar(ItemsOfItemGroupDto.IGR_ID, StandardBasicTypes.INTEGER);
		query.addScalar(ItemsOfItemGroupDto.IGR_NAME, StandardBasicTypes.STRING);
		query.addScalar(ItemsOfItemGroupDto.ITEM_ID, StandardBasicTypes.INTEGER);
		query.addScalar(ItemsOfItemGroupDto.ITEM_NAME, StandardBasicTypes.STRING);
		query.addScalar(ItemsOfItemGroupDto.SALE_PRICE, StandardBasicTypes.DOUBLE);
		query.addScalar(ItemsOfItemGroupDto.BUY_PRICE, StandardBasicTypes.DOUBLE);
		query.addScalar(ItemsOfItemGroupDto.QUANTITY, StandardBasicTypes.INTEGER);
		query.setResultTransformer(Transformers.aliasToBean(ItemsOfItemGroupDto.class));
		return safeList(query);
	}
}
