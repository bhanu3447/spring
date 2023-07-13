package com.bhanu.dummy1.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person 
{
	@Autowired @Qualifier("Car")
	Vehicle v;
	
	public void goingToWprk()
	{
		System.out.println(v.getClass()+"in a bike");
	}
	
	
	
}
