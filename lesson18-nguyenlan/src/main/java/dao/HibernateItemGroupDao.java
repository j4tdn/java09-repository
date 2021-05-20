package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dto.ItemGroupDto;
import persistence.ItemGroup;
import utils.HibernateUtils;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

	private static final String SQL_GET_IGR_DTO = "SELECT lh.MaLoai " + ItemGroupDto.IGR_ID + ",\n" + 
			"		lh.TenLoai " + ItemGroupDto.IGR_NAME + " ,\n" + 
			"		sum(kcmh.SoLuong) " + ItemGroupDto.TOTAL_OF_ITEMS + " \n" + 
			"FROM loaihang lh\n" + 
			"JOIN mathang mh \n" + 
			"	ON lh.MaLoai = mh.MaLoai\n" + 
			"JOIN kichcomathang kcmh\n" + 
			"	ON kcmh.MaMH = mh.MaMH\n" + 
			"GROUP BY lh.MaLoai";
	public List<ItemGroup> getAll() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactoryXml();
		Session session = sessionFactory.openSession();

		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.SELECT_ALL_HQL, ItemGroup.class);

		return query.getResultList(); //query.uniqueResult();
	}

	@Override
	public void save(ItemGroup itemGroup) {
		
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();

		try {
			session.save(itemGroup);
			transaction.commit();
			System.out.println("Save " + itemGroup.getIgName() + " successful");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(SQL_GET_IGR_DTO);

		query.addScalar(ItemGroupDto.IGR_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemGroupDto.IGR_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.TOTAL_OF_ITEMS, StandardBasicTypes.LONG)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));

		return safeList(query);
	}
	
}
