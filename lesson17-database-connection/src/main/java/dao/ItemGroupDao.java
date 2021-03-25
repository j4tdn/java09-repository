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

public class ItemGroupDao {
	public  List<ItemGroup> getAll(){
		List<ItemGroup> result = new ArrayList<>();
		//b1. write down a native query
		String sql = "SELECT *  FROM loaihang";
		Connection connection = DBConnection.getConnection();
		try {
			Statement st =  connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		
		return result;
	}
}
