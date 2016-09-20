package com.ptteng.dao;

import com.ptteng.model.User;

public interface UserDAO {
  /**
   * return the number of users in TABLE student
   * @return
   */
  public int countUsers();
  
  /**
   * insert a new user into TABLE student
   * @param user
   * @return
   */
  public int insertUser(User user);

  /**
   * select a user from TABLE student by id
   * @param id
   * @return
   */
  public User selectUserById(int id);
  
  /**
   * select all user from TABLE student
   * @return
   */
  public User[] selectUsers();
}
