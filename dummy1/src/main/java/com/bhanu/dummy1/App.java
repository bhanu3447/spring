package com.bhanu.dummy1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhanu.dummy1.config.AppConfig;
import com.bhanu.dummy1.entity.Person;

public class App 
{
public static void main(String[] args) 
{
	AnnotationConfigApplicationContext acap = new AnnotationConfigApplicationContext();
	acap.register(AppConfig.class);
	acap.refresh();
	
	Person p = acap.getBean(Person.class);
	p.goingToWprk();
}
}