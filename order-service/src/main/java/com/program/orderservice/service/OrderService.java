package com.program.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.program.orderservice.entity.OrderLineItems;
import com.program.orderservice.repository.OrderRepository;

@Component
public class OrderService {
    @Autowired
	public OrderRepository orderRepository;

	public String addOrder(OrderLineItems orderLineItems) {
		  orderRepository.save(orderLineItems);
		return "Order Placed successfully";
	}
}
