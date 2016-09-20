package com.ptteng.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptteng.dao.UserDAO;
import com.ptteng.model.User;
import com.ptteng.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  
  @Autowired
  private UserDAO userDAO;
  
  private Logger logger=Logger.getLogger(UserService.class.getName());

  /**
   * return the number of user in TABLE student
   * @return
   */
  @Override
  public int countUsers(){
    int number=userDAO.countUsers();
    logger.info("Count number in TABLE student:"+number);
    return number;
  }
  
  /**
   * Insert user into TABLE student. Get back create time, update time and id. 
   * @param user
   * @return
   */
  @Override
  public int insertUser(User user) {
    int result=userDAO.insertUser(user);
    logger.info("A user whose name is "+user.getName()+" is inserted.");
    User newuser=userDAO.selectUserById(user.getId());
    user.setCreateTime(newuser.getCreateTime());
    user.setUpdateTime(newuser.getUpdataTime());
    logger.debug("user info:"+user);
    return result;
  }
  
  /**
   * Select user from TABLE student by id.
   * @param id
   * @return
   */
  @Override
  public User selectUserById(int id){
    User user=userDAO.selectUserById(id);
    logger.info("A user whose name is "+user.getName()+" is selected.");
    logger.debug("user info:"+user);
    return user;
  }
  
  /**
   * Select all users in TABLE student
   * @return An array of User
   */
  @Override
  public User[] selectUsers(){
    User[] users=userDAO.selectUsers();
    int number=userDAO.countUsers();
    logger.info("All "+number+" users are selected");
    return users;
  }

}
