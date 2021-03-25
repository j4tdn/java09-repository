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
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		Connection connection = DBConnection.getConnection();

		String sql = "select * from loaihang";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				result.add(new ItemGroup(resultSet.getInt("maloai"), resultSet.getString("tenloai")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

}
