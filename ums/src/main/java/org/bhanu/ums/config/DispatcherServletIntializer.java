package org.bhanu.ums.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.omg.DynamicAny._DynAnyFactoryStub;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletIntializer implements WebApplicationInitializer
{
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException 
	{
		 AnnotationConfigWebApplicationContext acwac = new AnnotationConfigWebApplicationContext();
		acwac.register(Appconfiguration.class);
		
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(acwac);
		
		
		
		Dynamic dynamic = servletContext.addServlet("dispatcher",dispatcherServlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
		
	  	
	}

}
