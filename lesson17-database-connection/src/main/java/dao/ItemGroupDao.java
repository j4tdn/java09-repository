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
	private static String GET_ALL_BY_ID_ASC = "SELECT * FROM LoaiHang ORDER BY MaLoai";
	private static String GET_ALL_BY_NAME_ASC = "SELECT * FROM LoaiHang ORDER BY TenLoai";
	
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
			e.printStackTrace();
		}
		
		return result;
	}
	
	private List<ItemGroup> getAllByField(String query) {
		List<ItemGroup> result = new ArrayList<>();
		Statement statement;
		try {
			statement = DBConnection.getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				ItemGroup itemGroup = new ItemGroup();
				itemGroup.setId(resultSet.getInt("MaLoai"));
				itemGroup.setName(resultSet.getString("TenLoai"));
				result.add(itemGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<ItemGroup> getAllById(){
		return getAllByField(GET_ALL_BY_ID_ASC);
	}
	
	public List<ItemGroup> getAllByName(){
		return getAllByField(GET_ALL_BY_NAME_ASC);
	}
}
