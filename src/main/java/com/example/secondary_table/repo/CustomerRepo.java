package com.example.secondary_table.repo;

import com.example.secondary_table.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerRepo extends JpaRepository<Customer, Long>, JpaSpecificationExecutor<Customer> {
}
