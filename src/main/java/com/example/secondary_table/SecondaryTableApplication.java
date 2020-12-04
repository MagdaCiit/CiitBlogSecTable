package com.example.secondary_table;

import com.example.secondary_table.entities.Customer;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.ResultSet;
import java.util.List;

@SpringBootApplication
public class SecondaryTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondaryTableApplication.class, args);
    }

}
