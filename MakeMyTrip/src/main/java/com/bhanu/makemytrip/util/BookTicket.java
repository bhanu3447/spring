package com.bhanu.makemytrip.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class BookTicket
{
	@Autowired
	private PaymentGateWay paymentgateway;
	
  public BookTicket()
  {
	  System.out.println(this.getClass().getSimpleName()+"class object create");
  }

@Override
public String toString() {
	return "BookTicket [paymentgateway=" + paymentgateway + "]";
}


 
}
