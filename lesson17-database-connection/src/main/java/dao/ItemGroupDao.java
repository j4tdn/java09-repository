package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.ItemGroup;

public class ItemGroupDao {

	public List<ItemGroup> getAll(){
		List<ItemGroup> result=new ArrayList<>();
		
		String sql="select * from LoaiHang";
		Connection connection=DBConnection.getConnection();
		try {
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(sql);
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
}
