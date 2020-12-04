package com.example.secondary_table.entities;

import com.example.secondary_table.converter.InstantConverter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "customer")
@SecondaryTable(name = "customer_details", pkJoinColumns = @PrimaryKeyJoinColumn(name = "customer_id"))
public class Customer {

    //region FIELDS
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "customer_number", table = "customer_details")
    private String customerNumber;

    @Column(name = "join_date", table = "customer_details")
    @Convert(converter = InstantConverter.class)
    private Instant joinDate;
    //endregion

    //region Constructor
    public Customer() {}

    //endregion

    //region GETTERS/ SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Instant getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Instant joinDate) {
        this.joinDate = joinDate;
    }
    //endregion

}
