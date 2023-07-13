package org.bhanu.orderservice.controller;

import org.bhanu.orderservice.dto.OrderDto;
import org.bhanu.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController 
{
//  public void processOrder(OrderDto orderDto)
//  {
//	  
//  }
//  

	@Autowired
	private OrderService  orderService; 
	
  @PostMapping(value = "/intiateOrder")
  public void intiateOrder(@RequestBody OrderDto orderDto)
  {
	  orderService.placeOrder(orderDto);
//	  String s = orderService.placeOrder(orderDto);
//	  System.out.println(s);
  }
}
