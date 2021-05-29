package dao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemDto;

public class HibernateItemDao extends EntityDao implements ItemDao
{

	public List<Item> getItem() {
		Session session=openSession();
	String sql="SELECT * FROM MatHang";
	NativeQuery<Item> query=session.createNativeQuery(sql, Item.class);
	return query.getResultList();
	}

	@Override
	public List<String> getTop3items(int year) {
		List<String> list= new ArrayList<>();
		Session session=openSession();
		NativeQuery<?> query=session.createSQLQuery("SELECT mh.MaMH AS "+ItemDto.ITEM_ID +",\r\n"+
				"mh.TenMH AS "+ ItemDto.ITEM_NAME+",\r\n"+"sum(ctdh.SoLuong) AS " +ItemDto.ITEM_TOTAL+" \r\n" + 
				"FROM MatHang mh\r\n" + 
				"JOIN LoaiHang lh\r\n" + 
				"ON mh.MaLoai=lh.MaLoai\r\n" + 
				"JOIN ChiTietDonHang ctdh\r\n" + 
				"ON ctdh.MaMH=mh.MaMH\r\n" +
				"JOIN DonHang dh\r\n"+
				"ON dh.MaDH=ctdh.MaDH\r\n"+
				"WHERE year(dh.Ngaytao)="+year+"\r\n"+
				"GROUP BY mh.MaMH\r\n"+
				"ORDER BY  mh.MaMH DESC\r\n"+
				"LIMIT 3");
		query.addScalar(ItemDto.ITEM_ID,StandardBasicTypes.INTEGER)
		.addScalar(ItemDto.ITEM_NAME,StandardBasicTypes.STRING)
		.addScalar(ItemDto.ITEM_TOTAL,StandardBasicTypes.DOUBLE).setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		List<ItemDto> itemDto=safeList(query);
		itemDto.forEach(item->list.add(item.getItemName()));
		return list;
	}

	@Override
	public List<ItemDto> getItemsSaleDate(LocalDate saleDate) {
		String string=saleDate.toString();
		String sql="SELECT mh.MaMH AS " +ItemDto.ITEM_ID+ ",\r\n"+
				"mh.TenMH AS "+ ItemDto.ITEM_NAME + ",\r\n"+
				"dh.NgayTao AS " +ItemDto.ITEM_TOTAL+ "\r\n"+
				"FROM MatHang mh\r\n" + 
				"JOIN ChiTietDonHang ctdh\r\n" + 
				"ON mh.MaMH=ctdh.MaMH\r\n" + 
				"JOIN DonHang dh\r\n" + 
				"ON ctdh.MaDH=dh.MaDH\r\n" + 
				"WHERE cast(dh.NgayTao AS DATE)=:saleDate";
		Session session=openSession();
		NativeQuery<?> query= session.createNativeQuery(sql);
		query.setParameter("saleDate", string);
		query.addScalar(ItemDto.ITEM_ID,StandardBasicTypes.INTEGER)
		.addScalar(ItemDto.ITEM_NAME,StandardBasicTypes.STRING)
		.addScalar(ItemDto.ITEM_TOTAL,StandardBasicTypes.DOUBLE)
		.addScalar(ItemDto.SALE_DATE,StandardBasicTypes.DATE);
		return safeList(query);
        
	}
   
}
