package org.bhanu.ums.service;

import java.util.List;

import org.bhanu.ums.entity.RegisterEntity;


public interface RegisterService 
{
  public void processUserInfo(RegisterEntity registerEntity);
  
  public  List<RegisterEntity> getAllUser();
}
