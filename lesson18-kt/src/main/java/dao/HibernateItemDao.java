package dao;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;
import persistence.ItemWithYearDto;

public class HibernateItemDao extends EntityDao implements ItemDao{

	private static String SQL_ITEMS_BY_DATE = "select mh.MaMH AS "+ ItemDto.ID +",\r\n" + 
			" mh.TenMH AS "+ ItemDto.NAME +",\r\n" + 
			"  cast(dh.NgayTao AS TIME) AS "+ ItemDto.TIME + "\r\n" + 
			" from MatHang mh\r\n" + 
			" join chitietdonhang ctdh on mh.MaMH = ctdh.MaMH\r\n" + 
			"join donhang dh on dh.MaDH = ctdh.MaDH\r\n" + 
			"where cast(NgayTao AS DATE) = ?";
	
	private static String SQL_MOST_SOLD_ITEMS_IN_YEAR = "select mh.MaMH as " + ItemWithYearDto.ID + ",\r\n" + 
			"mh.TenMH as " + ItemWithYearDto.NAME + ",\r\n" + 
			"sum(soluong) as " + ItemWithYearDto.QUANTITY + " from mathang mh\r\n" + 
			"join chitietdonhang ctdh\r\n" + 
			"on mh.MaMH = ctdh.MaMH\r\n" + 
			"join donhang dh\r\n" + 
			"on dh.MaDH = ctdh.MaDH\r\n" + 
			"where YEAR(dh.NgayTao) = ?\n" + 
			"group by ctdh.MaMH\n";	
	
	
	@Override
	public List<ItemDto> getItemDtoByDate(LocalDate date) {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(SQL_ITEMS_BY_DATE);
		
		query.addScalar("id", StandardBasicTypes.INTEGER)
			 .addScalar("name", StandardBasicTypes.STRING)
			 .addScalar("time", StandardBasicTypes.TIME)
			 .setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		query.setParameter(1, date.getYear() + "-" + date.getMonthValue()+ "-" + date.getDayOfMonth());
		
		return safeList(query);
	}


	@Override
	public List<ItemWithYearDto> getItemMostSoldInYear(int year) {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(SQL_MOST_SOLD_ITEMS_IN_YEAR);
		
		query.addScalar("id", StandardBasicTypes.INTEGER)
			 .addScalar("name", StandardBasicTypes.STRING)
			 .addScalar("quantity", StandardBasicTypes.INTEGER)
			 .setResultTransformer(Transformers.aliasToBean(ItemWithYearDto.class));
		query.setParameter(1, year);
		return safeList(query);
	}

}
