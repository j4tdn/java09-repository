package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.codec.digest.DigestUtils;

import java.sql.SQLException;

import connection.DBConnection;
import persistence.Employee;
import utils.SqlUtils;

public class EmployeeDao {
	
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public EmployeeDao() {
		conn = DBConnection.getConnection();
	}

	public Employee login(String username, String password) {
		Employee emp = null;
		String sql = "SELECT MaNV AS " + Employee.ID
				+ "			, TenNV AS " + Employee.FULLNAME
				+ "			, Email AS " + Employee.EMAIL
				+ "			, DiaChi AS " + Employee.ADDRESS + "\n"
				+ "FROM NhanVien \n"
				+ "WHERE email = ?\n"
				+ " AND MatKhau = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, DigestUtils.md5Hex(password));
			rs = pst.executeQuery();
			
			if (rs.next()) {
				emp = new Employee();
				transfomer(emp);
			} else {
				emp = null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		};
		
		return emp;
	}

	private void transfomer(Employee emp) throws SQLException {
		System.out.println(rs.getInt(Employee.ID));
		emp.setEmpId(rs.getInt(Employee.ID));
		emp.setFullName(rs.getString(Employee.FULLNAME));
		emp.setEmail(rs.getString(Employee.EMAIL));
		emp.setAddress(rs.getString(Employee.ADDRESS));
	}
}
