package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

import connection.DBConnection;
import persitence.Item;
import persitence.ItemGroup;
import persitence.ItemGroupDto;
import utils.SqlUtils;

public class ItemGroupDao {
	private static Connection connection;
	private static Statement st;
	private static ResultSet rs;
	private static PreparedStatement pst;
	public List<ItemGroup> getAll(){
		List<ItemGroup> result = new ArrayList<>();
		
		String sql="SELECT * FROM LoaiHang";
		Connection connection = DBConnection.getConnection();
		try {
			java.sql.Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				ItemGroup ig= new ItemGroup(rs.getInt("MaLoai"),rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (Exception e) {
			
		}
		return result;
	}

	public List<ItemGroupDto> getTotalOfMoney(int oderID) {
		List<ItemGroupDto> result = new ArrayList<>();
		String sql =  "SELECT ctdh.MaDH,\n"
				+ "    mh.TenMH,\n"	   
				+ "	   group_concat(concat(mh.TenMH,'-', mh.GiaBan) SEPARATOR' ; ') danhsachmathang,\n"
				+ "       sum(mh.GiaBan) TongTien\n"
				+ "FROM mathang mh\n"
				+ "JOIN chitietdonhang ctdh \n"
				+ "ON mh.MaMH=ctdh.MaMH\n"
				+ "WHERE MaDH=?";
		Connection connection = DBConnection.getConnection();
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, oderID);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroupDto ig = new ItemGroupDto(rs.getInt("MaDH"),rs.getString("TenMH"), rs.getString("danhsachmathang"), rs.getInt("TongTien"));
				result.add(ig);
			}
		} catch (SQLException e) {
			
		} finally {
			SqlUtils.close(rs,pst);
		}
		System.out.println("size: " + result.size());

		return result;

	}
	public List<ItemGroupDto> getNumber() {
		List<ItemGroupDto> result = new ArrayList<>();
		String sql =  "WITH thongtinmathang AS(\n"
				+ "	SELECT mh.MaMH,\n"
				+ "		   mh.MaLoai,\n"
				+ "		   mh.TenMH,\n"
				+ "           SUM(kcmh.soluong)Soluong\n"
				+ "          FROM MatHang mh\n"
				+ "    JOIN kichcomathang kcmh\n"
				+ "    ON mh.MaMH=kcmh.MaMH\n"
				+ "    GROUP BY mh.MaMh\n"
				+ ")\n"
				+ "SELECT lh.MaLoai " + ItemGroupDto.ID + ",\n"
				+ "       lh.TenLoai " + ItemGroupDto.NAME + ",\n"
				+ "       GROUP_CONCAT(CONCAT(mh.TenMH,':', mh.SoLuong ) SEPARATOR\";\") " +ItemGroupDto.ITEM_DETAILS + ",\n"
				+ "       sum(mh.SoLuong) " + ItemGroupDto.TOTAL_OF_ITEM + "\n"
				+ "       FROM thongtinmathang mh\n"
				+ "JOIN loaihang lh ON mh.MaLoai=lh.MaLoai\n"
				+ "GROUP BY lh.MaLoai;";
		Connection connection = DBConnection.getConnection();
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroupDto tk = new ItemGroupDto(rs.getInt(ItemGroupDto.ID), rs.getString(ItemGroupDto.NAME), rs.getString(ItemGroupDto.ITEM_DETAILS),rs.getInt(ItemGroupDto.TOTAL_OF_ITEM));
				result.add(tk);
			}
		} catch (SQLException e) {
			
		} finally {
			SqlUtils.close(rs,pst);
		}
		System.out.println("size: " + result.size());

		return result;

	}
	
}
