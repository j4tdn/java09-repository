package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBCconnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import utils.SqlUtils;

public class ItemGroupDao {

	private static Connection conn;
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;

	public ItemGroupDao() {
		conn = DBCconnection.getConnection();
	}

	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();

		String sql = "SELECT * FROM loaihang";
		Connection connection = DBCconnection.getConnection();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public List<ItemGroupDto> getItemsGroupDetails() {
		List<ItemGroupDto> result = new ArrayList<ItemGroupDto>();
		String sql = "WITH ThongTinMatHang AS(\n" + 
				"SELECT mh.MaMH,\n" + 
				"mh.MaLoai,\n" + 
				"mh.TenMH,\n" + 
				"SUM(kcmh.SoLuong) SoLuong\n" + 
				"FROM MatHang mh\n" + 
				"JOIN KichCoMatHang kcmh\n" + 
				"ON mh.MaMH=kcmh.MaMH\n" + 
				"GROUP BY mh.MaMH\n" + 
				")\n" + 
				"SELECT lh.MaLoai " + ItemGroupDto.ID + ",\n" +
				"lh.TenLoai " +  ItemGroupDto.NAME + ",\n" +
				"GROUP_CONCAT(concat(lh.TenLoai,':', mh.SoLuong) SEPARATOR ',' ) "  + ItemGroupDto.ITEMDETAILS + ",\n" +
				"SUM(mh.SoLuong) "  + ItemGroupDto.TOTALOFITEM + "\n" +
				"FROM ThongTinMatHang mh\n " +  
				"JOIN LoaiHang lh\n" + 
				"ON mh.MaLoai=lh.MaLoai\n " + 
				"GROUP BY lh.MaLoai";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroupDto igr = new ItemGroupDto();
				tranformer(igr);
				result.add(igr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	private static  void tranformer(ItemGroupDto igr) throws SQLException {
		igr.setId(rs.getInt(ItemGroupDto.ID));
		igr.setName((rs.getString(ItemGroupDto.NAME)));
		igr.setItemaDetails((rs.getString(ItemGroupDto.ITEMDETAILS)));
		igr.setTotalOfItem(rs.getDouble(ItemGroupDto.TOTALOFITEM));
	}

}
