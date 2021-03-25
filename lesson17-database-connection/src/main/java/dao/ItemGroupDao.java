package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.ItemGroup;

public class ItemGroupDao {
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		Connection conn = DBConnection.getConnection();
		String sql = "SELECT * FROM LoaiHang";
			try {
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				
				while(rs.next()) {
					ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
					result.add(ig);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		return result;
	}
}
