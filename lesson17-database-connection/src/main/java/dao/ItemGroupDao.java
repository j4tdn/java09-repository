package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import dto.ItemGroupDto;
import persistence.ItemGroup;
import utils.SqlUtils;

public class ItemGroupDao {
	private static Connection connection;
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;
	
	static {
		connection = DBConnection.getConnection();
	}
	public  List<ItemGroup> getAll(){
		List<ItemGroup> result = new ArrayList<>();
		//b1. write down a native query
		String sql = "SELECT *  FROM loaihang";
		connection = DBConnection.getConnection();
		try {
			st =  connection.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<ItemGroupDto> getItemGrpDetails() {
		List<ItemGroupDto> result = new ArrayList<>();
		
		String sql = "WITH SoLuongMatHang AS (\r\n" + 
				"	SELECT mh.MaMH, mh.TenMH, mh.MaLoai, sum(kcmh.SoLuong) SoLuongTheoMH\r\n" + 
				"    FROM mathang mh JOIN kichcomathang kcmh ON mh.MaMH = kcmh.MaMH\r\n" + 
				"    GROUP BY mh.MaMH \r\n" + 
				")\r\n" + 
				"SELECT lh.MaLoai "+ ItemGroupDto.IGR_ID + ",\r\n" + 
				"		lh.TenLoai "+ ItemGroupDto.IGR_NAME +",\r\n" + 
				"        group_concat(concat(mh.TenMH, ' : ' , slmh.SoLuongTheoMH)) "+ ItemGroupDto.ITEM_LIST +",\r\n" + 
				"        sum(slmh.SoLuongTheoMH) "+ ItemGroupDto.TOTAL_OF_ITEMS +"\r\n" + 
				"FROM mathang mh JOIN loaihang lh ON mh.MaLoai = lh.MaLoai JOIN SoLuongMatHang slmh ON mh.MaMH = slmh.MaMH\r\n" + 
				"GROUP BY lh.MaLoai";
		try {
			st =  connection.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ItemGroupDto item = new ItemGroupDto();//rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getString("DS"), rs.getInt("TongSoLuong")
				item.setIgrId(rs.getInt(ItemGroupDto.IGR_ID));
				item.setIgrName(rs.getString(ItemGroupDto.IGR_NAME));
				item.setItemList(rs.getString(ItemGroupDto.ITEM_LIST));
				item.setTotalOfItems(rs.getInt(ItemGroupDto.TOTAL_OF_ITEMS));
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
