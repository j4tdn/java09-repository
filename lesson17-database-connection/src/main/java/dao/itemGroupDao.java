package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import connection.DbConnection;
import persistence.ItemGroup;

public class itemGroupDao {
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();

		String sql = "SELECT* FROM LoaiHang";
		Connection connection = DbConnection.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
