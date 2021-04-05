package dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import connection.DBConnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import utils.SqlUtils;

public class ItemGroupDao {
	
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement preStatement;
	private static ResultSet rs;
	
	static {
		conn = DBConnection.getConnection();
	}
	
	public List<ItemGroup> getAll(){
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT * FROM LoaiHang";
		Connection conn = DBConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				result.add(new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<ItemGroupDto> getItemGroupDto() {
		String sql = "WITH ThongTinMatHang AS (\r\n" + 
				"	select mh.MaMH, mh.MaLoai, mh.TenMH, sum(kcmh.SoLuong) SoLuong from MatHang mh\r\n" + 
				"    join KichCoMatHang kcmh\r\n" + 
				"		on mh.MaMH = kcmh.MaMH\r\n" + 
				"	group by mh.MaMH\r\n" + 
				")\r\n" + 
				"select lh.MaLoai, lh.TenLoai,\r\n" + 
				"group_concat(concat(mh.TenMH,':',mh.SoLuong) separator ', ') itemList,\r\n" + 
				"sum(SoLuong) SoLuong from ThongTinMatHang mh\r\n" + 
				"join loaihang lh on mh.MaLoai = lh.Maloai\r\n" + 
				"group by lh.MaLoai;";
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				result.add(new ItemGroupDto(rs.getInt("MaLoai")
											, rs.getString("TenLoai")
											, rs.getString("itemList")
											, rs.getInt("SoLuong")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	public void insertItemGroup(Path path) {
		Connection conn = DBConnection.getConnection();
		String sql = "INSERT INTO LoaiHang (MaLoai, TenLoai)"
				+ " values (?, ?)";
		
		List<String> result = null;
		
		try {
			result = Files.readAllLines(path);
			PreparedStatement preStatement = conn.prepareStatement(sql);
			result.forEach(r -> {
				String[] arr = r.split(", ");
				try {
					preStatement.setInt(1, Integer.valueOf(arr[0]));
					preStatement.setString(2, arr[1]);
					preStatement.execute();
					System.out.println(sql);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			});
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
