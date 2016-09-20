package com.ptteng.model;

import java.sql.Timestamp;

public class User {
  private int id;
  private String name;
  private Timestamp create_at;
  private Timestamp update_at;
  
//  @Override
//  public User clone(){
//    User newone=new User();
//    newone.id=id;
//    newone.name=name;
//    newone.createTime=createTime;
//    newone.updateTime=updateTime;
//    return newone;
//  }
  
  @Override
  public String toString(){
    String result=null;
    result+="id:"+id;
    result+=" name:"+name;
    result+=" create at:"+create_at;
    result+=" update at:"+update_at;
    return result;
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
      this.create_at=createTime;
    } else {
      throw new IllegalStateException();
    }
  }
  
  public Timestamp getCreateTime(){
    return create_at;
  }
  
  public void setUpdateTime(Timestamp updateTime){
    this.update_at=updateTime;
  }
  
  public Timestamp getUpdataTime(){
    return update_at;
  }
}
