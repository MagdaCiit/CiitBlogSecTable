package com.example.secondary_table.rest_controller;

import com.example.secondary_table.entities.Customer;
import com.example.secondary_table.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/customer")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> getAll() {
        return ResponseEntity
                .ok()
                .body(customerService.getAll());
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Customer> save(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String customerNumber
    ) {
        return ResponseEntity
                .ok()
                .body(customerService.saveCustomer(firstName, lastName, customerNumber));
    }

}
