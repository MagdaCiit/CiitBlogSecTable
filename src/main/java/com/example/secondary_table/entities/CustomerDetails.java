package com.example.secondary_table.entities;

import com.example.secondary_table.converter.InstantConverter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {
    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_number")
    private String customerNumber;

    @Column(name = "join_date")
    @Convert(converter = InstantConverter.class)
    private Instant joinDate;
}
