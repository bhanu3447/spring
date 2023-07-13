package org.bhanu.orderservice.dto;

import java.io.Serializable;

public class OrderDto  implements Serializable
{
  private long productId;
  
  private long quantity;
  
  private String paymentMode;

public long getProductId() {
	return productId;
}

public void setProductId(long productId) {
	this.productId = productId;
}

public long getQuantity() {
	return quantity;
}

public void setQuantity(long quantity) {
	this.quantity = quantity;
}

public String getPaymentMode() {
	return paymentMode;
}

public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}
  
  
}
