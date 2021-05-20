package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;

public class HibernateItemDao extends EntityDao implements ItemDao {
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemDto> getItemByBuyDate(LocalDate buyDate) {
		Session session = getCurrentSession();
		Transaction transaction= session.beginTransaction();
		String sql = "SELECT mh.MaMH AS " + ItemDto.IT_ID
				+ ", mh.TenMH AS " + ItemDto.IT_NAME 
				+ ",dh.NgayTao AS "+ ItemDto.IT_BUYDATE
				+"\n" + 
				"FROM MatHang mh\n" + 
				"JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH\n" + 
				"JOIN DonHang dh ON dh.MaDH = ctdh.MaDH\n" + 
				"WHERE cast(NgayTao AS DATE) = :buyDate";
		NativeQuery<?> query = session.createNativeQuery(sql);
		try {
			query.addScalar(ItemDto.IT_ID , StandardBasicTypes.INTEGER)
					.addScalar(ItemDto.IT_NAME, StandardBasicTypes.STRING)
					.addScalar(ItemDto.IT_BUYDATE, StandardBasicTypes.DATE);
			String buyDateStr = buyDate.getYear() + "-" + buyDate.getMonthValue() + "-" + buyDate.getDayOfMonth();
			System.out.println(buyDateStr);
			query.setParameter("buyDate", buyDateStr);
			query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return safeList(query);
	}
	
	@Override
	public List<ItemDto> getItemPopulariry(int year) {
		Session session = getCurrentSession();
		Transaction transaction= session.beginTransaction();
		String sql = "SELECT mh.MaMH AS " + ItemDto.IT_ID
				+ ", mh.TenMH AS " + ItemDto.IT_NAME 
				+ ",SUM(ctdh.SoLuong) AS "+ ItemDto.IT_QUANTITY
				+"\n" + 
				"FROM MatHang mh\n" + 
				"JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH\n" + 
				"JOIN DonHang dh ON dh.MaDH = ctdh.MaDH\n" + 
				"WHERE year(NgayTao) = :year\n"
				+ "GROUP BY mh.MaMH\n" + 
				"LIMIT 3";
		NativeQuery<?> query = session.createNativeQuery(sql);
		try {
			query.addScalar(ItemDto.IT_ID , StandardBasicTypes.INTEGER)
					.addScalar(ItemDto.IT_NAME, StandardBasicTypes.STRING)
					.addScalar(ItemDto.IT_QUANTITY, StandardBasicTypes.INTEGER);
			query.setParameter("year", year);
			query.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return safeList(query);
	}
}
