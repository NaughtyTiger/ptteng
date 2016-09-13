package com.ptteng;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ptteng.model.User;
import com.ptteng.service.UserService;

public class UserTest {
  private UserService userService;
  
  @Before
  public void setup(){
    @SuppressWarnings("resource")
    ApplicationContext context=new ClassPathXmlApplicationContext(
        new String[]{"classpath:spring.xml", "classpath:spring-mybatis.xml"});
    userService=(UserService) context.getBean("userServiceImpl");
  }
  
  @Test
  public void addUser(){
    User user=new User();
    user.name="Shawn Marion";
    System.out.println(user.id);
    System.out.println(userService.insertUser(user));
    System.out.println(user.id);
  }

}
