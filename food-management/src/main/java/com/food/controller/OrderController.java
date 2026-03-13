package com.food.controller;

import com.food.dto.OrderRequest;
import com.food.dto.OrderResponse;
import com.food.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public OrderResponse placeOrder(@RequestBody OrderRequest request){
        return orderService.placeOrder(request);
    }
}