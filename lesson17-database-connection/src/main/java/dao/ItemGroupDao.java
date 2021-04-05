package dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupDao {
	
	Connection conn = DBConnection.getConnection();
	
	public List<ItemGroup> getAll(){
		List<ItemGroup> result = new ArrayList<>();
		
		String sql = "SELECT * FROM LoaiHang";
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public ItemGroupDto getIGD(int grId) {
		String sql = "select lh.MaLoai, \r\n" + 
				"	   lh.TenLoai, \r\n" + 
				"       group_concat(TenMH, ':', SoLuong) DSMH,\r\n" + 
				"       sum(SoLuong) TongSoLuong\r\n" + 
				"from loaihang lh\r\n" + 
				"join mathang mh on lh.MaLoai = mh.MaLoai\r\n" + 
				"join kichcomathang kcmh on kcmh.MaMH = mh.MaMH\r\n" + 
				"where lh.MaLoai = 1";
	}
	
}
