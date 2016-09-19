package com.ptteng.model;

import java.sql.Timestamp;

public class User {
  private int id;
  private String name;
  private Timestamp createTime;
  private Timestamp updateTime;
  
  @Override
  public User clone(){
    User newone=new User();
    newone.id=id;
    newone.name=name;
    newone.createTime=createTime;
    newone.updateTime=updateTime;
    return newone;
  }
  
  public int getId(){
    return id;
  }
  
  public void setName(String name){
    this.name=name;
  }
  
  public String getName(){
    return name;
  }
  
  /**
   * set create time once. If create time is set, throw IllegalStateException
   * @param createTime Timestamp of create time
   * @throws IllegalStateException
   */
  public void setCreateTime(Timestamp createTime){
    if (createTime==null){
      this.createTime=createTime;
    } else {
      throw new IllegalStateException();
    }
  }
  
  public Timestamp getCreateTime(){
    return createTime;
  }
  
  public void setUpdateTime(Timestamp updateTime){
    this.updateTime=updateTime;
  }
  
  public Timestamp getUpdataTime(){
    return updateTime;
  }
}
