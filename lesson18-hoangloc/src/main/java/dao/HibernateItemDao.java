package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemDto;



public class HibernateItemDao extends EntityDao implements ItemDao {


	// Hôm sau đặt tên project đúng chính tả. Cẩn thận
	// Làm đoàng hoàng từng chữ.
	
	// Câu 4: Câu này làm DTO cũng dc. Nhưng e có thể trả về Entity Item hoặc ItemGround
	// Đỡ mất công ngồi addScalar từng dòng
	// Copy SQL từ workbench phải xóa \r
	private static final String Q_GET_ITEMS = "select\r\n" + 
			"lh.MaLoai AS " + ItemDto.Item_ID + " ,\r\n" + 
			"lh.TenLoai AS " + ItemDto.Item_NAME + " ,\r\n" + 
			"mh.MaMH AS " + ItemDto.Igr_ID + " ,\r\n" + 
			"mh.TenMH AS " + ItemDto.Igr_NAME + " ,\r\n" + 
			"mh.GiaBan AS " + ItemDto.Igr_PRICESALE + " ,\r\n" + 
			"mh.GiaMua AS " + ItemDto.Igr_PRICEBY + " ,\r\n" + 
			"kcmh.SoLuong AS " + ItemDto.Igr_TOTAL + " \r\n" + 
			"from loaihang lh\r\n" + 
			"join mathang mh\r\n" + 
			"on lh.MaLoai = mh.MaLoai \r\n" + 
			"join kichcomathang kcmh\r\n" + 
			"on mh.MaMH = kcmh.MaMH\r\n" + 
			"group by mh.MaMH";

	
	public List<Item> getAll() {
		Session session = openSession();
		String sql = "select * from MatHang";
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);

		return query.getResultList();
	}



	public List<ItemDto> getItemDto() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(Q_GET_ITEMS, ItemDto.class);

		   query
				.addScalar(ItemDto.Item_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.Item_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDto.Igr_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.Igr_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDto.Igr_PRICEBY, StandardBasicTypes.DOUBLE)
				.addScalar(ItemDto.Igr_PRICESALE, StandardBasicTypes.DOUBLE)
				.addScalar(ItemDto.Igr_TOTAL, StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));

		return safeList(query);
	}


	

	
	
	

}
