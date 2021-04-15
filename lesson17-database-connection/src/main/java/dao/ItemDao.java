package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBCconnection;
import persistence.Item;
import persistence.ItemGroup;
import utils.SqlUtils;
public class ItemDao {
	private static Connection connection;
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;

	static {
		connection = DBCconnection.getConnection();
	}
	// dùng createStatement
		public List<Item> getItems(int igrId, double saleFrom, double saleTo) {
			List<Item> result = new ArrayList<>();

			String sql = "SELECT MaMH,\r\n" + 
					"		TenMH, \r\n" + 
					"        GiaBan, \r\n" + 
					"        GiaMua\r\n" + 
					"FROM mathang\n"
					+ "WHERE MaLoai = " + igrId +"\n" + " AND GiaBan BETWEEN " +  saleFrom + " AND " + saleTo;
			try {
				st =  connection.createStatement();
				rs = st.executeQuery(sql);
				while(rs.next()) {
					Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaMua"), rs.getDouble("GiaBan"));
					result.add(item);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs,pst);		
			}
			return result;
		}

		public List<Item> getItems1(String igrName, double saleFrom, double saleTo) {
			List<Item> result = new ArrayList<>();

			String sql = "SELECT MaMH,\r\n" + 
					"		TenMH, \r\n" + 
					"        GiaBan, \r\n" + 
					"        GiaMua\r\n" + 
					"FROM mathang\n"
					+ "WHERE MaLoai = " + igrName +"\n" + " AND GiaBan BETWEEN " +  saleFrom + " AND " + saleTo;
			System.out.println(sql);
			try {
				st =  connection.createStatement();
				rs = st.executeQuery(sql);
				while(rs.next()) {
					Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaMua"), rs.getDouble("GiaBan"));
					result.add(item);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs,pst);		
			}
			return result;
		}

		public List<Item> getItems2(int igrId, double saleFrom, double saleTo) {
			List<Item> result = new ArrayList<>();

			String sql = "SELECT MaMH,\r\n" + 
					"		TenMH, \r\n" + 
					"        GiaBan, \r\n" + 
					"        GiaMua\r\n" + 
					"FROM mathang\n"
					+ "WHERE MaLoai = ? AND GiaBan BETWEEN ? AND ?";

			try {
				pst =  connection.prepareStatement(sql);
				pst.setInt(1, igrId);
				pst.setDouble(2, saleFrom);
				pst.setDouble(3, saleTo);
				rs = pst.executeQuery();
				while(rs.next()) {
					Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaMua"), rs.getDouble("GiaBan"));
					result.add(item);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs,pst);
			}

			return result;
		}

		public List<Item> getItems3(String igrName, double saleFrom, double saleTo) {
			List<Item> result = new ArrayList<>();

			String sql = "SELECT MaMH,\r\n" + 
					"		TenMH, \r\n" + 
					"        GiaBan, \r\n" + 
					"        GiaMua\r\n" + 
					"FROM mathang mh JOIN loaihang lh ON mh.MaLoai = lh.MaLoai\r\n" + 
					"WHERE TenLoai = ? \r\n" + 
					"AND GiaBan BETWEEN ? AND ?";
			try {
				pst =  connection.prepareStatement(sql);
				pst.setString(1, igrName);
				pst.setDouble(2, saleFrom);
				pst.setDouble(3, saleTo);
				rs = pst.executeQuery();
				while(rs.next()) {
					Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaMua"), rs.getDouble("GiaBan"));
					result.add(item);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs,pst);
			}

			return result;
		}
}
