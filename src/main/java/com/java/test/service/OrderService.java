package com.java.test.service;

import com.java.test.Model.Order;


public interface OrderService {
     void display(Order order);

     Order getOrder(int orderId);

     void deleteOrder (int orderId);

     void updateOrder(Order order);
}
