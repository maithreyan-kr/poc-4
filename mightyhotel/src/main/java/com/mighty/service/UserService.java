package com.mighty.service;

import com.mighty.model.Login;
import com.mighty.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
