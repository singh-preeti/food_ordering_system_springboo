package com.food.controller;


import com.food.model.Food;
import com.food.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    // Add Food
    @PostMapping("/add")
    public Food addFood(@RequestBody Food food) {
        return foodRepository.save(food);
    }

    // Get All Food
    @GetMapping("/all")
    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }

    // Get Food By Id
    @GetMapping("/{id}")
    public Food getFoodById(@PathVariable int id) {
        return foodRepository.findById(id).get();
    }

    // Update Food
    @PutMapping("/update/{id}")
    public Food updateFood(@PathVariable int id, @RequestBody Food food) {

        Food f = foodRepository.findById(id).get();

        f.setFoodName(food.getFoodName());
        f.setPrice(food.getPrice());

        return foodRepository.save(f);
    }

    // Delete Food
    @DeleteMapping("/delete/{id}")
    public String deleteFood(@PathVariable int id) {

        foodRepository.deleteById(id);

        return "Food deleted successfully";
    }
}