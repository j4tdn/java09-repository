package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import org.apache.commons.codec.digest.DigestUtils;

import connection.DBConnection;
import persistence.Employee;
import persistence.Item;
import utils.SqlUtils;

public class EmployeeDao {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rst;

	public EmployeeDao() {
		conn = DBConnection.getConnection();
	}

	public Optional<Employee> login(String userName, String password) {
		Employee employee =null;
		String sql = "select MaNV AS "+Employee.ID +" , TenNV AS "+Employee.FULLNAME +" , email AS "+Employee.EMAIL +" , diachi AS "+Employee.ADDRESS +" from nhanvien where email = ? and matkhau = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, userName);
			pst.setString(2, DigestUtils.md5Hex(password));
			rst = pst.executeQuery();
			if(rst.next()) {
//				employee = new Employee(rst.getInt(1), rst.getString(2), rst.getString(3),rst.getString(4));
				employee=tranformer();
			}  
//			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rst,pst);
		}
		

		return Optional.ofNullable(employee);
	}

	private Employee tranformer() throws SQLException {
		Employee employee=new Employee();
		employee.setEmpId(rst.getInt(Employee.ID));
		employee.setFullName(rst.getString(Employee.FULLNAME));
		employee.setEmail(rst.getString(Employee.EMAIL));
		employee.setAddress(rst.getString(Employee.ADDRESS));
		return employee;
	}
	
}
