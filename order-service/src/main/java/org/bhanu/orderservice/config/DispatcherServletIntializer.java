package org.bhanu.orderservice.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletIntializer  implements WebApplicationInitializer
{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException 
	{
		AnnotationConfigWebApplicationContext acwa = new AnnotationConfigWebApplicationContext();
		acwa.register(App.class);
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(acwa);

		
		Dynamic dynamic = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
		
	}

}
