package dao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.transform.Transformer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.persister.walking.internal.StandardAnyTypeDefinition;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

import persistence.Item;
import persistence.ItemDto;
import utils.HibernateUtils;

public class HibernateItemDao extends EntityDao implements ItemDao {
	
	@Override
	public List<ItemDto> getItemDtos(LocalDate dateSale) {
		Session session = openSession();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String dateString = dateSale.format(dtf);
		
		final String ITEMS_BY_DATE = 
				"SELECT mh.MaMH AS " + ItemDto.ITEM_ID + ",\n" 
				+ "       mh.TenMH AS "+ ItemDto.ITEM_NAME + ",\n"  
				+ "       cast(NgayTao as Time) AS "+ ItemDto.TIME_SALE + "\n" 
				+ "FROM MatHang mh\n" 
				+ "JOIN ChiTietDonHang ctdh\n"  
				+ "	ON mh.MaMH = ctdh.MaMH\n"  
				+ "JOIN DonHang dh\n" 
				+ "ON dh.MaDH = ctdh.MaDH\n"  
				+ "WHERE cast(NgayTao as Date) = '2020/12/18'";
		
		NativeQuery<ItemDto> query = session.createNativeQuery(ITEMS_BY_DATE);
		
		query.addScalar(ItemDto.ITEM_ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemDto.ITEM_NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemDto.TIME_SALE, new LocalTimeType());
		
		query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		return safeList(query);
	}

	@Override
		public String getItemsByAmount(int year) {
			Session session = openSession();
			
			String yearStr = Integer.toString(year);
			final String ITEMS_BY_AMOUNT = 
					"SELECT mh.MaMH AS "+ Item.ITEM_ID +", \n" + 
					"	   mh.TenMH AS "+ Item.ITEM_NAME + ",\n" + 
					"	   sum(ctdh.SoLuong) AS "+ Item.AMOUNT_SALE + "\n" + 
					"FROM mathang mh\n" + 
					"JOIN chitietdonhang ctdh \n" + 
					"	ON mh.MaMH = ctdh.MaMH\n" + 
					"JOIN DonHang dh \n" + 
					"	ON dh.MaDH = ctdh.MaDH\n" + 
					"WHERE cast(NgayTao AS DATE) >'" + yearStr +"/12/31' \n" + 
					"	  AND cast(NgayTao AS DATE) < '" + yearStr + "/1/1'\n" + 
					"GROUP BY mh.MaMH\n" + 
					"ORDER BY SoLuongDaBan DESC\n" + 
					"LIMIT 3";
			
			NativeQuery<ItemDto> query = session.createNativeQuery(ITEMS_BY_AMOUNT);
			
			query.addScalar(Item.ITEM_ID, StandardBasicTypes.INTEGER)
				 .addScalar(Item.ITEM_NAME, StandardBasicTypes.STRING)
				 .addScalar(Item.AMOUNT_SALE, StandardBasicTypes.LONG);
			
			query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
			List<Item> items = safeList(query);
			
			String result = "";
			for (Item item:items) {
				result += item.getIgrName();
			}
			
			return result;
		}
}
