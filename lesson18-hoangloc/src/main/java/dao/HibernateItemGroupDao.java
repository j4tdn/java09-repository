package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;
import persistence.ItemGroup;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {
	
	// Làm xong phải format lại code cẩn thận
	// MaLoai mà sao lại tạo alias với Item_ID (MaMH)
	private static final String Q_GET_ITEMS_AND_TOTAL ="	select  lh.maloai as " 
			+ ItemDto.Item_ID + ", \n"
			+ "			lh.tenloai as " + ItemDto.Item_NAME + ", \n" + "			sum(kcmh.soluong) " 
			+ ItemDto.Igr_TOTAL
			+ " 	 \n" + "	from	loaihang lh \n" + "	join  	Mathang mh \n"
			+ "			on lh.MaLoai = mh.MaLoai \n" + "	join 	kichcomathang kcmh \n"
			+ "			on kcmh.MaMH = mh.mamh \n" + "	GROUP BY lh.MaLoai        ";

	public List<ItemGroup> getAll() {
		Session session = getCurrentSession();
		String sql="select * from LoaiHang";
	 	NativeQuery<ItemGroup> query= session.createNativeQuery(sql, ItemGroup.class);


		return query.getResultList();
	}
	
	// Câu 3: Kết quả yêu cầu trả về là List<String> Tên Mặt Hàng
	// Đọc kỹ đề trước khi làm
	public List<ItemDto> getItemAndToTal() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(Q_GET_ITEMS_AND_TOTAL, ItemDto.class);

		   query
				.addScalar(ItemDto.Item_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.Item_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDto.Igr_TOTAL, StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));

		return safeList(query);
	}

	

}
