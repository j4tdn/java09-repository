package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.Item;
import persistence.ItemGroupDto;
import utils.SqlUtils;

public class ItemDao {
	
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;
	
	static {
		conn = DBConnection.getConnection();
	}
	
	public List<Item> getItems(int igrId, double saleFrom, double saleTo) {
		List<Item> result = new ArrayList<>();
		
		String sql = "select MaMH, TenMH, GiaBan, GiaMua " 
				+ "from MatHang " 
				+ "where MaLoai = ? "  
				+ " and GiaBan between ? and ?" ;
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, igrId);
			pst.setDouble(2, saleFrom);
			pst.setDouble(3, saleTo);
			rs = pst.executeQuery();
			while (rs.next()) {
				Item it = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaBan"), rs.getDouble("GiaMua"));
				result.add(it);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	public List<Item> getItems(String igrName) {
		List<Item> result = new ArrayList<>();
		
		String sql = "select MaMH, TenMH, GiaBan, GiaMua " 
				+ "from MatHang " 
				+ "where MaLoai = (SELECT MaLoai "
				+                  "from LoaiHang where TenLoai = ?) ";
				
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, igrName);
			rs = pst.executeQuery();
			while (rs.next()) {
				Item it = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaBan"), rs.getDouble("GiaMua"));
				result.add(it);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	public List<Item> getItems(LocalDateTime salesDate){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		List<Item> result = new ArrayList<Item>();
		
		String sql = "SELECT * FROM DonHang dh "
				+ "JOIN ChiTietDonHang ctdh ON dh.MaDH = ctdh.MaDH "
				+ "JOIN MatHang mh ON ctdh.MaMH = mh.MaMH "
				+ "WHERE cast(dh.NgayTao as Date) = '" 
				+ dtf.format(salesDate) + "'";
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Item it = new Item();
				result.add(it);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
