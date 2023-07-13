package org.bhanu.productservice.config;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletIntializer implements WebApplicationInitializer
{
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException 
	{
		 AnnotationConfigWebApplicationContext acwac = new AnnotationConfigWebApplicationContext();
		acwac.register(App.class);
		
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(acwac);
		
		
		
		Dynamic dynamic = servletContext.addServlet("dispatcher",dispatcherServlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
		
	  	
	}

}

