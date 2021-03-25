package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.ItemGroup;

public class ItemGroupDao {
	
	public List<ItemGroup> getAll(){
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT * FROM LoaiHang";
		Connection conn = DBConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				result.add(new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
