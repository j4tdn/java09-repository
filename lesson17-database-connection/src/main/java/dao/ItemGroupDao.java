package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import connection.DBConnection;
import persistence.ItemGroup;

public class ItemGroupDao {
	public List<ItemGrop> getAll(){
		List<ItemGroup> result = new ArryList<>();
		String sql = "SELECT * from LoaiHang";
		Connection connection = DBConnection.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = rs.executeQuery(sql);
			while (rs.next()) {
				//System.out.println("MaLoai: " + rs.getInt("MaLoai"));
				//System.out.println("TenLoai: " + rs.getInt("TenLoai"));
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
