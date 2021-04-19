package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import javax.xml.transform.Transformer;

import org.apache.commons.codec.digest.DigestUtils;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

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
		Employee emp = new Employee();
		String sql = "SELECT MaNV AS "+Employee.ID +", \n"
				+"            TenNV AS "+Employee.FULLNAME +",  \n"
				+"            Email AS "+Employee.EMAIL +", \n"
				+"            DiaChi AS "+Employee.ADDRESS +", \n"
				+ "FROM NhanVien \n"
				+ " WHERE email = ?"
				+ "AND MatKhau= ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, DigestUtils.md5Hex(password));
			rs = pst.executeQuery();
			if (rs.next()) {
				emp = tranformer();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);

		}

		return Optional.ofNullable(emp);
	}
	private Employee tranformer() throws SQLException {
		Employee emp = new Employee();
		emp.setEmpId(rs.getInt(Employee.ID));
		emp.setFullName(rs.getString(Employee.FULLNAME));
		emp.setEmail(rs.getString(Employee.EMAIL));
		emp.setAddress(rs.getString(Employee.ADDRESS));
		return emp;
	}

}
 