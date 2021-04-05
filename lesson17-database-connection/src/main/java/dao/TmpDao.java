package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.lang.model.element.Element;

import connection.DBConnection;
import dto.ItemAmount;
import dto.ItemGroupDto;
import persistence.Item;
import utils.SqlUtils;

public class TmpDao {
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
}
