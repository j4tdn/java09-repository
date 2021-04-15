package dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import utils.SqlUtils;

public class ItemGroupDao {
	
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public ItemGroupDao() {
		conn = DBConnection.getConnection();
	}
	
	public List<ItemGroup> getAll(){
		List<ItemGroup> result = new ArrayList<>();
		
		String sql = "SELECT * FROM LoaiHang";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<ItemGroupDto> getItemDetails() {
		List<ItemGroupDto> result = new ArrayList<>();
		String sql = "with ThongTinMatHang as (\n" + 
				"	select mh.MaMH,\n" + 
				"		   mh.MaLoai,\n" + 
				"           mh.TenMH,\n" + 
				"           sum(kcmh.SoLuong) SoLuong\n" + 
				"    from mathang mh\n" + 
				"    join kichcomathang kcmh\n" + 
				"    on mh.MaMH = kcmh.MaMH\n" + 
				"    group by mh.MaMH\n" + 
				")\n" + 
				"select lh.MaLoai as "+ ItemGroupDto.ID +", \n" + 
				"	   lh.TenLoai as "+ ItemGroupDto.NAME +", \n" + 
				"       group_concat(mh.TenMH, ':', mh.SoLuong) as "+ ItemGroupDto.ITEM_DETAILS + ",\n" + 
				"       sum(mh.SoLuong) as " + ItemGroupDto.TOTAL_OF_ITEMS + "\n" + 
				"from thongtinmathang mh\n" + 
				"join loaihang lh on lh.MaLoai = mh.MaLoai\n" + 
				"group by lh.MaLoai";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroupDto igr = new ItemGroupDto();
				transformer(igr);
				result.add(igr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return result;
	}
	
	private void transformer(ItemGroupDto igr) throws SQLException {
		igr.setId(rs.getInt(ItemGroupDto.ID));
		igr.setName(rs.getString(ItemGroupDto.NAME));
		igr.setItemDetails(rs.getString(ItemGroupDto.ITEM_DETAILS));	
		igr.setTotalOfItems(rs.getDouble(ItemGroupDto.TOTAL_OF_ITEMS));
	}
}
