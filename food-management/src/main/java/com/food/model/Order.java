package com.food.model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    private int quantity;

    private double totalAmount;

    @ManyToOne
    @JoinColumn(name="food_id")
    private Food food;

    public Order() {
    }

    public Order(Food food, int order_id, int quantity, double totalAmount) {
        this.food = food;
        this.order_id = order_id;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    // getters setters


    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}