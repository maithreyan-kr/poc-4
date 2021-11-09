package com.mighty.service;

import com.mighty.model.Admin;
import com.mighty.model.AdminLogin;

public interface AdminService {

 

  Admin validateAdmin(AdminLogin adminlogin);
}
