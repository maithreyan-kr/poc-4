package com.mighty.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mighty.dao.UserDao;
import com.mighty.model.Login;
import com.mighty.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
