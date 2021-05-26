package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemDto;

public class HibernateItemDao extends EntityDao implements ItemDao {

	public List<Item> getAll() {
		Session session = openSession();
		// sessionFactory.getCurrentSession();

		// native query
		String sql = "SELECT * FROM MatHang"; // MaLoai, TenLoai
		NativeQuery<Item> query = session.createNativeQuery(sql, Item.class);
		return query.getResultList();
	}

	@Override
	public List<ItemDto> getItemsBySaleDate(LocalDate saleDate) {
		String saleDateString = saleDate.toString();
		String sql = "SELECT mh.maMH AS " + ItemDto.ITEM_ID + ", \n" + "		mh.TenMH AS " + ItemDto.ITEM_NAME
				+ ", \n" + "        dh.NgayTao AS " + ItemDto.SALE_DATE + "\n" + "FROM mathang mh\n"
				+ "	JOIN chitietdonhang ctdh ON mh.MaMH = ctdh.MaMH\n" + "    JOIN donhang dh ON dh.MaDH = ctdh.MaDH\n"
				+ "WHERE cast(dh.NgayTao AS DATE) = :saleDate";
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		NativeQuery<?> query = session.createNativeQuery(sql);

		query.setParameter("saleDate", saleDateString);

		query.addScalar(ItemDto.ITEM_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.ITEM_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDto.SALE_DATE, StandardBasicTypes.DATE)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));

		return safeList(query);
	}

	@Override
	public List<String> getTop3BestSalerItemsInYear(int year) {
		List<String> top3BestSaler = new ArrayList<>();
		String sql = "SELECT mh.MaMH AS " + ItemDto.ITEM_ID + ",\n" + "			mh.TenMH AS " + ItemDto.ITEM_NAME
				+ ",\n" + "            sum(ctdh.SoLuong) " + ItemDto.TOTAL + "\n" + "FROM mathang mh\n"
				+ "	JOIN chitietdonhang ctdh ON mh.MaMH = ctdh.MaMH\n" + "    JOIN donhang dh ON dh.MaDH = ctdh.MaDH\n"
				+ "WHERE year(dh.NgayTao) = " + year + " \n" + "GROUP BY mh.MaMH\n" + "ORDER BY " + ItemDto.TOTAL
				+ " DESC\n" + "LIMIT 3";
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		NativeQuery<?> query = session.createNativeQuery(sql);

		query.addScalar(ItemDto.ITEM_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.ITEM_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDto.TOTAL, StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		List<ItemDto> top3Item = safeList(query);
		top3Item.forEach(etem -> top3BestSaler.add(etem.getItemName()));
		return top3BestSaler;
	}
}
