package com.java.test.repository;

import com.java.test.mapper.OrderMapper;
import com.java.test.model.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

 @Repository
  public class OrderRepositoryImpl implements OrderRepository {
  @Autowired
    private JdbcTemplate jdbcTemplate;
  @Autowired
  private OrderMapper orderMapper;
  @Override
  public void print(Order order) {
    int update = jdbcTemplate.update("insert into Society(id,name,price) values (?,?,?)",
    order.getId(),order.getName(),order.getPrice());
  }
  @Override
  public Order getOrder(int orderId) {
    Order order = jdbcTemplate.queryForObject("select id, name, price from Order where id=?" , new Object[]{orderId},orderMapper);
    return order;
  }
  @Override
  public void deleteOrder(int orderId) {
    jdbcTemplate.update("delete from Order where id=?", new Object[]{orderId});
  }
  @Override
  public void updateOrder(Order order) {
    jdbcTemplate.update("update Order set price='40' where name =?", new Object[]{order.getName()});

  }
}
