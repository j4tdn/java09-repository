package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import dto.ItemGroupDto;
import persistence.ItemGroup;
import utils.SqlUtils;

public class ItemGroupDao {

	private static Connection connection;
	private static PreparedStatement statement;
	private static ResultSet resultSet;

	static {
		connection = DBConnection.getConnection();
	}

	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT * FROM loaihang";
		try {
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
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

	public List<ItemGroupDto> getItemGroupDetail() {
		List<ItemGroupDto> result = new ArrayList<>();
		String sql = "WITH ThongTinMatHang AS (\r\n"
				+ "	SELECT mh.MaMH, mh.MaLoai, mh.TenMH, SUM(kcmh.SoLuong) SoLuong\r\n" + "    FROM MatHang mh\r\n"
				+ "    JOIN KichCoMatHang kcmh ON mh.MaMH = kcmh.MaMH\r\n" + "    GROUP BY mh.MaMH\r\n" + ")\r\n"
				+ "SELECT lh.MaLoai, lh.TenLoai, GROUP_CONCAT(concat(ttmh.TenMH, \":\",ttmh.SoLuong)) AS DS,SUM(ttmh.SoLuong) AS TongSoLuong\r\n"
				+ "FROM ThongTinMatHang ttmh\r\n" + "JOIN loaihang lh ON lh.MaLoai = ttmh.MaLoai\r\n"
				+ "GROUP BY lh.MaLoai";
		try {
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				result.add(transfer());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(resultSet, statement);
		}
		return result;
	}

	private ItemGroupDto transfer() throws SQLException {
		return new ItemGroupDto(resultSet.getInt(ItemGroupDto.ID), resultSet.getString(ItemGroupDto.NAME),
				resultSet.getString(ItemGroupDto.ITEM_DETAIL), resultSet.getInt(ItemGroupDto.TOTAL_ITEMS));
	}
}
