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

	private static Connection connection;
	private static PreparedStatement statement;
	private static ResultSet resultSet;

	static {
		connection = DBConnection.getConnection();
	}

	public List<Item> getItem(int igrId, double saleFrom, double saleTo) {
		List<Item> result = new ArrayList<>();
		String sql = "SELECT MaMH , TenMH, GiaBan , GiaMua FROM MatHang WHERE MaLoai = ? AND GiaBan BETWEEN ? AND ?";
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, igrId);
			statement.setDouble(2, saleFrom);
			statement.setDouble(3, saleTo);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				result.add(new Item(resultSet.getInt("MaMH"), resultSet.getString("TenMH"),
						resultSet.getDouble("GiaBan"), resultSet.getDouble("GiaBan")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(resultSet, statement);
		}

		return result;
	}

	public List<Item> getItemByName(String igrName) {
		List<Item> result = new ArrayList<>();
		String sql = "SELECT MaMH , TenMH, GiaBan , GiaMua FROM MatHang WHERE MaLoai = (SELECT MaLoai\n"
				+ "FROM loaihang\n" + "WHERE TenLoai = ?\n" + ")";
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, igrName);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				result.add(new Item(resultSet.getInt("MaMH"), resultSet.getString("TenMH"),
						resultSet.getDouble("GiaBan"), resultSet.getDouble("GiaBan")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(resultSet, statement);
		}

		return result;
	}
}
