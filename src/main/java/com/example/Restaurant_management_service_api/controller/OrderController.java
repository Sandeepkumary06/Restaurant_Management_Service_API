package com.example.Restaurant_management_service_api.controller;

import com.example.Restaurant_management_service_api.model.Order;
import com.example.Restaurant_management_service_api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("orders")
    public List<Order> getAllOrders()
    {

        return orderService.getAllOrders();
    }
}
