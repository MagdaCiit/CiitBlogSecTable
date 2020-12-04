package com.example.secondary_table.service;

import com.example.secondary_table.entities.Customer;
import com.example.secondary_table.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getAll() {
        return customerRepo.findAll();
    }

    public Customer saveCustomer(String firstName, String lastName, String customerNumber) {
        Customer cust = new Customer();
        cust.setFirstName(firstName);
        cust.setLastName(lastName);
        cust.setCustomerNumber(customerNumber);
        cust.setJoinDate(Instant.now());
        return customerRepo.save(cust);
    }
}
