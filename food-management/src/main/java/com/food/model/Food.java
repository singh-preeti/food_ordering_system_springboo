package com.food.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Food {

    @Id
    private int food_id;


    @NotBlank(message = "Food name cannot be empty")
    private String foodName;

    @Min(value = 1, message = "Price must be greater than 0")
    private double price;


    public Food() {
    }

    public Food(int food_id, String foodName, double price) {
        this.food_id = food_id;
        this.foodName = foodName;
        this.price = price;
    }

    // getters setters

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

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
}