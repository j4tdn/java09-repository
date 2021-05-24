package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import connection.DBConnection;
import dto.ItemWithDate;
import dto.ItemWithSale;
import dto.RemainItem;
import utils.SqlUtils;

public class ItemDaoImpl implements ItemDao {

	private static final String Q_ITEMS_WITH_DATE = 
			// Mapping alias tạo biến hằng số. Ko dc hardcode id, name, time như vậy
			// Sử dụng Hibernate chứ ko dùng JDBC
			"select mh.MaMH as id, \n"
			+ "		mh.TenMH as name, \n"
			+ "		time(dh.NgayTao) as time\n"
			+ "from mathang mh\n" 
			+ "join chitietdonhang ctdh on mh.MaMH = ctdh.MaMH\n" 
			+ "join donhang dh on dh.MaDH = ctdh.MaDH\n"
			// NgayTao kiểu LocalDate là tham số truyền vào
			// Không được truyền trực tiếp như này
			+ "where DATE(NgayTao) = '2020-12-18';";
	
	private static final String Q_GET_ITEMS_REMAINING = 
			"select lh.MaLoai, \n"
			+ "		lh.TenLoai, \n"
			+ "		sum(kcmh.SoLuong) SoLuong\n"
			+ "from loaihang lh\n"
			+ "join mathang mh on mh.MaLoai = lh.MaLoai\n"
			+ "join kichcomathang kcmh on mh.MaMh = kcmh.MaMH\n"
			+ "GROUP BY lh.MaLoai;";
	
	private static final String Q_GET_ITEMS_TOP_3_SALE = 
			"WITH soluongbanhang AS(\n" 
			+ "		SELECT mh.MaMH, "
			+ "			mh.TenMH TenMH, "
			+ "			sum(ctdh.SoLuong) SL FROM mathang mh\n" 
			+ "		JOIN chitietdonhang ctdh ON ctdh.MaMH = mh.MaMH\n" 
			+ "    	JOIN donhang dh ON dh.MaDH = ctdh.MaDH\n" 
			+ "    	WHERE year(dh.NgayTao) = ? \n" 
			+ "	GROUP BY mh.MaMH"
			+ "		ORDER BY SL DESC\n"
			+ "		LIMIT 3\n"
			+ ")\n"
			+ "SELECT TenMH FROM soluongbanhang;";

	private static Connection conn = DBConnection.getConnection();
	private static ResultSet rs = null;
	
	public List<ItemWithDate> getItemWithDate() {
		Statement st = null;
		List<ItemWithDate> result = new ArrayList<>();
		
		try {
			// Đang học Hibernate
			// Không được dùng JDBC
			// Áp dụng addScalar(alias, LocalTimeType.Instance)
			st = conn.createStatement();
			rs = st.executeQuery(Q_ITEMS_WITH_DATE);
			
			while (rs.next()) {
				ItemWithDate item = new ItemWithDate();
				item.setId(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setSaleTime(rs.getTime(3).toLocalTime());
				result.add(item);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		};
		
		return result;
	}
	
	// Hibernate
	@Override
	public List<RemainItem> getRemainItems() {
		Statement st = null;
		List<RemainItem> result = new ArrayList<>();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(Q_GET_ITEMS_REMAINING);
			
			while (rs.next()) {
				RemainItem item = new RemainItem();
				item.setId(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setAmount(rs.getInt(3));
				result.add(item);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		};
		
		return result;
	}
	
	
	// Hibernate
	@Override
	public List<String> getSaleItems(int year) {
		Statement st = null;
		List<String> result = new ArrayList<>();
		
		PreparedStatement pst = null;
		
		try {
			pst = conn.prepareStatement(Q_GET_ITEMS_TOP_3_SALE);
			pst.setInt(1, year);;
			rs = pst.executeQuery();
			
			while (rs.next()) {
				result.add(rs.getString(1));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		};
		
		return result;
	}
}
