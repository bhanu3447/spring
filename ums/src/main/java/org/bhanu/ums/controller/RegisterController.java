package org.bhanu.ums.controller;

import org.bhanu.ums.entity.RegisterEntity;
import org.bhanu.ums.service.imp.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Component
@Controller
public class RegisterController 
{
	
//	@RequestMapping(value = "/saveUserDetails")
//	   public ModelAndView saveUserDetails(RegisterDto  registerDto)
//	   {
//		   System.out.println(registerDto);
//		   return new ModelAndView("index.jsp");
//     }
	
	
	@Autowired
	private RegisterServiceImpl registerServiceImpl;
	
	
   @RequestMapping(value = "/saveUserDetails")
   public ModelAndView saveUserDetails(RegisterEntity  registerEntity)
   {
	   System.out.println(registerEntity);
	   registerServiceImpl.processUserInfo(registerEntity);
	   
	   return new ModelAndView("index.jsp");
   }
}
