package com.example.demo.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderServise {
    private final OrderRepository repository;
@Autowired
    public OrderServise(OrderRepository repository) {
        this.repository = repository;
    }
    public Orders addOrder(Integer user, LocalDateTime date){
    Orders order=new Orders();
    order.setUser_id(user);
    order.setOrder_date(date);
    return repository.save(order);
    }
}
