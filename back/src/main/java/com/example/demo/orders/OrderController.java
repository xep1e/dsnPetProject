package com.example.demo.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "api/v1/orders")
public class OrderController {
    private final OrderServise orderServise;
@Autowired
    public OrderController(OrderServise orderServise) {
        this.orderServise = orderServise;
    }
    @PostMapping
    public void regOrder(@RequestBody Orders order){
    orderServise.addOrder(order.getUser_id(),order.getOrder_date());

    }
}
