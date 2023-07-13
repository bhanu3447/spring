package org.bhanu.ums.controller;

import java.util.List;

import org.bhanu.ums.entity.RegisterEntity;
import org.bhanu.ums.service.imp.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
@RestController
public class RegisterRestController 
{
	@Autowired
	private RegisterServiceImpl registerServiceImpl;
	
	
//  @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
  @GetMapping(value = "/getAllUser")
  public @ResponseBody List<RegisterEntity> getAllUser()
  {
	  return registerServiceImpl.getAllUser(); 
  }
	
//	@RequestMapping(value ="/saveRegisterDetails",method = RequestMethod.POST)
    @PostMapping(value = "/saveRegisterDetails")
	public void saveRegisterDetails(@RequestBody RegisterEntity registerEntity)
	{
		 registerServiceImpl.processUserInfo(registerEntity); 
	 
	}
}
