package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.ItemGroup;

public class ItemGroupDao {
	public List<ItemGroup> getAll (){
		List<ItemGroup> result = new ArrayList<>();
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM loaihang";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("MaLoai");
				String name = resultSet.getString("TenLoai");
				ItemGroup itemGroup = new ItemGroup(id, name);
				result.add(itemGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
