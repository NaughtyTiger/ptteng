package com.ptteng;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
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
  
  @Ignore
  @Test
  public void addUser(){
    User user=new User();
    user.setName("Shawn Marion");
    System.out.println(userService.insertUser(user));
    System.out.println(user.getId());
    System.out.println(user.getCreateTime());
  }
  
  @Test
  public void selectUserById(){
    User user=userService.selectUserById(5);
    assertEquals("Ron Artest",user.getName());
  }

}
