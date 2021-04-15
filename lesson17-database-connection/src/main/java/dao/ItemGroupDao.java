package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import connection.DBConnection;
import dto.ItemAmount;
import dto.ItemGroupDto;
import persistence.ItemGroup;
import utils.SqlUtils;

public class ItemGroupDao {
	private static String GET_ALL = "SELECT * FROM LoaiHang";
	private static String GET_ALL_BY_ID_ASC = "SELECT * FROM LoaiHang ORDER BY MaLoai";
	private static String GET_ALL_BY_NAME_ASC = "SELECT * FROM LoaiHang ORDER BY TenLoai";
	private String GET = "WITH SoLuongMatHang AS (\n" + 
			"	SELECT mh.MaMH, mh.TenMH, mh.MaLoai, sum(kcmh.SoLuong) TongSoLuongMH\n" + 
			"    FROM mathang mh\n" + 
			"    JOIN kichcomathang kcmh ON mh.MaMH = kcmh.MaMH\n" + 
			"    GROUP BY mh.MaMH\n" + 
			"    )\n" + 
			"SELECT lh.MaLoai, lh.TenLoai, \n" + 
			"	group_concat(concat(SLMH.TenMH, ':', SLMH.TongSoLuongMH) SEPARATOR ',') SoLuongMoiMH,\n" + 
			"    sum(SLMH.TongSoLuongMH) TongSoLuong\n" + 
			"FROM loaihang lh\n" + 
			"JOIN SoLuongMatHang SLMH ON lh.MaLoai = SLMH.MaLoai\n" + 
			"GROUP BY lh.MaLoai;";
	
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
	
	private static Connection conn = DBConnection.getConnection();
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;
	
	public List<ItemGroupDto> getItems() {
		List<ItemGroupDto> result = new ArrayList<>();
		
		try {
			preparedStatement = conn.prepareStatement(GET);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				ItemGroupDto itemGroupDto = new ItemGroupDto();
				itemGroupDto.setIgrId(resultSet.getInt("MaLoai"));
				itemGroupDto.setIgrName(resultSet.getString("TenLoai"));
				itemGroupDto.setTotalOfItems(resultSet.getInt("TongSoLuong"));
				String itemAmountsString = resultSet.getString("SoLuongMoiMH");
				String[] itemAmountStrings = itemAmountsString.split(",");
				List<ItemAmount> items = new ArrayList<>();
				Stream.of(itemAmountStrings).forEach(
						element -> {
							String[] itemString = element.split(":");
							items.add(new ItemAmount(itemString[0], Integer.parseInt(itemString[1])));
						});
				itemGroupDto.setItemAmounts(items);
				result.add(itemGroupDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(resultSet, preparedStatement);
		};
		
		return result;
	}
	
	public List<ItemGroup> getAllById(){
		return getAllByField(GET_ALL_BY_ID_ASC);
	}
	
	public List<ItemGroup> getAllByName(){
		return getAllByField(GET_ALL_BY_NAME_ASC);
	}
}
