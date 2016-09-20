package com.ptteng;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ptteng.model.User;
import com.ptteng.service.UserService;

public class UserServiceTest {
  private static UserService userService;
  
  @BeforeClass
  public static void setup(){
    @SuppressWarnings("resource")
    ApplicationContext context=new ClassPathXmlApplicationContext(
        new String[]{"classpath:spring.xml", "classpath:spring-mybatis.xml"});
    userService=(UserService) context.getBean("userServiceImpl");
  }
  
  @Test
  public void addUser(){
    int numberBefore=userService.countUsers();
    User user=new User();
    user.setName("Shawn Marion");
    userService.insertUser(user);
    //TODO time assert
    int numberAfter=userService.countUsers();
    assertEquals(numberBefore, numberAfter-1);
  }
  
  @Test
  public void selectUserById(){
    User user=userService.selectUserById(5);
    assertEquals("Ron Artest",user.getName());
  }

  @Test
  public void selectUser(){
    User users[]=userService.selectUsers();
    assertEquals(userService.countUsers(), users.length);
  }
  
}
