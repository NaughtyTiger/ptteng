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

  /**
   * Insert user into TABLE student. Get back create time, update time and id. 
   * @param user
   * @return
   */
  @Override
  public int insertUser(User user) {
    int result=userDAO.insertUser(user);
    User newuser=userDAO.selectUserById(user.getId());
    user.setName(newuser.getName());
    user.setCreateTime(newuser.getCreateTime());
    user.setUpdateTime(newuser.getUpdataTime());
    return result;
  }
  
  /**
   * Select user from TABLE student by id.
   * @param id
   * @return
   */
  @Override
  public User selectUserById(int id){
    return userDAO.selectUserById(id);
  }

}
