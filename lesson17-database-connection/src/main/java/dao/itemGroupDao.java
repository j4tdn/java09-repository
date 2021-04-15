package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Transformer;

import com.mysql.cj.protocol.Resultset;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import utils.SqlUtils;

public class itemGroupDao {
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;
	public itemGroupDao() {
		conn = DbConnection.getConnection();
		
	}
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT* FROM LoaiHang";
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
	public List<ItemGroupDto> getItemGruopDetail(){
		List<ItemGroupDto> result = new ArrayList<>();
	 String sql="WITH ThongTinMatHang AS(\n" + 
				"	SELECT mh.MaMH,\n" + 
				"		   mh.MaLoai,\n" + 
				"           mh.TenMH,\n" + 
				"           SUM(kcmh.SoLuong) SoLuong\n" + 
				"    FROM MatHang mh\n" + 
				"    JOIN KichCoMatHang kcmh\n" + 
				"     ON mh.MaMh = kcmh.MaMh\n" + 
				"	group by mh.MaMh\n" + 
				")\n" + 
				"SELECT lh.MaLoai "+ ItemGroupDto.ID +",\n" + 
				"	   lh.TenLoai "+ ItemGroupDto.NAME+",\n" + 
				"       group_concat(concat(MH.TenMH,':',mh.SoLuong )SEPARATOR ',') "+ItemGroupDto.ITEM_DETAIL+",\n" + 
				"       sum(mh.SoLuong)"+ ItemGroupDto.TOTAL_OF_ITEM+"\n" + 
				"FROM ThongTinMatHang mh\n" + 
				"JOIN LoaiHang lh\n" + 
				" ON mh.Maloai = lh.MaLoai\n" + 
				" group by lh.MaLoai;\n" + 
				" ";
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
			SqlUtils.close(rs,st);
		}
			return result;
	}
	private void transformer(ItemGroupDto igr) throws SQLException{ 
		igr.setIgrId(rs.getInt(ItemGroupDto.ID ));
		igr.setIgrName(rs.getString(ItemGroupDto.NAME));
		igr.setItemList(rs.getString(ItemGroupDto.ITEM_DETAIL));
		igr.setTotalOfItem(rs.getInt(ItemGroupDto.TOTAL_OF_ITEM));
}
}
