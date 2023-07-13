package org.bhanu.orderservice.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "order_info")
public class OrderEntity implements Serializable
{
  @Id
  @GenericGenerator(name = "auto",strategy = "increment")
  @GeneratedValue(generator = "auto")
  @Column(name = "alt_key")
  private long altkey;
  
  @Column(name = "product_id")
  private long productId;
  
  @Column(name = "quantity")
  private long quantity;
  
  @Column(name = "total_price")
  private double totalPrice;
  
  @Column(name = "payment_mode")
  private String paymentMode;
  
  @Column(name = "sold_date")
   private Date soldDate;

public long getAltkey() {
	return altkey;
}

public void setAltkey(long altkey) {
	this.altkey = altkey;
}

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

public double getTotalPrice() {
	return totalPrice;
}

public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}

public String getPaymentMode() {
	return paymentMode;
}

public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}

public Date getSoldDate() {
	return soldDate;
}

public void setSoldDate(Date soldDate) {
	this.soldDate = soldDate;
}
  
  
}
