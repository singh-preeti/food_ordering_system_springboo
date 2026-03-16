package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.food.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
