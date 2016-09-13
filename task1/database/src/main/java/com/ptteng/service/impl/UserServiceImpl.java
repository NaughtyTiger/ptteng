package com.ptteng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptteng.dao.UserDAO;
import com.ptteng.model.User;
import com.ptteng.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  
  @Autowired
  private UserDAO userDAO;

  @Override
  public int insertUser(User user) {
    return userDAO.insertUser(user);
  }

}
