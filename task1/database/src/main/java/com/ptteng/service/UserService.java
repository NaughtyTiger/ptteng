package com.ptteng.service;

import com.ptteng.model.User;

public interface UserService {
  public int insertUser(User user);
  
  public User selectUserById(int id);
}
