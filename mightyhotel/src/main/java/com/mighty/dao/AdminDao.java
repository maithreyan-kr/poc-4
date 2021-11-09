package com.mighty.dao;

import com.mighty.model.Admin;
import com.mighty.model.AdminLogin;

public interface AdminDao {

	Admin validateAdmin(AdminLogin adminlogin);
}
