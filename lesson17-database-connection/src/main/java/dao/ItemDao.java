package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
		List<Item> result1 = new ArrayList<>();
		String sql1 =  "SELECT MaMH, TenMH, GiaBan, GiaMua FROM mathang \r\n"
				+ "WHERE TenLoai =(SELECT MaLoai FROM loaihang where TenLoai LIKE 'Áo');";
		Connection connection = DBConnection.getConnection();
		try {
			pst = connection.prepareStatement(sql1);
			pst.setString(1, igrName);
			rs = pst.executeQuery();
			while (rs.next()) {
				Item it = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaBan"),
						rs.getDouble("GiaMua"));
				result1.add(it);
			}
		} catch (SQLException e) {
			
		} finally {
			SqlUtils.close(rs,pst);
		}
		System.out.println("size: " + result1.size());

		return result1;

	}
	public List<Item> getItemsByDate(LocalDate saleDate) {
		List<Item> result = new ArrayList<>();
		String sql1 =  "SELECT mh.MaMH,\r\n"
				+ "	   mh.TenMH,\r\n"
				+ "       mh.GiaBan,\r\n"
				+ "       mh.GiaMua \r\n"
				+ "FROM mathang mh\r\n"
				+ "JOIN chitietdonhang ctdh ON mh.MaMH=ctdh.MaMH\r\n"
				+ "JOIN donhang dh ON ctdh.MaDH=dh.MaDH\r\n"
				+ "WHERE cast(dh.NgayTao AS DATE)= '2020-12-18'";
		Connection connection = DBConnection.getConnection();
		try {
			pst = connection.prepareStatement(sql1);
//			pst.setDate(1, java.sql.Date.valueOf(saleDate));
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
