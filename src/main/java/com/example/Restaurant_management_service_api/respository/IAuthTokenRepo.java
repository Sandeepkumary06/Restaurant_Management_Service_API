package com.example.Restaurant_management_service_api.respository;

import com.example.Restaurant_management_service_api.model.AuthenticationToken;
import com.example.Restaurant_management_service_api.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByCustomer(Customer customer);
}
