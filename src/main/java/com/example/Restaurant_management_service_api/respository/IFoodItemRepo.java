package com.example.Restaurant_management_service_api.respository;

import com.example.Restaurant_management_service_api.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodItemRepo extends JpaRepository<FoodItem,Long> {
}
