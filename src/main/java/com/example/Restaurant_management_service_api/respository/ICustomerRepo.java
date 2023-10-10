package com.example.Restaurant_management_service_api.respository;

import com.example.Restaurant_management_service_api.model.Customer;

import java.util.List;

public interface ICustomerRepo {
    void save(Customer customer);

    List<Customer> findAll();

    Customer findFirstByCustomerEmail(String email);
}
