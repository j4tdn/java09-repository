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
	
	static {
		conn=DBConnection.getConnection();
	}
	public List<Item> getItems(int igrId, double saleFrom, double saleTo){
		List<Item> result = new ArrayList<>();
		
		
		String sql ="select MaMH,\n"
				+ " TenMH,\n "
				+ " GiaBan,\n "
				+ " GiaMua\n"
				+ "from Mathang\n"
				+ "where MaLoai =  ? \n"
				+ " and  GiaBan between ? and ? ";
		
		try {
			 pst = conn.prepareStatement(sql);
			 pst.setInt(1, igrId);
			 pst.setDouble(2,  saleFrom);
			 pst.setDouble(3,  saleTo);
			 rs = pst.executeQuery();
			
			 while(rs.next()) {
				Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("Giaban"), rs.getDouble("GiaMua"));
				result.add(item);
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs != null) {
						rs.close();
					}
					if(pst != null) {
						rs.close();
					}
					if(conn != null) {
						rs.close();
					}
					
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			
		
		
		return result;
	}
	
	
	//================================
	//================================
	
	
	public List<Item> getItems(String igrName){
		List<Item> result = new ArrayList<>();
		
		
		String sql ="select MaMH,\n"
				+ " TenMH,\n "
				+ " GiaBan,\n "
				+ " GiaMua\n"
				+ "from Mathang\n"
				+ "where MaLoai =  (select MaLoai \n "
				+ " from LoaiHang \n"
				+ " where TenLoai = ? )";
		try {
			 pst = conn.prepareStatement(sql);
			 pst.setString(1, igrName);
			 rs = pst.executeQuery();
			
			 while(rs.next()) {
				Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("Giaban"), rs.getDouble("GiaMua"));
				result.add(item);
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				SqlUtils.close(pst,rs);
			}
			
		
		
		return result;
	}
	
}
