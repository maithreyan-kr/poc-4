package com.mighty.dao;

import com.mighty.model.Login;
import com.mighty.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}
