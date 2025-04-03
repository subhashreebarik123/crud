package com.java.test.mapper;

import com.java.test.Model.Order;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class OrderMapper implements RowMapper<Order> {
    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
      Order order = new Order();
      order.setId(rs.getInt("id"));
      order.setName(rs.getString("name"));
      order.setPrice(rs.getInt("price"));
      return order;
    }
}
