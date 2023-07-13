package org.bhanu.productservice.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class MySqlDbconfiguration 
{

	@Bean
	public LocalSessionFactoryBean getSessionFactory()
	{
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setHibernateProperties(getConnectionProperties());
		sessionFactory.setPackagesToScan("org.bhanu.ums.entity");
		return sessionFactory;
	}
	
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_db");
		dataSource.setUsername("root");
		dataSource.setPassword("ROOT");
	    return dataSource;
	
	    
	 }
	
	
	public static Properties getConnectionProperties()
	{
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
