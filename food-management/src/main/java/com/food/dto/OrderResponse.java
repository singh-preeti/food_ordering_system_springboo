package com.food.dto;
//Bill Generation
public class OrderResponse {

    private String foodName;
    private int quantity;
    private double price;
    private double totalBill;

    public OrderResponse(String foodName, double price, int quantity, double totalBill) {
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
        this.totalBill = totalBill;
    }

    public OrderResponse() {
    }
    // getters setters

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}