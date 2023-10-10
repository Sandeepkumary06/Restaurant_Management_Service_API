package com.example.Restaurant_management_service_api.respository;

import com.example.Restaurant_management_service_api.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
