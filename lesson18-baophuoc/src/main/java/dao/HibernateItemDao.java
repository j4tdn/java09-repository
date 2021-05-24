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
import persistence.ItemWithSizeDto;
import utils.HibernateUtils;

public class HibernateItemDao extends EntityDao implements ItemDao{
	
	// Câu 2: Code xong format lại
	private static final String Q_GET_ITEMS_BY_IGR = "SELECT lh.MaLoai AS "+ItemDto.IGR_ID+",\n"
			+ "	   lh.TenLoai AS "+ItemDto.IGR_NAME+",\n"
			+ "    SUM(kcmh.SoLuong) AS "+ItemDto.NOF_ITEMS+"\n"
			+ "FROM loaihang lh\n"
			+ "JOIN mathang mh\n"
			+ "ON lh.MaLoai=mh.MaLoai\n"
			+ "JOIN kichcomathang kcmh\n"
			+ "ON kcmh.MaMH=mh.MaMH\n"
			+ "GROUP BY lh.MaLoai";
			
	// YEAR là tham số truyền vào
	// Không được fix cứng. Đặt tên trên vấn lại >> Q_GET_NUMBER_IT << 
	private static final String Q_GET_NUMBER_IT ="SELECT mh.MaMH AS "+ItemDto.IGR_ID+",\n"
			+ "	   mh.TenMH AS "+ItemDto.IGR_NAME+",\n"
			+ "       SUM(ctdh.SoLuong) AS "+ItemDto.NOF_ITEMS+"\n"
			+ " FROM mathang mh\n"
			
			+ "JOIN chitietdonhang ctdh ON mh.MaMH=ctdh.MaMH\n"
			+ "JOIN donhang dh ON ctdh.MaDH=dh.MaDH\n"
			+ "WHERE cast(dh.NgayTao AS YEAR) =2020 \n"
			+ "GROUP BY mh.MaMH\n"
			+ "ORDER BY "+ItemDto.NOF_ITEMS+" DESC\n"
			+ "LIMIT 3";
	
	// QUERY CAU 4 - Lấy hết mặt hàng kèm mã loại và số lượng
	private static final String Q_GET_ALL="SELECT lh.MaLoai AS "+ItemWithSizeDto.IG_ID+",\n"
			+ "	   lh.TenLoai AS "+ItemWithSizeDto.IG_NAME+",\n"
			+ "       mh.MaMH AS "+ItemWithSizeDto.IT_ID+",\n"
			+ "       mh.TenMH AS "+ItemWithSizeDto.IT_NAME+",\n"
			+ "       mh.GiaBan AS "+ItemWithSizeDto.SALE+",\n"
			+ "       mh.GiaMua AS "+ItemWithSizeDto.BUY+",\n"
			+ "       kcmh.SoLuong AS "+ItemWithSizeDto.NOF+"\n"
			+ " FROM mathang mh\n"
			+ "JOIN loaihang lh ON lh.MaLoai=mh.MaLoai\n"
			+ "JOIN kichcomathang kcmh ON mh.MaMH=kcmh.MaMH;";
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
	
	// Câu 3: Yêu cầu trả về List<String>. Danh sách tên mặt hàng chứ 
	// Không phải trả về List<Dto>
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
	@Override
	public List<ItemWithSizeDto> getItemWithSize() {
		Session session=openSession();
		NativeQuery<?> query = session.createNativeQuery(Q_GET_ALL);
		query.addScalar(ItemWithSizeDto.IG_ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemWithSizeDto.IG_NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemWithSizeDto.IT_ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemWithSizeDto.IT_NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemWithSizeDto.SALE, StandardBasicTypes.DOUBLE)
			 .addScalar(ItemWithSizeDto.BUY, StandardBasicTypes.DOUBLE)
			 .addScalar(ItemWithSizeDto.NOF, StandardBasicTypes.INTEGER);
		query.setResultTransformer(Transformers.aliasToBean(ItemWithSizeDto.class));
		return safeList(query);
	}
}



