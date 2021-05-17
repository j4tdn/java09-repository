package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import utils.SqlUtils;

public class ItemGroupDao {
	
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	public ItemGroupDao() {
		conn = DBConnection.getConnection();
	}
	
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		/**
		 B1: Write down a native query
		 B2: 
         + UPDATE: => executeUpdate => TRUE|FALSE
         + SELECT: => executeQuery  => ResultSet (columns/rows)
                   => List<T> : T > Entity
		 */
		
		String sql = "SELECT * FROM LoaiHang";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public List<ItemGroupDto> getItemGrpDetails() {
		List<ItemGroupDto> result = new ArrayList<>();
		
		String sql = "WITH ThongTinMatHang AS (\n" + 
				"	SELECT mh.MaMH,\n" + 
				"           mh.MaLoai,\n" + 
				"           mh.TenMH,\n" + 
				"           SUM(kcmh.SoLuong) SoLuong\n" + 
				"    FROM MatHang mh\n" + 
				"    JOIN KichCoMatHang kcmh \n" + 
				"	  ON mh.MaMH = kcmh.MaMH\n" + 
				"	GROUP BY mh.MaMH\n" + 
				")\n" + 
				"SELECT lh.MaLoai " + ItemGroupDto.ID   + ",\n" + 
				"       lh.TenLoai " + ItemGroupDto.NAME +",\n" + 
				"       GROUP_CONCAT(concat(mh.TenMH, ':', mh.SoLuong) SEPARATOR ', ') " + ItemGroupDto.ITEM_DETAILS + ",\n" + 
				"       SUM(mh.SoLuong) " + ItemGroupDto.TOTAL_OF_ITEMS +"\n" + 
				"FROM ThongTinMatHang mh\n" + 
				"JOIN LoaiHang lh\n" + 
				"  ON mh.MaLoai = lh.MaLoai\n" + 
				"GROUP BY lh.MaLoai";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroupDto igr = new ItemGroupDto();
				transformer(igr); // igr1
				result.add(igr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	// ItemGroupDto igr = igr;
	private void transformer(ItemGroupDto igr) throws SQLException{
		igr.setId(rs.getInt(ItemGroupDto.ID));
		igr.setName(rs.getString(ItemGroupDto.NAME));
		igr.setItemDetails(rs.getString(ItemGroupDto.ITEM_DETAILS));
		igr.setTotalOfItems(rs.getDouble(ItemGroupDto.TOTAL_OF_ITEMS));
	}
	
	
}
