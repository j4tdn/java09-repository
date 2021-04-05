package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.Item;
import utils.SqlUtils;

public class ItemDao {
	private static String GET_ALL_BY_IG_ID = "SELECT MaMH, TenMH, GiaBan, GiaMua "
			+ "FROM MatHang WHERE MaLoai = ? AND GiaBan BETWEEN ? AND ?";
	private static String GET_ALL_BY_IG_NAME = "SELECT MaMH, TenMH, GiaBan, GiaMua "
			+ "FROM MatHang "
			+ "WHERE MaLoai = ("
			+ "		SELECT MaLoai "
			+ " 	FROM LoaiHang "
			+ "		WHERE TenLoai LIKE?) ";
	

	private static Connection conn = DBConnection.getConnection();
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;
	
	public List<Item> getItems(int igrId, double saleFrom, double saleTo) {
		List<Item> result = new ArrayList<>();
		
		try {
			preparedStatement = conn.prepareStatement(GET_ALL_BY_IG_ID);
			preparedStatement.setInt(1, igrId);
			preparedStatement.setDouble(2, saleFrom);
			preparedStatement.setDouble(3, saleTo);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Item item = new Item();
				item.setId(resultSet.getInt("MaMH"));
				item.setName(resultSet.getString("TenMH"));
				item.setSaleIn(resultSet.getDouble("GiaBan"));
				item.setSaleOut(resultSet.getDouble("GiaMua"));
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(resultSet, preparedStatement);
		};
		
		return result;
	}
	
	public List<Item> getItemsByName(String igrName) {
		List<Item> result = new ArrayList<>();
		
		try {
			preparedStatement = conn.prepareStatement(GET_ALL_BY_IG_NAME);
			preparedStatement.setString(1, igrName);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Item item = new Item();
				item.setId(resultSet.getInt("MaMH"));
				item.setName(resultSet.getString("TenMH"));
				item.setSaleIn(resultSet.getDouble("GiaBan"));
				item.setSaleOut(resultSet.getDouble("GiaMua"));
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(resultSet, preparedStatement);
		};
		
		return result;
	}
}
