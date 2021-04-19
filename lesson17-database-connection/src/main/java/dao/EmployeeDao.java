package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import org.apache.commons.codec.digest.DigestUtils;

import connection.DBCconnection;
import persistence.Employee;
import utils.SqlUtils;

public class EmployeeDao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	public EmployeeDao() {
		conn= DBCconnection.getConnection();
	}
	public Optional<Employee> login(String username, String password) {
		Employee emp = null;
		String sql = "SELECT MaNV as "+ Employee.ID +" ,\n"
					+"		TenNV as " +Employee.FULLNAME + ",\n"
					+"		Email as "+ Employee.EMAIL +",\n"
					+"		DiaChi as " + Employee.ADDRESS +"\n"
					+"FROM NhanVien \n" 
					+"where Email=? \n"
					+"and MatKhau = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, DigestUtils.md5Hex(password));
			rs = pst.executeQuery();
			if(rs.next()) {
				emp = transformer();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return Optional.ofNullable(emp);
	}
	private Employee transformer () throws SQLException {
		Employee emp = new Employee();	
		emp.setEmId(rs.getInt(Employee.ID));
		emp.setEmail((rs.getString(Employee.EMAIL)));
		emp.setFullname(rs.getString(Employee.FULLNAME));
		emp.setAddress(rs.getString(Employee.ADDRESS));	
		return emp;
	}
}
