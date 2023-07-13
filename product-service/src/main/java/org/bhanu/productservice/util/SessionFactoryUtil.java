package org.bhanu.productservice.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class SessionFactoryUtil
{
   
   @Bean
	public LocalSessionFactoryBean getSessionFactory()
	{
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setHibernateProperties(getConnectionProperties());
		sessionFactory.setPackagesToScan("org.bhanu.productservice.entity");
		return sessionFactory;
	}
   
   
   @Bean
   public DataSource getDataSource()
   {
	   DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/rest_db");
		dataSource.setUsername("root");
		dataSource.setPassword("ROOT");
	    return dataSource;

   }
   
   public static Properties getConnectionProperties()
   {
//	   Properties p=new Properties();
//	   p.setProperty("hibernate.show_sql", "true");
//	   p.setProperty("hibernate.hbm2ddl.auto", "true");
//	   
//	   return p;
	   Properties properties=new Properties();
//		 properties.setProperty("connection.driver_class","com.mysql.cj.Driver");
//		 properties.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/config_db");
//		 properties.setProperty("hibernate.connection.username","root");
//		 properties.setProperty("hibernate.connection.password","ROOT");
		 properties.setProperty("hibernate.show_sql","true");
		 properties.setProperty("hibernate.hbm2ddl.auto","update");
		 return properties;
   }
}
