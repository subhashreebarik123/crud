package com.java.test.controller;


import com.java.test.model.Order;
import com.java.test.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    public class OrderController {
    @Autowired
    OrderServiceImpl orderServiceimpl;

   @PostMapping ("/createOrder")
    public String createOrder(@RequestBody Order order) {
       orderServiceimpl.display(order);
       return "Order is Succesfully Created";
   }
    @GetMapping("/Order/{id}")
    public Order getOrder(@PathVariable int id){

       return  orderServiceimpl.getOrder(id);
    }
    @GetMapping("/order")
    @ResponseBody
    public String getOrder() {
            return "Hello, this is a response body example!";
    }
    @GetMapping("/orders")
    public String getOrderByName(@RequestParam String name) {
            return "Order: " + name;
    }
    @DeleteMapping("/order/{id}")
    public String deleteOrder(@PathVariable  int  id){
       orderServiceimpl.deleteOrder(id);

       return "Order deleted having order id:" + id;
   }
   @PutMapping("/order/update")
    public String  updateOrder(@RequestBody Order order) {
        orderServiceimpl.updateOrder(order);
        return "Order updated:"+order.getName();
   }
   }




