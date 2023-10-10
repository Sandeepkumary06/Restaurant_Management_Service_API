package com.example.Restaurant_management_service_api.service;

import com.example.Restaurant_management_service_api.model.Customer;
import com.example.Restaurant_management_service_api.model.Order;
import com.example.Restaurant_management_service_api.respository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderService {
    @Autowired
    IOrderRepo iorderRepo;
    public List<Order> getAllOrders()
    {
        return iorderRepo.findAll();

    }

    public String getOrderForCustomer(Customer customer) {
        return "Order is Placed";
    }

    public String cancelOrder(Order order) {
        return "Cancel Order";
    }
}
