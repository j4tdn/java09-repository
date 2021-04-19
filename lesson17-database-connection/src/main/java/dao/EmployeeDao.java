package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import org.apache.commons.codec.digest.DigestUtils;

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
	
	public Optional<Employee> login(String username, String password) {
		Employee emp = null;
		
		String sql = "SELECT MaNV AS "+ Employee.ID + ", \n"
				+ "			 TenNV AS "+ Employee.FULLNAME +", \n"
				+ "			 Email AS "+ Employee.EMAIL +", \n"
				+ "			 DiaChi AS " + Employee.ADDRESS +" \n"
				+ "FROM NhanVien \n"
				+ "WHERE Email = ? \n"
				+ "AND MatKhau = ?";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, DigestUtils.md2Hex(password));
			rs = pst.executeQuery();
			if (rs.next()) {
				emp = transformer();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		
		return Optional.ofNullable(emp);
	}

	private Employee transformer() throws SQLException {
		Employee emp = new Employee();
		emp.setEmpId(rs.getInt(Employee.ID));
		emp.setFullName(rs.getString(Employee.FULLNAME));
		emp.setEmail(rs.getString(Employee.EMAIL));
		emp.setAddress(rs.getString(Employee.FULLNAME));
		
		return emp;
	}
}
