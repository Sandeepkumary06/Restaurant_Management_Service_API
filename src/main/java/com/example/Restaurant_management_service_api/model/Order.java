package com.example.Restaurant_management_service_api.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    private Long orderID;
    private Long FoodItemID;
    private Integer quantity;
    private Long userID;
    private String status;
}
