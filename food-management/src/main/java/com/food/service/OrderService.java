package com.food.service;

import com.food.dto.OrderRequest;
import com.food.dto.OrderResponse;
import com.food.model.Food;
import com.food.model.Order;
import com.food.repository.FoodRepository;
import com.food.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private OrderRepository orderRepository;

    public OrderResponse placeOrder(OrderRequest request){

        Food food = foodRepository.findById(request.getFood_id())
                .orElseThrow(() -> new RuntimeException("Food not found"));

        double total = food.getPrice() * request.getQuantity();

        Order order = new Order();
        order.setFood(food);
        order.setQuantity(request.getQuantity());
        order.setTotalAmount(total);

        orderRepository.save(order);

        OrderResponse response = new OrderResponse();
        response.setFoodName(food.getFoodName());
        response.setQuantity(request.getQuantity());
        response.setPrice(food.getPrice());
        response.setTotalBill(total);

        return response;
    }
}