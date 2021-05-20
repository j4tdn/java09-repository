package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;

import utils.HibernateUtils;

public class HibernateItemDao extends EntityDao implements ItemDao{

	private static final String Q__GET_ITEMS ="	select  lh.maloai as " 
			+ Item.TEN_ID + ", \n"
			+ "			lh.tenloai as " + Item.TEN_MH + ", \n" + "			sum(kcmh.soluong) " 
			+ Item.SO_LUONG
			+ " 	 \n" + "	from	loaihang lh \n" + "	join  	Mathang mh \n"
			+ "			on lh.MaLoai = mh.MaLoai \n" + "	join 	kichcomathang kcmh \n"
			+ "			on kcmh.MaMH = mh.mamh \n" + "	GROUP BY lh.MaLoai        ";
	private static final String q_get_Item_C2 ="select  	mh.mamh,\r\n" + 
			"			mh.temh,\r\n" + 
			"			sum(ctdh.soluong) soluongmathang	\r\n" + 
			"	from	mathang mh\r\n" + 
			"	join  	chitietdonhang ctdh\r\n" + 
			"			on ctdh.mamh = mh.MaMH\r\n" + 
			"    join 	kichcomathang kcmh\r\n" + 
			"			on kcmh.MaMH = mh.mamh        \r\n" + 
			"	GROUP BY mh.mamh ; ";
	
	public List<Item> getItemDtos() {
		
		Session session = openSession();
		
				 
		NativeQuery<?> query = session.createNativeQuery(Q__GET_ITEMS);
		query.addScalar(Item.TEN_ID, StandardBasicTypes.INTEGER)
		.addScalar(Item.TEN_MH, StandardBasicTypes.STRING)
		.addScalar(Item.SO_LUONG, StandardBasicTypes.DOUBLE)
		.setResultTransformer(Transformers.aliasToBean(Item.class));

		return safelist(query);

		
	}

	@Override
	public List<Item> getItemDtos2() {
		Session session = openSession();
		
		 
		NativeQuery<?> query = session.createNativeQuery(q_get_Item_C2);
		query.addScalar(Item.TEN_ID, StandardBasicTypes.INTEGER)
		.addScalar(Item.TEN_MH, StandardBasicTypes.STRING)
		.addScalar(Item.SO_LUONG, StandardBasicTypes.DOUBLE)
		.setResultTransformer(Transformers.aliasToBean(Item.class));

		return safelist(query);
		
	}
}
