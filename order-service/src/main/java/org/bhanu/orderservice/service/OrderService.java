package org.bhanu.orderservice.service;

import java.util.Date;

import org.bhanu.orderservice.dto.OrderDto;
import org.bhanu.orderservice.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService
{
	
  @Autowired
  private RestTemplate restTemplate;
	
  public String placeOrder(OrderDto orderDto)
  {
	  OrderEntity orderEntity = new OrderEntity();
	  orderEntity.setProductId(orderDto.getProductId());
	  orderEntity.setPaymentMode(orderDto.getPaymentMode());
	  orderEntity.setQuantity(orderDto.getQuantity());
	  orderEntity.setSoldDate(new Date());
	  orderEntity.setTotalPrice(1);
	  
	  
	  StringBuilder urlBuilder = new StringBuilder();
	  urlBuilder.append("http://localhost:8080/product-service/findProductPriceByProductID/");
	  urlBuilder.append(orderDto.getProductId());
	  Double  productPrice = restTemplate.getForObject(urlBuilder.toString(), double.class);
	  System.out.println("product price : "+productPrice);
	  System.out.println("product quantity : "+orderEntity.getQuantity());
	  orderEntity.setTotalPrice(productPrice*(orderDto.getQuantity()));
	  System.out.println("total price : "+orderEntity.getTotalPrice());
	  
	  return "Order Placed Successfully";
	 
  }
}