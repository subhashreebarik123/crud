package com.java.test.service;


import com.java.test.Model.Order;
import com.java.test.repository.OrderRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  OrderRepositoryImpl orderRepositoryImpl;

  @Override
  public void display(Order order) {
    orderRepositoryImpl.print(order);
  }
  @Override
  public Order getOrder(int orderId) {
    return  orderRepositoryImpl.getOrder(orderId);

  }
  @Override
  public void deleteOrder(int orderId) {
  orderRepositoryImpl.deleteOrder(orderId);
  }
  @Override
  public void updateOrder(Order order) {
 orderRepositoryImpl.updateOrder(order);
  }
}