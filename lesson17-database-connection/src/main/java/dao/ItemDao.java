package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import connection.DBConnection;
import persitence.Item;
import utils.SqlUtils;

public class ItemDao {
	private static Connection connection;
	private static Statement st;
	private static ResultSet rs;
	private static PreparedStatement pst;
	
	static {
		connection = DBConnection.getConnection();
	}
	
	public List<Item> getItems(int igrId, double saleFr, double saleTo) {
		List<Item> result = new ArrayList<>();
		String sql =  "SELECT MaMH,\n" 
					+ "	      TenMH,\n" 
				    + "       GiaBan,\n" 
					+ "       GiaMua \n"
				    + "FROM mathang\n" 
					+ "WHERE MaLoai=? AND GiaBan BETWEEN ? AND ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, igrId);
			pst.setDouble(2, saleFr);
			pst.setDouble(3, saleTo);
			rs = pst.executeQuery();
			while (rs.next()) {
				Item it = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaBan"), rs.getDouble("GiaMua"));
				result.add(it);
			}
		} catch (SQLException e) {
			
		} finally {
			SqlUtils.close(rs,pst);
		}
		System.out.println("size: " + result.size());

		return result;

	}
	public List<Item> getItems(String igrName) {
		List<Item> result = new ArrayList<>();
		String sql =  "SELECT * FROM mathang\n"
					+ "WHERE MaLoai=(SELECT MaLoai FROM loaihang\n"
				+ "					WHERE TenLoai='?')";
		Connection connection = DBConnection.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, igrName);
			rs = pst.executeQuery();
			while (rs.next()) {
				Item it = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaBan"),
						rs.getDouble("GiaMua"));
				result.add(it);
			}
		} catch (SQLException e) {
			
		} finally {
			SqlUtils.close(rs,pst);
		}
		System.out.println("size: " + result.size());

		return result;

	}
	
}
