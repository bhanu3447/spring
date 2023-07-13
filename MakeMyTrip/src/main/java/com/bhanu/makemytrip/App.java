package com.bhanu.makemytrip;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhanu.makemytrip.config.AppConfiguation;
import com.bhanu.makemytrip.util.BookTicket;
import com.bhanu.makemytrip.util.PaymentGateWay;

public class App 
{
public static void main(String[] args) 
{
	AnnotationConfigApplicationContext acap = new AnnotationConfigApplicationContext();
	acap.register(AppConfiguation.class);
	acap.refresh();
	PaymentGateWay p = acap.getBean(PaymentGateWay.class);
	BookTicket b = acap.getBean(BookTicket.class);
	p.makePayment();
	System.out.println(p);
	acap.getBean(PaymentGateWay.class);
	acap.getBean(PaymentGateWay.class);
	acap.getBean(PaymentGateWay.class);
	acap.getBean(PaymentGateWay.class);
	acap.getBean(PaymentGateWay.class);
	acap.getBean(PaymentGateWay.class);
	
	
	  }
}
