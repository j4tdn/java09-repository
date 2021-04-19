package dao;

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
import persistence.ItemGroupDto2;
import utils.SqlUtils;

public class ItemGroupDao {
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet  rs;
	static {
		conn=DBConnection.getConnection();
	}
	

	public List<ItemGroup> getAll(){
		List<ItemGroup> result=new ArrayList<>();
		
		String sql="select * from LoaiHang";
		try {
			Statement st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				ItemGroup ig=new ItemGroup(rs.getInt("MaLoai"),rs.getString("TenLoai"));
				result.add(ig);
				System.out.println("MaLoai:"+rs.getInt("MaLoai"));
				System.out.println("TenLoai:"+rs.getString("TenLoai"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
		return result;
	}
	
	public List<ItemGroupDto> getItemGrpDto() {
		List<ItemGroupDto> result=new ArrayList<>();
		String sql="with ThongTinMatHang as(\n" + 
				"	select mh.MaMH,\n" + 
				"			mh.MaLoai,\n" + 
				"            mh.TenMH,\n" + 
				"            sum(kcmh.SoLuong) Soluong\n" + 
				"    from mathang mh\n" + 
				"    join kichcomathang kcmh on mh.MaMH=kcmh.MaMH\n" + 
				"    group by mh.MaMH\n" + 
				")\n" + 
				"select lh.MaLoai AS "+ItemGroupDto.ID+",\n"+
				"		lh.TenLoai AS "+ItemGroupDto.NAME+",\n" + 
				"        group_concat(concat(mh.TenMH,':',mh.SoLuong) separator ', ') AS "+ItemGroupDto.ITEM_DETAILS+" ,\n" + 
				"        sum(mh.SoLuong) AS "+ItemGroupDto.TOTAL_OF_ITEMS+"\n" + 
				"from ThongTinMatHang  mh\n" + 
				"join LoaiHang lh on lh.MaLoai=mh.MaLoai\n" + 
				"group by lh.MaLoai";
		try {
			st=conn.createStatement();
			 rs = st.executeQuery(sql);			
			while(rs.next()) {
				ItemGroupDto item=new ItemGroupDto();
				transformer(item);
//				ItemGroupDto item=new ItemGroupDto(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getString("Chitietmathang"), rs.getDouble("Tongsoluong"));
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs,st);
		}
		
		System.out.println("szie: " + result.size());

		return result;
	}
	public List<ItemGroupDto2> getItemGrpDto2() {
		List<ItemGroupDto2> result=new ArrayList<>();
		String sql="with ThongTinMatHang as(\n" + 
				"select mh.MaMH,							\n" + 
				"mh.MaLoai, \n" + 
				"mh.TenMH, 				            \n" + 
				"sum(kcmh.SoLuong) Soluong\n" + 
				"from mathang mh				    \n" + 
				"join kichcomathang kcmh on mh.MaMH=kcmh.MaMH \n" + 
				"group by mh.MaMH\n" + 
				")\n" + 
				"select lh.MaLoai,\n" + 
				"		lh.TenLoai,\n" + 
				"		mh.tenMH,\n" + 
				"		mh.soluong \n" + 
				"from ThongTinMatHang mh\n" + 
				"join LoaiHang lh\n" + 
				"on mh.MaLoai=lh.MaLoai";
		try {
			st=conn.createStatement();
			 rs = st.executeQuery(sql);			
			while(rs.next()) {
				ItemGroupDto2 item=new ItemGroupDto2(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getString("TenMH"), rs.getDouble("SoLuong"));
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs,st);
		}
		
		System.out.println("szie: " + result.size());

		return result;
	}
	private void transformer(ItemGroupDto item) throws SQLException {
//		 item=new ItemGroupDto(rs.getInt(ItemGroupDto.ID), rs.getString(ItemGroupDto.NAME), rs.getString(ItemGroupDto.ITEM_DETAILS), rs.getDouble(ItemGroupDto.TOTAL_OF_ITEMS));
		 item.setIgrId(rs.getInt(ItemGroupDto.ID));
		 item.setIgrName(rs.getString(ItemGroupDto.NAME));
		 item.setItemList(rs.getString(ItemGroupDto.ITEM_DETAILS));
		 item.setTotalOfItem(rs.getDouble(ItemGroupDto.TOTAL_OF_ITEMS));
	}
}
