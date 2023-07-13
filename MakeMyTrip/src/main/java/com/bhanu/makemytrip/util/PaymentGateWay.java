package com.bhanu.makemytrip.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class PaymentGateWay
{
	@Value("sbi0001912")
	private String cardNumber;
	
	@Value("user@hdfc.com")
	private String userName;
	
	  public PaymentGateWay()
	  {
		  System.out.println(this.getClass().getSimpleName()+"class object create");
	  }
	 public void makePayment()
	  {
		  System.out.println("payment made successfully!!");
	  }
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "PaymentGateWay [cardNumber=" + cardNumber + ", userName=" + userName + "]";
	}
	 
}
