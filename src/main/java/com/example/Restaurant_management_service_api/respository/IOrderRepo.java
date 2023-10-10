package com.example.Restaurant_management_service_api.respository;

import com.example.Restaurant_management_service_api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Long> {
}
