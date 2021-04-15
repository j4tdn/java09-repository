package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBCconnection;
import connection.DBCconnection;
import dto.ItemGroupDto;
import persistence.ItemGroup;
import utils.SqlUtils;

public class ItemGroupDtoDao {
	private static Connection connection;
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;

	static {
		connection = DBCconnection.getConnection();
	}

	public List<ItemGroupDto> getIgrDto() {
		List<ItemGroupDto> result = new ArrayList<>();

		String sql = "WITH SoLuongMatHang AS (\r\n" + 
				"	SELECT mh.MaMH, mh.TenMH, mh.MaLoai, sum(kcmh.SoLuong) SoLuongTheoMH\r\n" + 
				"    FROM mathang mh JOIN kichcomathang kcmh ON mh.MaMH = kcmh.MaMH\r\n" + 
				"    GROUP BY mh.MaMH \r\n" + 
				")\r\n" + 
				"SELECT lh.MaLoai,\r\n" + 
				"		lh.TenLoai,\r\n" + 
				"        group_concat(concat('{', mh.TenMH, ' : ' , slmh.SoLuongTheoMH, '}')) DS,\r\n" + 
				"        sum(slmh.SoLuongTheoMH) TongSoLuong\r\n" + 
				"FROM mathang mh JOIN loaihang lh ON mh.MaLoai = lh.MaLoai JOIN SoLuongMatHang slmh ON mh.MaMH = slmh.MaMH\r\n" + 
				"GROUP BY lh.MaLoai";
		try {
			st =  connection.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ItemGroupDto item = new ItemGroupDto(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getString("DS"), rs.getInt("TongSoLuong"));
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);		
		}

		return result;
	}
}
