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

public class ItemGroupDtoDao {
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;
	static {
		conn=DBConnection.getConnection();
	}
	public List<Item> getItems(String igrName){
		List<Item> result = new ArrayList<>();
		
		
		String sql ="select MaLoai,\n";
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
