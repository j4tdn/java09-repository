package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.ItemGroup;

public class ItemGroupDao {
	private static String GET_ALL = "SELECT * FROM LoaiHang";
	
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		Statement statement;
		try {
			statement = DBConnection.getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery(GET_ALL);
			while(resultSet.next()) {
				ItemGroup itemGroup = new ItemGroup();
				itemGroup.setId(resultSet.getInt("MaLoai"));
				itemGroup.setName(resultSet.getString("TenLoai"));
				result.add(itemGroup);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
