package com.example.Restaurant_management_service_api.service;

import com.example.Restaurant_management_service_api.model.FoodItem;
import com.example.Restaurant_management_service_api.respository.IFoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    IFoodItemRepo foodItemRepo;

    List<FoodItem> getAllFoodItems()
    {
        return foodItemRepo.findAll();
    }

    public void addFodItem(FoodItem fooditem) {

    }
}
