package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

import connection.DBConnection;
import persitence.ItemGroup;

public class ItemGroupDao {
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
}
