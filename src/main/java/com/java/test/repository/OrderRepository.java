package com.java.test.repository;


import com.java.test.Model.Order;



public interface OrderRepository {
    void print (Order order);

    Order getOrder(int orderId);

    void deleteOrder(int orderId);

    void  updateOrder(Order order);
}
