package dao;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DateType;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemWithDate;
import persistence.ItemWithSizeDto;
import utils.HibernateUtils;

public class HibernateItemDao extends EntityDao implements ItemDao{
	//Cau 1
	private static final String Q_GET_ITEMS_BY_DATE="SELECT mh.MaMH AS "+ItemWithDate.IT_ID+",\n"
			+ "	   mh.TenMH AS "+ItemWithDate.IT_NAME+",\n"
			+ "       dh.NgayTao AS "+ItemWithDate.O_TIME+"\n"
			+ "FROM mathang mh\n"
			+ "JOIN chitietdonhang ctdh ON ctdh.MaMH=mh.MaMH\n"
			+ "JOIN donhang dh ON dh.MaDH= ctdh.MaDH\n"
			+ "WHERE DATE(dh.NgayTao)=?1";
	//Cau2
	private static final String Q_GET_ITEMS_BY_IGR = "SELECT lh.MaLoai AS "+ItemDto.IGR_ID+",\n"
			+ "	   lh.TenLoai AS "+ItemDto.IGR_NAME+",\n"
			+ "    SUM(kcmh.SoLuong) AS "+ItemDto.NOF_ITEMS+"\n"
			+ "FROM loaihang lh\n"
			+ "JOIN mathang mh\n"
			+ "ON lh.MaLoai=mh.MaLoai\n"
			+ "JOIN kichcomathang kcmh\n"
			+ "ON kcmh.MaMH=mh.MaMH\n"
			+ "GROUP BY lh.MaLoai";
	
	//Cau 3
	private static final String Q_GET_NUMBER_IT ="SELECT mh.MaMH AS "+ItemDto.IGR_ID+",\n"
			+ "	   	  mh.TenMH AS "+ItemDto.IGR_NAME+",\n"
			+ "       SUM(ctdh.SoLuong) AS "+ItemDto.NOF_ITEMS+"\n"
			+ "       FROM mathang mh\n"
			+ "		  JOIN chitietdonhang ctdh ON mh.MaMH=ctdh.MaMH\n"
			+ "		  JOIN donhang dh ON ctdh.MaDH=dh.MaDH\n"
			+ "		  WHERE cast(dh.NgayTao AS YEAR) = :year \n"
			+"        GROUP BY mh.MaMH"
			+ "		  ORDER BY "+ItemDto.NOF_ITEMS+" DESC\n"
			+ "		  LIMIT 3";
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
	
	//CAU1
	
		@Override
		public List<ItemWithDate> getItemWithDate(LocalDate NgayBan) {
			String NgayBanPara = NgayBan.toString();
			Session session= openSession();
			NativeQuery<?> query=session.createNativeQuery(Q_GET_ITEMS_BY_DATE);
			query.addScalar(ItemWithDate.IT_ID, StandardBasicTypes.INTEGER)
				 .addScalar(ItemWithDate.IT_NAME, StandardBasicTypes.STRING)
				 .addScalar(ItemWithDate.O_TIME, StandardBasicTypes.TIME);
			query.setResultTransformer(Transformers.aliasToBean(ItemWithDate.class));
			query.setParameter(1, NgayBanPara);
			return safeList(query);
		
		}
	//CAU 2
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
	//CAU 3
	@Override
	public List<ItemDto> getNumberItem(int year) {
		Session session=openSession();
		NativeQuery<?> query= session.createNativeQuery(Q_GET_NUMBER_IT);
		query.addScalar(ItemDto.IGR_ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemDto.IGR_NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemDto.NOF_ITEMS, StandardBasicTypes.LONG);
		query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		query.setParameter("year", year);
		return safeList(query) ;
	}


	//CAU 4
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
	




