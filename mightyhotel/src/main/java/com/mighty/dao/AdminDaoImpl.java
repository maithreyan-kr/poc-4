package com.mighty.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mighty.model.Admin;
import com.mighty.model.AdminLogin;

public class AdminDaoImpl implements AdminDao {

	@Autowired
	DataSource datasource1;

	@Autowired
	JdbcTemplate jdbcTemplate1;


	public Admin validateAdmin(AdminLogin adminlogin) {
		String sql1 = "select * from admin where adminId='" + adminlogin.getUsername() + "' and password='"
				+ adminlogin.getPassword() + "'";
		List<Admin> admins = jdbcTemplate1.query(sql1, new AdminMapper());

		return admins.size() > 0 ? admins.get(0) : null;
	}

}

class AdminMapper implements RowMapper<Admin> {

	public Admin mapRow(ResultSet rs, int arg1) throws SQLException {
		Admin admin = new Admin();

		admin.setUsername(rs.getString("adminId"));
		admin.setPassword(rs.getString("password"));
		

		return admin;
	}
}