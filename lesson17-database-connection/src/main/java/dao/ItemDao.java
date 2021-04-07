package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import connection.DBConnection;
import persistence.Item;
import utils.SqlUtils;

public class ItemDao {
	
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;
	
	static  {
		conn = DBConnection.getConnection();
	}
	
	
	
	public List<Item> getItems(int igrId, double saleFrom, double saleTo) {
		List<Item> result = new ArrayList<>();
		
		String sql = "SELECT MaMH,\n"
				   + "       TenMH,\n"
				   + "		 GiaBan,\n"
				   + "		 GiaMua\n"
				   + "FROM MatHang\n"
				   + "WHERE MaLoai = ?\n"
				   + " AND GiaBan BETWEEN ? AND ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, igrId);
			pst.setDouble(2, saleFrom);
			pst.setDouble(3, saleTo);
			rs = pst.executeQuery();
			while(rs.next()) {
				Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaBan"), rs.getDouble("GiaMua"));
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	public List<Item> getItems(String igrName) {
		igrName = "aaa' OR '1=1";
		List<Item> result = new ArrayList<>();
		
		String sql = "SELECT MaMH,\n"
				   + "       TenMH,\n"
				   + "		 GiaBan,\n"
				   + "		 GiaMua\n"
				   + "FROM MatHang\n"
				   + "WHERE MaLoai IN (SELECT MaLoai \n"
				   + "                FROM LoaiHang \n"
				   + "				  WHERE TenLoai = ?)";
		
		System.out.println(sql);
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, igrName);
			rs = pst.executeQuery();
			while(rs.next()) {
				Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaBan"), rs.getDouble("GiaMua"));
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
}
