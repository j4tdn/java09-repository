package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.DBConnection;

public class OrderDao {
	Connection conn = DBConnection.getConnection();
	
	public double getTotalOfMoney(int orderId) {
		String sql = "SELECT sum(ctdh.SoLuong) SoLuong,"
				+ "sum(kcmh.SoLuong) SoLuongMH "
				+ "FROM KichCoMatHang kcmh "
				+ "JOIN ChiTietDonHang ctdh ON kcmh.MaMH = ctdh.MaMH "
				+ "WHERE ctdh.MaDH = " + orderId + " "
				+ "GROUP BY ctdh.MaDH";
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				return rs.getDouble("SoLuong") + rs.getDouble("SoLuongMH");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public void updateTotalOfMoney(int orderId, int totalOfMoney) {
		String sql = "UPDATE DonHang SET TongTien = " + totalOfMoney 
				+ " WHERE MaDH = " + orderId;
		try {
			Statement st = conn.createStatement();
			if (st.executeUpdate(sql) != 0) {
				System.out.println("Đã cập nhật thành công");
			} else {
			System.out.println("Cập nhật thất bại");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
